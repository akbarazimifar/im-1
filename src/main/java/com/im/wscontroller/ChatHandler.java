package com.im.wscontroller;

import com.im.entity.Group;
import com.im.entity.GroupMessage;
import com.im.entity.PrivateChatMessage;
import com.im.entity.User;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.annotation.WebsocketRequestParam;
import com.im.lib.entity.WsApiResult;
import com.im.service.ChatService;
import com.im.utils.PageUtil;
import com.im.vo.GroupMessageVo;
import io.netty.channel.ChannelId;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@WebsocketHandler
@RestController
public class ChatHandler {

    @Resource
    private ChatService chatService;


//    @WebsocketHandlerMapping("online")
    public WsApiResult online(@WebsocketRequestParam String token, ChannelId channelId) {
        chatService.online(token, channelId);
        return null;
//        return WsApiResult.ok(1, null);
    }


    //    @WebsocketHandlerMapping("ping")
    public WsApiResult ping(@WebsocketRequestParam Long pingId,
                            @WebsocketRequestParam Integer disconnectDelay) {
        return null;
//        return WsApiResult.ok(1, null);
    }

//    @WebsocketHandlerMapping("getChatList")
    public WsApiResult getChatList(ChannelId channelId) {
        PageUtil page = chatService.getChatList(channelId);
        return null;
//        return WsApiResult.ok(1, page);
    }

//    @WebsocketHandlerMapping("getGroupMessage")
    public WsApiResult getGroupMessage(@WebsocketRequestParam Integer groupId,
                                       ChannelId channelId) {
        List<GroupMessage> list = chatService.getGroupMessage(groupId, channelId);


        GroupMessageVo groupMessageVo = new GroupMessageVo();
        groupMessageVo.setList(list);
        groupMessageVo.setGroupId(groupId);

        return null;
//        return WsApiResult.ok(1, groupMessageVo);
    }

//    @WebsocketHandlerMapping("searchGroupVaguely")
    public WsApiResult searchGroup(@WebsocketRequestParam String groupName) {
        List<Group> group = chatService.searchGroupVaguely(groupName);
        return null;
//        return WsApiResult.ok(1, group);
    }

//    @WebsocketHandlerMapping("searchUser")
    public WsApiResult searchChat(@WebsocketRequestParam String email) {
        User user = chatService.searchChat(email);
        return null;
//        return WsApiResult.ok(1, user);
    }

//    @WebsocketHandlerMapping("sendChatMessage")
    public WsApiResult sendChatMessage(PrivateChatMessage privateChatMessage) {
        chatService.sendChatMessage(privateChatMessage);
        return null;
//        return WsApiResult.ok(1, null);
    }
}
