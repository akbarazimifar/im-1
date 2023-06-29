package com.im.redis;

import com.im.lib.entity.SessionInfo;
import com.im.lib.storage.JacksonSerialize;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-02-12
 */

@Component
public class SessionManager {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate<String, SessionInfo> redisTemplate;

    private final String SESSION = "session:";

    private final String PRE_AUTH_KEY = "preAuthKey:";

    private final long PRE_AUTH_KEY_TIMEOUT = 1; // 1 day

    private final String AUTH_KEY = "authKey:";

    public void setPreAuthKey(String authKey) {
        stringRedisTemplate.opsForValue()
                .set(PRE_AUTH_KEY + authKey, authKey, PRE_AUTH_KEY_TIMEOUT, TimeUnit.DAYS);
    }

    public boolean setUserAuthKey(String authKey, long userId) {
        if (Boolean.FALSE.equals(stringRedisTemplate.hasKey(PRE_AUTH_KEY + authKey))) {
            return false;
        }
        stringRedisTemplate.opsForZSet()
                .add(AUTH_KEY + userId, authKey, System.currentTimeMillis());
        return true;
    }

    public SessionInfo getMsgInfo(String authKeyId, long sessionId) {
        Object o = stringRedisTemplate
                .opsForHash()
                .get(SESSION + authKeyId, String.valueOf(sessionId));

        return JacksonSerialize.getObject(String.valueOf(o), SessionInfo.class);
    }

    public void setSessionId(String authKeyId,long sessionId, SessionInfo sessionInfo) {
//        stringRedisTemplate
//                .opsForList()
//                .rightPush(AUTH_KEY_ID_SESSION_ID + authKeyId.toString(), String.valueOf(sessionId));
        stringRedisTemplate
                .opsForHash()
                .put(SESSION + authKeyId, String.valueOf(sessionId), Objects.requireNonNull(JacksonSerialize.getObjectString(sessionInfo)));
    }

    public boolean hasSession(String sessionId) {
        return Boolean.TRUE.equals(redisTemplate.hasKey(SESSION + sessionId));
    }

    public void removeSessionId(String authKeyId, long sessionId) {
        redisTemplate
                .opsForHash()
                .delete(SESSION + authKeyId, String.valueOf(sessionId));

//        redisTemplate.opsForZSet().remove(AUTH_KEY_ID_SESSION_ID + authKeyId.toString(), sessionId);
    }

    public void setSessionInfo(String key, String hashKey, Object value) {
        redisTemplate
                .opsForHash()
                .put(SESSION + key, hashKey, value);
    }

    public Object getSessionInfo(String key, String hashKey) {
        return redisTemplate
                .opsForHash()
                .get(SESSION + key, hashKey);
    }

    public void removeTempSessionInfo(String channelId) {
        String authKeyId = stringRedisTemplate.opsForValue().get(KeyPrefix.CHANNEL_ID_AUTH_KEY_ID + channelId);
        if (!StringUtils.hasLength(authKeyId)) {
            return;
        }
        boolean readyLogin = (boolean) this.getSessionInfo(authKeyId, SessionInfo.READY_LOGIN);
        if (!readyLogin) {
            redisTemplate.delete(SESSION + authKeyId);
            stringRedisTemplate.delete(KeyPrefix.CHANNEL_ID_AUTH_KEY_ID + channelId);
        }
    }
}
