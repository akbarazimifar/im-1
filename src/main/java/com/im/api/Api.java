package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;
import java.util.HashMap;

public class Api {

    @Data
    public static class True {
        private boolean value = true;
    }
	public static class TypeResPQ {}
	public static class TypeP_Q_inner_data {}
	public static class TypeServer_DH_Params {}
	public static class TypeServer_DH_inner_data {}
	public static class TypeClient_DH_Inner_Data {}
	public static class TypeSet_client_DH_params_answer {}
	public static class TypeDestroyAuthKeyRes {}
	public static class TypeMsgsAck {}
	public static class TypeBadMsgNotification {}
	public static class TypeMsgsStateReq {}
	public static class TypeMsgsStateInfo {}
	public static class TypeMsgsAllInfo {}
	public static class TypeMsgDetailedInfo {}
	public static class TypeMsgResendReq {}
	public static class TypeRpcError {}
	public static class TypeRpcDropAnswer {}
	public static class TypeFutureSalt {}
	public static class TypeFutureSalts {}
	public static class TypePong {}
	public static class TypeDestroySessionRes {}
	public static class TypeNewSession {}
	public static class TypeHttpWait {}
	public static class TypeIpPort {}
	public static class TypeAccessPointRule {}
	public static class TypeTlsClientHello {}
	public static class TypeTlsBlock {}
	public static class TypeInputPeer {}
	public static class TypeInputUser {}
	public static class TypeInputContact {}
	public static class TypeInputFile {}
	public static class TypeInputMedia {}
	public static class TypeInputChatPhoto {}
	public static class TypeInputGeoPoint {}
	public static class TypeInputPhoto {}
	public static class TypeInputFileLocation {}
	public static class TypePeer {}
	public static class TypeUser {}
	public static class TypeUserProfilePhoto {}
	public static class TypeUserStatus {}
	public static class TypeChat {}
	public static class TypeChatFull {}
	public static class TypeChatParticipant {}
	public static class TypeChatParticipants {}
	public static class TypeChatPhoto {}
	public static class TypeMessage {}
	public static class TypeMessageMedia {}
	public static class TypeMessageAction {}
	public static class TypeDialog {}
	public static class TypePhoto {}
	public static class TypePhotoSize {}
	public static class TypeGeoPoint {}
	public static class TypeInputNotifyPeer {}
	public static class TypeInputPeerNotifySettings {}
	public static class TypePeerNotifySettings {}
	public static class TypePeerSettings {}
	public static class TypeWallPaper {}
	public static class TypeReportReason {}
	public static class TypeUserFull {}
	public static class TypeContact {}
	public static class TypeImportedContact {}
	public static class TypeContactStatus {}
	public static class TypeMessagesFilter {}
	public static class TypeUpdate {}
	public static class TypeUpdates {}
	public static class TypeDcOption {}
	public static class TypeConfig {}
	public static class TypeNearestDc {}
	public static class TypeEncryptedChat {}
	public static class TypeInputEncryptedChat {}
	public static class TypeEncryptedFile {}
	public static class TypeInputEncryptedFile {}
	public static class TypeEncryptedMessage {}
	public static class TypeInputDocument {}
	public static class TypeDocument {}
	public static class TypeNotifyPeer {}
	public static class TypeSendMessageAction {}
	public static class TypeInputPrivacyKey {}
	public static class TypePrivacyKey {}
	public static class TypeInputPrivacyRule {}
	public static class TypePrivacyRule {}
	public static class TypeAccountDaysTTL {}
	public static class TypeDocumentAttribute {}
	public static class TypeStickerPack {}
	public static class TypeWebPage {}
	public static class TypeAuthorization {}
	public static class TypeReceivedNotifyMessage {}
	public static class TypeExportedChatInvite {}
	public static class TypeChatInvite {}
	public static class TypeInputStickerSet {}
	public static class TypeStickerSet {}
	public static class TypeBotCommand {}
	public static class TypeBotInfo {}
	public static class TypeKeyboardButton {}
	public static class TypeKeyboardButtonRow {}
	public static class TypeReplyMarkup {}
	public static class TypeMessageEntity {}
	public static class TypeInputChannel {}
	public static class TypeMessageRange {}
	public static class TypeChannelMessagesFilter {}
	public static class TypeChannelParticipant {}
	public static class TypeChannelParticipantsFilter {}
	public static class TypeInputBotInlineMessage {}
	public static class TypeInputBotInlineResult {}
	public static class TypeBotInlineMessage {}
	public static class TypeBotInlineResult {}
	public static class TypeExportedMessageLink {}
	public static class TypeMessageFwdHeader {}
	public static class TypeInputBotInlineMessageID {}
	public static class TypeInlineBotSwitchPM {}
	public static class TypeTopPeer {}
	public static class TypeTopPeerCategory {}
	public static class TypeTopPeerCategoryPeers {}
	public static class TypeDraftMessage {}
	public static class TypeStickerSetCovered {}
	public static class TypeMaskCoords {}
	public static class TypeInputStickeredMedia {}
	public static class TypeGame {}
	public static class TypeInputGame {}
	public static class TypeHighScore {}
	public static class TypeRichText {}
	public static class TypePageBlock {}
	public static class TypePhoneCallDiscardReason {}
	public static class TypeDataJSON {}
	public static class TypeLabeledPrice {}
	public static class TypeInvoice {}
	public static class TypePaymentCharge {}
	public static class TypePostAddress {}
	public static class TypePaymentRequestedInfo {}
	public static class TypePaymentSavedCredentials {}
	public static class TypeWebDocument {}
	public static class TypeInputWebDocument {}
	public static class TypeInputWebFileLocation {}
	public static class TypeInputPaymentCredentials {}
	public static class TypeShippingOption {}
	public static class TypeInputStickerSetItem {}
	public static class TypeInputPhoneCall {}
	public static class TypePhoneCall {}
	public static class TypePhoneConnection {}
	public static class TypePhoneCallProtocol {}
	public static class TypeCdnPublicKey {}
	public static class TypeCdnConfig {}
	public static class TypeLangPackString {}
	public static class TypeLangPackDifference {}
	public static class TypeLangPackLanguage {}
	public static class TypeChannelAdminLogEventAction {}
	public static class TypeChannelAdminLogEvent {}
	public static class TypeChannelAdminLogEventsFilter {}
	public static class TypePopularContact {}
	public static class TypeRecentMeUrl {}
	public static class TypeInputSingleMedia {}
	public static class TypeWebAuthorization {}
	public static class TypeInputMessage {}
	public static class TypeInputDialogPeer {}
	public static class TypeDialogPeer {}
	public static class TypeFileHash {}
	public static class TypeInputClientProxy {}
	public static class TypeInputSecureFile {}
	public static class TypeSecureFile {}
	public static class TypeSecureData {}
	public static class TypeSecurePlainData {}
	public static class TypeSecureValueType {}
	public static class TypeSecureValue {}
	public static class TypeInputSecureValue {}
	public static class TypeSecureValueHash {}
	public static class TypeSecureValueError {}
	public static class TypeSecureCredentialsEncrypted {}
	public static class TypeSavedContact {}
	public static class TypePasswordKdfAlgo {}
	public static class TypeSecurePasswordKdfAlgo {}
	public static class TypeSecureSecretSettings {}
	public static class TypeInputCheckPasswordSRP {}
	public static class TypeSecureRequiredType {}
	public static class TypeInputAppEvent {}
	public static class TypeJSONObjectValue {}
	public static class TypeJSONValue {}
	public static class TypePageTableCell {}
	public static class TypePageTableRow {}
	public static class TypePageCaption {}
	public static class TypePageListItem {}
	public static class TypePageListOrderedItem {}
	public static class TypePageRelatedArticle {}
	public static class TypePage {}
	public static class TypePollAnswer {}
	public static class TypePoll {}
	public static class TypePollAnswerVoters {}
	public static class TypePollResults {}
	public static class TypeChatOnlines {}
	public static class TypeStatsURL {}
	public static class TypeChatAdminRights {}
	public static class TypeChatBannedRights {}
	public static class TypeInputWallPaper {}
	public static class TypeCodeSettings {}
	public static class TypeWallPaperSettings {}
	public static class TypeAutoDownloadSettings {}
	public static class TypeEmojiKeyword {}
	public static class TypeEmojiKeywordsDifference {}
	public static class TypeEmojiURL {}
	public static class TypeEmojiLanguage {}
	public static class TypeFolder {}
	public static class TypeInputFolderPeer {}
	public static class TypeFolderPeer {}
	public static class TypeUrlAuthResult {}
	public static class TypeChannelLocation {}
	public static class TypePeerLocated {}
	public static class TypeRestrictionReason {}
	public static class TypeInputTheme {}
	public static class TypeTheme {}
	public static class TypeBaseTheme {}
	public static class TypeInputThemeSettings {}
	public static class TypeThemeSettings {}
	public static class TypeWebPageAttribute {}
	public static class TypeMessageUserVote {}
	public static class TypeBankCardOpenUrl {}
	public static class TypeDialogFilter {}
	public static class TypeDialogFilterSuggested {}
	public static class TypeStatsDateRangeDays {}
	public static class TypeStatsAbsValueAndPrev {}
	public static class TypeStatsPercentValue {}
	public static class TypeStatsGraph {}
	public static class TypeMessageInteractionCounters {}
	public static class TypeVideoSize {}
	public static class TypeStatsGroupTopPoster {}
	public static class TypeStatsGroupTopAdmin {}
	public static class TypeStatsGroupTopInviter {}
	public static class TypeGlobalPrivacySettings {}
	public static class TypeMessageViews {}
	public static class TypeMessageReplyHeader {}
	public static class TypeMessageReplies {}
	public static class TypePeerBlocked {}
	public static class TypeGroupCall {}
	public static class TypeInputGroupCall {}
	public static class TypeGroupCallParticipant {}
	public static class TypeInlineQueryPeerType {}
	public static class TypeChatInviteImporter {}
	public static class TypeChatAdminWithInvites {}
	public static class TypeGroupCallParticipantVideoSourceGroup {}
	public static class TypeGroupCallParticipantVideo {}
	public static class TypeBotCommandScope {}
	public static class TypeSponsoredMessage {}
	public static class TypeSearchResultsCalendarPeriod {}
	public static class TypeSearchResultsPosition {}
	public static class TypeReactionCount {}
	public static class TypeMessageReactions {}
	public static class TypeAvailableReaction {}
	public static class TypeMessagePeerReaction {}
	public static class TypeGroupCallStreamChannel {}
	public static class TypeAttachMenuBotIconColor {}
	public static class TypeAttachMenuBotIcon {}
	public static class TypeAttachMenuBot {}
	public static class TypeAttachMenuBots {}
	public static class TypeAttachMenuBotsBot {}
	public static class TypeWebViewResult {}
	public static class TypeSimpleWebViewResult {}
	public static class TypeWebViewMessageSent {}
	public static class TypeBotMenuButton {}
	public static class TypeNotificationSound {}
	public static class TypeAttachMenuPeerType {}
	public static class TypeInputInvoice {}
	public static class TypeInputStorePaymentPurpose {}
	public static class TypePremiumGiftOption {}
	public static class TypePaymentFormMethod {}
	public static class TypeEmojiStatus {}
	public static class TypeReaction {}
	public static class TypeChatReactions {}
	public static class TypeEmailVerifyPurpose {}
	public static class TypeEmailVerification {}
	public static class TypePremiumSubscriptionOption {}
	public static class TypeSendAsPeer {}
	public static class TypeMessageExtendedMedia {}
	public static class TypeStickerKeyword {}
	public static class TypeUsername {}
	public static class TypeForumTopic {}



	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ResPQ extends Api.TypeResPQ {
		private BigInteger nonce;
		private BigInteger serverNonce;
		private byte[] pq;
		private BigInteger[] serverPublicKeyFingerprints;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PQInnerData extends Api.TypeP_Q_inner_data {
		private byte[] pq;
		private byte[] p;
		private byte[] q;
		private BigInteger nonce;
		private BigInteger serverNonce;
		private BigInteger newNonce;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PQInnerDataDc extends Api.TypeP_Q_inner_data {
		private byte[] pq;
		private byte[] p;
		private byte[] q;
		private BigInteger nonce;
		private BigInteger serverNonce;
		private BigInteger newNonce;
		private int dc;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PQInnerDataTemp extends Api.TypeP_Q_inner_data {
		private byte[] pq;
		private byte[] p;
		private byte[] q;
		private BigInteger nonce;
		private BigInteger serverNonce;
		private BigInteger newNonce;
		private int expiresIn;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PQInnerDataTempDc extends Api.TypeP_Q_inner_data {
		private byte[] pq;
		private byte[] p;
		private byte[] q;
		private BigInteger nonce;
		private BigInteger serverNonce;
		private BigInteger newNonce;
		private int dc;
		private int expiresIn;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ServerDHParamsFail extends Api.TypeServer_DH_Params {
		private BigInteger nonce;
		private BigInteger serverNonce;
		private BigInteger newNonceHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ServerDHParamsOk extends Api.TypeServer_DH_Params {
		private BigInteger nonce;
		private BigInteger serverNonce;
		private byte[] encryptedAnswer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ServerDHInnerData extends Api.TypeServer_DH_inner_data {
		private BigInteger nonce;
		private BigInteger serverNonce;
		private int g;
		private byte[] dhPrime;
		private byte[] gA;
		private int serverTime;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ClientDHInnerData extends Api.TypeClient_DH_Inner_Data {
		private BigInteger nonce;
		private BigInteger serverNonce;
		private BigInteger retryId;
		private byte[] gB;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DhGenOk extends Api.TypeSet_client_DH_params_answer {
		private BigInteger nonce;
		private BigInteger serverNonce;
		private BigInteger newNonceHash1;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DhGenRetry extends Api.TypeSet_client_DH_params_answer {
		private BigInteger nonce;
		private BigInteger serverNonce;
		private BigInteger newNonceHash2;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DhGenFail extends Api.TypeSet_client_DH_params_answer {
		private BigInteger nonce;
		private BigInteger serverNonce;
		private BigInteger newNonceHash3;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DestroyAuthKeyOk extends Api.TypeDestroyAuthKeyRes {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DestroyAuthKeyNone extends Api.TypeDestroyAuthKeyRes {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DestroyAuthKeyFail extends Api.TypeDestroyAuthKeyRes {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MsgsAck extends Api.TypeMsgsAck {
		private BigInteger[] msgIds;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BadMsgNotification extends Api.TypeBadMsgNotification {
		private BigInteger badMsgId;
		private int badMsgSeqno;
		private int errorCode;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BadServerSalt extends Api.TypeBadMsgNotification {
		private BigInteger badMsgId;
		private int badMsgSeqno;
		private int errorCode;
		private BigInteger newServerSalt;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MsgsStateReq extends Api.TypeMsgsStateReq {
		private BigInteger[] msgIds;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MsgsStateInfo extends Api.TypeMsgsStateInfo {
		private BigInteger reqMsgId;
		private String info;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MsgsAllInfo extends Api.TypeMsgsAllInfo {
		private BigInteger[] msgIds;
		private String info;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MsgDetailedInfo extends Api.TypeMsgDetailedInfo {
		private BigInteger msgId;
		private BigInteger answerMsgId;
		private int bytes;
		private int status;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MsgNewDetailedInfo extends Api.TypeMsgDetailedInfo {
		private BigInteger answerMsgId;
		private int bytes;
		private int status;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MsgResendReq extends Api.TypeMsgResendReq {
		private BigInteger[] msgIds;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RpcError extends Api.TypeRpcError {
		private int errorCode;
		private String errorMessage;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RpcAnswerUnknown extends Api.TypeRpcDropAnswer {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RpcAnswerDroppedRunning extends Api.TypeRpcDropAnswer {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RpcAnswerDropped extends Api.TypeRpcDropAnswer {
		private BigInteger msgId;
		private int seqNo;
		private int bytes;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class FutureSalt extends Api.TypeFutureSalt {
		private int validSince;
		private int validUntil;
		private BigInteger salt;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class FutureSalts extends Api.TypeFutureSalts {
		private BigInteger reqMsgId;
		private int now;

		private Api.FutureSalt[] salts;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Pong extends Api.TypePong {
		private BigInteger msgId;
		private BigInteger pingId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DestroySessionOk extends Api.TypeDestroySessionRes {
		private BigInteger sessionId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DestroySessionNone extends Api.TypeDestroySessionRes {
		private BigInteger sessionId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class NewSessionCreated extends Api.TypeNewSession {
		private BigInteger firstMsgId;
		private BigInteger uniqueId;
		private BigInteger serverSalt;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class HttpWait extends Api.TypeHttpWait {
		private int maxDelay;
		private int waitAfter;
		private int maxWait;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class IpPort extends Api.TypeIpPort {
		private int ipv4;
		private int port;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class IpPortSecret extends Api.TypeIpPort {
		private int ipv4;
		private int port;
		private byte[] secret;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AccessPointRule extends Api.TypeAccessPointRule {
		private String phonePrefixRules;
		private int dcId;
		private Api.TypeIpPort[] ips;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TlsClientHello extends Api.TypeTlsClientHello {
		private Api.TypeTlsBlock[] blocks;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TlsBlockString extends Api.TypeTlsBlock {
		private String data;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TlsBlockRandom extends Api.TypeTlsBlock {
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TlsBlockZero extends Api.TypeTlsBlock {
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TlsBlockDomain extends Api.TypeTlsBlock {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TlsBlockGrease extends Api.TypeTlsBlock {
		private int seed;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TlsBlockScope extends Api.TypeTlsBlock {
		private Api.TypeTlsBlock[] entries;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPeerEmpty extends Api.TypeInputPeer {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPeerSelf extends Api.TypeInputPeer {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPeerChat extends Api.TypeInputPeer {
		private BigInteger chatId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPeerUser extends Api.TypeInputPeer {
		private BigInteger userId;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPeerChannel extends Api.TypeInputPeer {
		private BigInteger channelId;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPeerUserFromMessage extends Api.TypeInputPeer {
		private Api.TypeInputPeer peer;
		private int msgId;
		private BigInteger userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPeerChannelFromMessage extends Api.TypeInputPeer {
		private Api.TypeInputPeer peer;
		private int msgId;
		private BigInteger channelId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputUserEmpty extends Api.TypeInputUser {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputUserSelf extends Api.TypeInputUser {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputUser extends Api.TypeInputUser {
		private BigInteger userId;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputUserFromMessage extends Api.TypeInputUser {
		private Api.TypeInputPeer peer;
		private int msgId;
		private BigInteger userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPhoneContact extends Api.TypeInputContact {
		private BigInteger clientId;
		private String phone;
		private String firstName;
		private String lastName;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputFile extends Api.TypeInputFile {
		private BigInteger id;
		private int parts;
		private String name;
		private String md5Checksum;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputFileBig extends Api.TypeInputFile {
		private BigInteger id;
		private int parts;
		private String name;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaEmpty extends Api.TypeInputMedia {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaUploadedPhoto extends Api.TypeInputMedia {
		private Api.TypeInputFile file;
		private Api.TypeInputDocument[] stickers;
		private int ttlSeconds;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaPhoto extends Api.TypeInputMedia {
		private Api.TypeInputPhoto id;
		private int ttlSeconds;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaGeoPoint extends Api.TypeInputMedia {
		private Api.TypeInputGeoPoint geoPoint;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaContact extends Api.TypeInputMedia {
		private String phoneNumber;
		private String firstName;
		private String lastName;
		private String vcard;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaUploadedDocument extends Api.TypeInputMedia {
		private Boolean nosoundVideo;
		private Boolean forceFile;
		private Api.TypeInputFile file;
		private Api.TypeInputFile thumb;
		private String mimeType;
		private Api.TypeDocumentAttribute[] attributes;
		private Api.TypeInputDocument[] stickers;
		private int ttlSeconds;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaDocument extends Api.TypeInputMedia {
		private Api.TypeInputDocument id;
		private int ttlSeconds;
		private String query;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaVenue extends Api.TypeInputMedia {
		private Api.TypeInputGeoPoint geoPoint;
		private String title;
		private String address;
		private String provider;
		private String venueId;
		private String venueType;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaPhotoExternal extends Api.TypeInputMedia {
		private String url;
		private int ttlSeconds;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaDocumentExternal extends Api.TypeInputMedia {
		private String url;
		private int ttlSeconds;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaGame extends Api.TypeInputMedia {
		private Api.TypeInputGame id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaInvoice extends Api.TypeInputMedia {
		private String title;
		private String description;
		private Api.TypeInputWebDocument photo;
		private Api.TypeInvoice invoice;
		private byte[] payload;
		private String provider;
		private Api.TypeDataJSON providerData;
		private String startParam;
		private Api.TypeInputMedia extendedMedia;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaGeoLive extends Api.TypeInputMedia {
		private Boolean stopped;
		private Api.TypeInputGeoPoint geoPoint;
		private int heading;
		private int period;
		private int proximityNotificationRadius;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaPoll extends Api.TypeInputMedia {
		private Api.TypePoll poll;
		private byte[][] correctAnswers;
		private String solution;
		private Api.TypeMessageEntity[] solutionEntities;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMediaDice extends Api.TypeInputMedia {
		private String emoticon;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputChatPhotoEmpty extends Api.TypeInputChatPhoto {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputChatUploadedPhoto extends Api.TypeInputChatPhoto {
		private Api.TypeInputFile file;
		private Api.TypeInputFile video;
		private double videoStartTs;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputChatPhoto extends Api.TypeInputChatPhoto {
		private Api.TypeInputPhoto id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputGeoPointEmpty extends Api.TypeInputGeoPoint {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputGeoPoint extends Api.TypeInputGeoPoint {
		private double lat;
		private double longSuffix;
		private int accuracyRadius;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPhotoEmpty extends Api.TypeInputPhoto {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPhoto extends Api.TypeInputPhoto {
		private BigInteger id;
		private BigInteger accessHash;
		private byte[] fileReference;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputFileLocation extends Api.TypeInputFileLocation {
		private BigInteger volumeId;
		private int localId;
		private BigInteger secret;
		private byte[] fileReference;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputEncryptedFileLocation extends Api.TypeInputFileLocation {
		private BigInteger id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputDocumentFileLocation extends Api.TypeInputFileLocation {
		private BigInteger id;
		private BigInteger accessHash;
		private byte[] fileReference;
		private String thumbSize;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputSecureFileLocation extends Api.TypeInputFileLocation {
		private BigInteger id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputTakeoutFileLocation extends Api.TypeInputFileLocation {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPhotoFileLocation extends Api.TypeInputFileLocation {
		private BigInteger id;
		private BigInteger accessHash;
		private byte[] fileReference;
		private String thumbSize;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPhotoLegacyFileLocation extends Api.TypeInputFileLocation {
		private BigInteger id;
		private BigInteger accessHash;
		private byte[] fileReference;
		private BigInteger volumeId;
		private int localId;
		private BigInteger secret;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPeerPhotoFileLocation extends Api.TypeInputFileLocation {
		private Boolean big;
		private Api.TypeInputPeer peer;
		private BigInteger photoId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetThumb extends Api.TypeInputFileLocation {
		private Api.TypeInputStickerSet stickerset;
		private int thumbVersion;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputGroupCallStream extends Api.TypeInputFileLocation {
		private Api.TypeInputGroupCall call;
		private BigInteger timeMs;
		private int scale;
		private int videoChannel;
		private int videoQuality;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PeerUser extends Api.TypePeer {
		private BigInteger userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PeerChat extends Api.TypePeer {
		private BigInteger chatId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PeerChannel extends Api.TypePeer {
		private BigInteger channelId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UserEmpty extends Api.TypeUser {
		private BigInteger id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class User extends Api.TypeUser {
		private Boolean self;
		private Boolean contact;
		private Boolean mutualContact;
		private Boolean deleted;
		private Boolean bot;
		private Boolean botChatHistory;
		private Boolean botNochats;
		private Boolean verified;
		private Boolean restricted;
		private Boolean min;
		private Boolean botInlineGeo;
		private Boolean support;
		private Boolean scam;
		private Boolean applyMinPhoto;
		private Boolean fake;
		private Boolean botAttachMenu;
		private Boolean premium;
		private Boolean attachMenuEnabled;
		private BigInteger id;
		private BigInteger accessHash;
		private String firstName;
		private String lastName;
		private String username;
		private String phone;
		private Api.TypeUserProfilePhoto photo;
		private Api.TypeUserStatus status;
		private int botInfoVersion;
		private Api.TypeRestrictionReason[] restrictionReason;
		private String botInlinePlaceholder;
		private String langCode;
		private Api.TypeEmojiStatus emojiStatus;
		private Api.TypeUsername[] usernames;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UserProfilePhotoEmpty extends Api.TypeUserProfilePhoto {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UserProfilePhoto extends Api.TypeUserProfilePhoto {
		private Boolean hasVideo;
		private BigInteger photoId;
		private byte[] strippedThumb;
		private int dcId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UserStatusEmpty extends Api.TypeUserStatus {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UserStatusOnline extends Api.TypeUserStatus {
		private int expires;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UserStatusOffline extends Api.TypeUserStatus {
		private int wasOnline;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UserStatusRecently extends Api.TypeUserStatus {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UserStatusLastWeek extends Api.TypeUserStatus {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UserStatusLastMonth extends Api.TypeUserStatus {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatEmpty extends Api.TypeChat {
		private BigInteger id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Chat extends Api.TypeChat {
		private Boolean creator;
		private Boolean left;
		private Boolean deactivated;
		private Boolean callActive;
		private Boolean callNotEmpty;
		private Boolean noforwards;
		private BigInteger id;
		private String title;
		private Api.TypeChatPhoto photo;
		private int participantsCount;
		private int date;
		private int version;
		private Api.TypeInputChannel migratedTo;
		private Api.TypeChatAdminRights adminRights;
		private Api.TypeChatBannedRights defaultBannedRights;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatForbidden extends Api.TypeChat {
		private BigInteger id;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Channel extends Api.TypeChat {
		private Boolean creator;
		private Boolean left;
		private Boolean broadcast;
		private Boolean verified;
		private Boolean megagroup;
		private Boolean restricted;
		private Boolean signatures;
		private Boolean min;
		private Boolean scam;
		private Boolean hasLink;
		private Boolean hasGeo;
		private Boolean slowmodeEnabled;
		private Boolean callActive;
		private Boolean callNotEmpty;
		private Boolean fake;
		private Boolean gigagroup;
		private Boolean noforwards;
		private Boolean joinToSend;
		private Boolean joinRequest;
		private Boolean forum;
		private BigInteger id;
		private BigInteger accessHash;
		private String title;
		private String username;
		private Api.TypeChatPhoto photo;
		private int date;
		private Api.TypeRestrictionReason[] restrictionReason;
		private Api.TypeChatAdminRights adminRights;
		private Api.TypeChatBannedRights bannedRights;
		private Api.TypeChatBannedRights defaultBannedRights;
		private int participantsCount;
		private Api.TypeUsername[] usernames;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelForbidden extends Api.TypeChat {
		private Boolean broadcast;
		private Boolean megagroup;
		private BigInteger id;
		private BigInteger accessHash;
		private String title;
		private int untilDate;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatFull extends Api.TypeChatFull {
		private Boolean canSetUsername;
		private Boolean hasScheduled;
		private BigInteger id;
		private String about;
		private Api.TypeChatParticipants participants;
		private Api.TypePhoto chatPhoto;
		private Api.TypePeerNotifySettings notifySettings;
		private Api.TypeExportedChatInvite exportedInvite;
		private Api.TypeBotInfo[] botInfo;
		private int pinnedMsgId;
		private int folderId;
		private Api.TypeInputGroupCall call;
		private int ttlPeriod;
		private Api.TypePeer groupcallDefaultJoinAs;
		private String themeEmoticon;
		private int requestsPending;
		private BigInteger[] recentRequesters;
		private Api.TypeChatReactions availableReactions;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelFull extends Api.TypeChatFull {
		private Boolean canViewParticipants;
		private Boolean canSetUsername;
		private Boolean canSetStickers;
		private Boolean hiddenPrehistory;
		private Boolean canSetLocation;
		private Boolean hasScheduled;
		private Boolean canViewStats;
		private Boolean blocked;
		private Boolean canDeleteChannel;
		private BigInteger id;
		private String about;
		private int participantsCount;
		private int adminsCount;
		private int kickedCount;
		private int bannedCount;
		private int onlineCount;
		private int readInboxMaxId;
		private int readOutboxMaxId;
		private int unreadCount;
		private Api.TypePhoto chatPhoto;
		private Api.TypePeerNotifySettings notifySettings;
		private Api.TypeExportedChatInvite exportedInvite;
		private Api.TypeBotInfo[] botInfo;
		private BigInteger migratedFromChatId;
		private int migratedFromMaxId;
		private int pinnedMsgId;
		private Api.TypeStickerSet stickerset;
		private int availableMinId;
		private int folderId;
		private BigInteger linkedChatId;
		private Api.TypeChannelLocation location;
		private int slowmodeSeconds;
		private int slowmodeNextSendDate;
		private int statsDc;
		private int pts;
		private Api.TypeInputGroupCall call;
		private int ttlPeriod;
		private String[] pendingSuggestions;
		private Api.TypePeer groupcallDefaultJoinAs;
		private String themeEmoticon;
		private int requestsPending;
		private BigInteger[] recentRequesters;
		private Api.TypePeer defaultSendAs;
		private Api.TypeChatReactions availableReactions;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatParticipant extends Api.TypeChatParticipant {
		private BigInteger userId;
		private BigInteger inviterId;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatParticipantCreator extends Api.TypeChatParticipant {
		private BigInteger userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatParticipantAdmin extends Api.TypeChatParticipant {
		private BigInteger userId;
		private BigInteger inviterId;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatParticipantsForbidden extends Api.TypeChatParticipants {
		private BigInteger chatId;
		private Api.TypeChatParticipant selfParticipant;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatParticipants extends Api.TypeChatParticipants {
		private BigInteger chatId;
		private Api.TypeChatParticipant[] participants;
		private int version;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatPhotoEmpty extends Api.TypeChatPhoto {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatPhoto extends Api.TypeChatPhoto {
		private Boolean hasVideo;
		private BigInteger photoId;
		private byte[] strippedThumb;
		private int dcId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEmpty extends Api.TypeMessage {
		private int id;
		private Api.TypePeer peerId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Message extends Api.TypeMessage {
		private Boolean out;
		private Boolean mentioned;
		private Boolean mediaUnread;
		private Boolean silent;
		private Boolean post;
		private Boolean fromScheduled;
		private Boolean legacy;
		private Boolean editHide;
		private Boolean pinned;
		private Boolean noforwards;
		private int id;
		private Api.TypePeer fromId;
		private Api.TypePeer peerId;
		private Api.TypeMessageFwdHeader fwdFrom;
		private BigInteger viaBotId;
		private Api.TypeMessageReplyHeader replyTo;
		private int date;
		private String message;
		private Api.TypeMessageMedia media;
		private Api.TypeReplyMarkup replyMarkup;
		private Api.TypeMessageEntity[] entities;
		private int views;
		private int forwards;
		private Api.TypeMessageReplies replies;
		private int editDate;
		private String postAuthor;
		private BigInteger groupedId;
		private Api.TypeMessageReactions reactions;
		private Api.TypeRestrictionReason[] restrictionReason;
		private int ttlPeriod;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageService extends Api.TypeMessage {
		private Boolean out;
		private Boolean mentioned;
		private Boolean mediaUnread;
		private Boolean silent;
		private Boolean post;
		private Boolean legacy;
		private int id;
		private Api.TypePeer fromId;
		private Api.TypePeer peerId;
		private Api.TypeMessageReplyHeader replyTo;
		private int date;
		private Api.TypeMessageAction action;
		private int ttlPeriod;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaEmpty extends Api.TypeMessageMedia {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaPhoto extends Api.TypeMessageMedia {
		private Api.TypePhoto photo;
		private int ttlSeconds;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaGeo extends Api.TypeMessageMedia {
		private Api.TypeGeoPoint geo;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaContact extends Api.TypeMessageMedia {
		private String phoneNumber;
		private String firstName;
		private String lastName;
		private String vcard;
		private BigInteger userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaUnsupported extends Api.TypeMessageMedia {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaDocument extends Api.TypeMessageMedia {
		private Boolean nopremium;
		private Api.TypeDocument document;
		private int ttlSeconds;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaWebPage extends Api.TypeMessageMedia {
		private Api.TypeWebPage webpage;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaVenue extends Api.TypeMessageMedia {
		private Api.TypeGeoPoint geo;
		private String title;
		private String address;
		private String provider;
		private String venueId;
		private String venueType;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaGame extends Api.TypeMessageMedia {
		private Api.TypeGame game;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaInvoice extends Api.TypeMessageMedia {
		private Boolean shippingAddressRequested;
		private Boolean test;
		private String title;
		private String description;
		private Api.TypeWebDocument photo;
		private int receiptMsgId;
		private String currency;
		private BigInteger totalAmount;
		private String startParam;
		private Api.TypeMessageExtendedMedia extendedMedia;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaGeoLive extends Api.TypeMessageMedia {
		private Api.TypeGeoPoint geo;
		private int heading;
		private int period;
		private int proximityNotificationRadius;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaPoll extends Api.TypeMessageMedia {
		private Api.TypePoll poll;
		private Api.TypePollResults results;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageMediaDice extends Api.TypeMessageMedia {
		private int value;
		private String emoticon;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionEmpty extends Api.TypeMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionChatCreate extends Api.TypeMessageAction {
		private String title;
		private BigInteger[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionChatEditTitle extends Api.TypeMessageAction {
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionChatEditPhoto extends Api.TypeMessageAction {
		private Api.TypePhoto photo;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionChatDeletePhoto extends Api.TypeMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionChatAddUser extends Api.TypeMessageAction {
		private BigInteger[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionChatDeleteUser extends Api.TypeMessageAction {
		private BigInteger userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionChatJoinedByLink extends Api.TypeMessageAction {
		private BigInteger inviterId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionChannelCreate extends Api.TypeMessageAction {
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionChatMigrateTo extends Api.TypeMessageAction {
		private BigInteger channelId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionChannelMigrateFrom extends Api.TypeMessageAction {
		private String title;
		private BigInteger chatId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionPinMessage extends Api.TypeMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionHistoryClear extends Api.TypeMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionGameScore extends Api.TypeMessageAction {
		private BigInteger gameId;
		private int score;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionPaymentSentMe extends Api.TypeMessageAction {
		private Boolean recurringInit;
		private Boolean recurringUsed;
		private String currency;
		private BigInteger totalAmount;
		private byte[] payload;
		private Api.TypePaymentRequestedInfo info;
		private String shippingOptionId;
		private Api.TypePaymentCharge charge;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionPaymentSent extends Api.TypeMessageAction {
		private Boolean recurringInit;
		private Boolean recurringUsed;
		private String currency;
		private BigInteger totalAmount;
		private String invoiceSlug;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionPhoneCall extends Api.TypeMessageAction {
		private Boolean video;
		private BigInteger callId;
		private Api.TypePhoneCallDiscardReason reason;
		private int duration;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionScreenshotTaken extends Api.TypeMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionCustomAction extends Api.TypeMessageAction {
		private String message;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionBotAllowed extends Api.TypeMessageAction {
		private String domain;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionSecureValuesSentMe extends Api.TypeMessageAction {
		private Api.TypeSecureValue[] values;
		private Api.TypeSecureCredentialsEncrypted credentials;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionSecureValuesSent extends Api.TypeMessageAction {
		private Api.TypeSecureValueType[] types;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionContactSignUp extends Api.TypeMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionGeoProximityReached extends Api.TypeMessageAction {
		private Api.TypePeer fromId;
		private Api.TypePeer toId;
		private int distance;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionGroupCall extends Api.TypeMessageAction {
		private Api.TypeInputGroupCall call;
		private int duration;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionInviteToGroupCall extends Api.TypeMessageAction {
		private Api.TypeInputGroupCall call;
		private BigInteger[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionSetMessagesTTL extends Api.TypeMessageAction {
		private int period;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionGroupCallScheduled extends Api.TypeMessageAction {
		private Api.TypeInputGroupCall call;
		private int scheduleDate;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionSetChatTheme extends Api.TypeMessageAction {
		private String emoticon;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionChatJoinedByRequest extends Api.TypeMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionWebViewDataSentMe extends Api.TypeMessageAction {
		private String text;
		private String data;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionWebViewDataSent extends Api.TypeMessageAction {
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionGiftPremium extends Api.TypeMessageAction {
		private String currency;
		private BigInteger amount;
		private int months;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionTopicCreate extends Api.TypeMessageAction {
		private String title;
		private int iconColor;
		private BigInteger iconEmojiId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageActionTopicEdit extends Api.TypeMessageAction {
		private String title;
		private BigInteger iconEmojiId;
		private Boolean closed;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Dialog extends Api.TypeDialog {
		private Boolean pinned;
		private Boolean unreadMark;
		private Api.TypePeer peer;
		private int topMessage;
		private int readInboxMaxId;
		private int readOutboxMaxId;
		private int unreadCount;
		private int unreadMentionsCount;
		private int unreadReactionsCount;
		private Api.TypePeerNotifySettings notifySettings;
		private int pts;
		private Api.TypeDraftMessage draft;
		private int folderId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DialogFolder extends Api.TypeDialog {
		private Boolean pinned;
		private Api.TypeFolder folder;
		private Api.TypePeer peer;
		private int topMessage;
		private int unreadMutedPeersCount;
		private int unreadUnmutedPeersCount;
		private int unreadMutedMessagesCount;
		private int unreadUnmutedMessagesCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhotoEmpty extends Api.TypePhoto {
		private BigInteger id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Photo extends Api.TypePhoto {
		private Boolean hasStickers;
		private BigInteger id;
		private BigInteger accessHash;
		private byte[] fileReference;
		private int date;
		private Api.TypePhotoSize[] sizes;
		private Api.TypeVideoSize[] videoSizes;
		private int dcId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhotoSizeEmpty extends Api.TypePhotoSize {
		private String type;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhotoSize extends Api.TypePhotoSize {
		private String type;
		private int w;
		private int h;
		private int size;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhotoCachedSize extends Api.TypePhotoSize {
		private String type;
		private int w;
		private int h;
		private byte[] bytes;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhotoStrippedSize extends Api.TypePhotoSize {
		private String type;
		private byte[] bytes;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhotoSizeProgressive extends Api.TypePhotoSize {
		private String type;
		private int w;
		private int h;
		private int[] sizes;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhotoPathSize extends Api.TypePhotoSize {
		private String type;
		private byte[] bytes;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GeoPointEmpty extends Api.TypeGeoPoint {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GeoPoint extends Api.TypeGeoPoint {
		private double longSuffix;
		private double lat;
		private BigInteger accessHash;
		private int accuracyRadius;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputNotifyPeer extends Api.TypeInputNotifyPeer {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputNotifyUsers extends Api.TypeInputNotifyPeer {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputNotifyChats extends Api.TypeInputNotifyPeer {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputNotifyBroadcasts extends Api.TypeInputNotifyPeer {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputNotifyForumTopic extends Api.TypeInputNotifyPeer {
		private Api.TypeInputPeer peer;
		private int topMsgId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPeerNotifySettings extends Api.TypeInputPeerNotifySettings {
		private Boolean showPreviews;
		private Boolean silent;
		private int muteUntil;
		private Api.TypeNotificationSound sound;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PeerNotifySettings extends Api.TypePeerNotifySettings {
		private Boolean showPreviews;
		private Boolean silent;
		private int muteUntil;
		private Api.TypeNotificationSound iosSound;
		private Api.TypeNotificationSound androidSound;
		private Api.TypeNotificationSound otherSound;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PeerSettings extends Api.TypePeerSettings {
		private Boolean reportSpam;
		private Boolean addContact;
		private Boolean blockContact;
		private Boolean shareContact;
		private Boolean needContactsException;
		private Boolean reportGeo;
		private Boolean autoarchived;
		private Boolean inviteMembers;
		private Boolean requestChatBroadcast;
		private int geoDistance;
		private String requestChatTitle;
		private int requestChatDate;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WallPaper extends Api.TypeWallPaper {
		private BigInteger id;
		private Boolean creator;
		private Boolean defaultSuffix;
		private Boolean pattern;
		private Boolean dark;
		private BigInteger accessHash;
		private String slug;
		private Api.TypeDocument document;
		private Api.TypeWallPaperSettings settings;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WallPaperNoFile extends Api.TypeWallPaper {
		private BigInteger id;
		private Boolean defaultSuffix;
		private Boolean dark;
		private Api.TypeWallPaperSettings settings;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputReportReasonSpam extends Api.TypeReportReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputReportReasonViolence extends Api.TypeReportReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputReportReasonPornography extends Api.TypeReportReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputReportReasonChildAbuse extends Api.TypeReportReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputReportReasonOther extends Api.TypeReportReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputReportReasonCopyright extends Api.TypeReportReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputReportReasonGeoIrrelevant extends Api.TypeReportReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputReportReasonFake extends Api.TypeReportReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputReportReasonIllegalDrugs extends Api.TypeReportReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputReportReasonPersonalDetails extends Api.TypeReportReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UserFull extends Api.TypeUserFull {
		private Boolean blocked;
		private Boolean phoneCallsAvailable;
		private Boolean phoneCallsPrivate;
		private Boolean canPinMessage;
		private Boolean hasScheduled;
		private Boolean videoCallsAvailable;
		private Boolean voiceMessagesForbidden;
		private BigInteger id;
		private String about;
		private Api.TypePeerSettings settings;
		private Api.TypePhoto profilePhoto;
		private Api.TypePeerNotifySettings notifySettings;
		private Api.TypeBotInfo botInfo;
		private int pinnedMsgId;
		private int commonChatsCount;
		private int folderId;
		private int ttlPeriod;
		private String themeEmoticon;
		private String privateForwardName;
		private Api.TypeChatAdminRights botGroupAdminRights;
		private Api.TypeChatAdminRights botBroadcastAdminRights;
		private Api.TypePremiumGiftOption[] premiumGifts;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Contact extends Api.TypeContact {
		private BigInteger userId;
		private Boolean mutual;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ImportedContact extends Api.TypeImportedContact {
		private BigInteger userId;
		private BigInteger clientId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ContactStatus extends Api.TypeContactStatus {
		private BigInteger userId;
		private Api.TypeUserStatus status;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterEmpty extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterPhotos extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterVideo extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterPhotoVideo extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterDocument extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterUrl extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterGif extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterVoice extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterMusic extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterChatPhotos extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterPhoneCalls extends Api.TypeMessagesFilter {
		private Boolean missed;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterRoundVoice extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterRoundVideo extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterMyMentions extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterGeo extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterContacts extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagesFilterPinned extends Api.TypeMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateNewMessage extends Api.TypeUpdate {
		private Api.TypeMessage message;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateMessageID extends Api.TypeUpdate {
		private int id;
		private BigInteger randomId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateDeleteMessages extends Api.TypeUpdate {
		private int[] messages;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateUserTyping extends Api.TypeUpdate {
		private BigInteger userId;
		private Api.TypeSendMessageAction action;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChatUserTyping extends Api.TypeUpdate {
		private BigInteger chatId;
		private Api.TypePeer fromId;
		private Api.TypeSendMessageAction action;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChatParticipants extends Api.TypeUpdate {
		private Api.TypeChatParticipants participants;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateUserStatus extends Api.TypeUpdate {
		private BigInteger userId;
		private Api.TypeUserStatus status;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateUserName extends Api.TypeUpdate {
		private BigInteger userId;
		private String firstName;
		private String lastName;
		private Api.TypeUsername[] usernames;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateUserPhoto extends Api.TypeUpdate {
		private BigInteger userId;
		private int date;
		private Api.TypeUserProfilePhoto photo;
		private Boolean previous;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateNewEncryptedMessage extends Api.TypeUpdate {
		private Api.TypeEncryptedMessage message;
		private int qts;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateEncryptedChatTyping extends Api.TypeUpdate {
		private int chatId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateEncryption extends Api.TypeUpdate {
		private Api.TypeEncryptedChat chat;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateEncryptedMessagesRead extends Api.TypeUpdate {
		private int chatId;
		private int maxDate;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChatParticipantAdd extends Api.TypeUpdate {
		private BigInteger chatId;
		private BigInteger userId;
		private BigInteger inviterId;
		private int date;
		private int version;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChatParticipantDelete extends Api.TypeUpdate {
		private BigInteger chatId;
		private BigInteger userId;
		private int version;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateDcOptions extends Api.TypeUpdate {
		private Api.TypeDcOption[] dcOptions;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateNotifySettings extends Api.TypeUpdate {
		private Api.TypeNotifyPeer peer;
		private Api.TypePeerNotifySettings notifySettings;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateServiceNotification extends Api.TypeUpdate {
		private Boolean popup;
		private int inboxDate;
		private String type;
		private String message;
		private Api.TypeMessageMedia media;
		private Api.TypeMessageEntity[] entities;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePrivacy extends Api.TypeUpdate {
		private Api.TypePrivacyKey key;
		private Api.TypePrivacyRule[] rules;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateUserPhone extends Api.TypeUpdate {
		private BigInteger userId;
		private String phone;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateReadHistoryInbox extends Api.TypeUpdate {
		private int folderId;
		private Api.TypePeer peer;
		private int maxId;
		private int stillUnreadCount;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateReadHistoryOutbox extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private int maxId;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateWebPage extends Api.TypeUpdate {
		private Api.TypeWebPage webpage;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateReadMessagesContents extends Api.TypeUpdate {
		private int[] messages;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChannelTooLong extends Api.TypeUpdate {
		private BigInteger channelId;
		private int pts;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChannel extends Api.TypeUpdate {
		private BigInteger channelId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateNewChannelMessage extends Api.TypeUpdate {
		private Api.TypeMessage message;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateReadChannelInbox extends Api.TypeUpdate {
		private int folderId;
		private BigInteger channelId;
		private int maxId;
		private int stillUnreadCount;
		private int pts;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateDeleteChannelMessages extends Api.TypeUpdate {
		private BigInteger channelId;
		private int[] messages;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChannelMessageViews extends Api.TypeUpdate {
		private BigInteger channelId;
		private int id;
		private int views;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChatParticipantAdmin extends Api.TypeUpdate {
		private BigInteger chatId;
		private BigInteger userId;
		private Boolean isAdmin;
		private int version;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateNewStickerSet extends Api.TypeUpdate {
		private MessagesApi.TypeStickerSet stickerset;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateStickerSetsOrder extends Api.TypeUpdate {
		private Boolean masks;
		private Boolean emojis;
		private BigInteger[] order;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateStickerSets extends Api.TypeUpdate {
		private Boolean masks;
		private Boolean emojis;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateSavedGifs extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateBotInlineQuery extends Api.TypeUpdate {
		private BigInteger queryId;
		private BigInteger userId;
		private String query;
		private Api.TypeGeoPoint geo;
		private Api.TypeInlineQueryPeerType peerType;
		private String offset;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateBotInlineSend extends Api.TypeUpdate {
		private BigInteger userId;
		private String query;
		private Api.TypeGeoPoint geo;
		private String id;
		private Api.TypeInputBotInlineMessageID msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateEditChannelMessage extends Api.TypeUpdate {
		private Api.TypeMessage message;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateBotCallbackQuery extends Api.TypeUpdate {
		private BigInteger queryId;
		private BigInteger userId;
		private Api.TypePeer peer;
		private int msgId;
		private BigInteger chatInstance;
		private byte[] data;
		private String gameShortName;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateEditMessage extends Api.TypeUpdate {
		private Api.TypeMessage message;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateInlineBotCallbackQuery extends Api.TypeUpdate {
		private BigInteger queryId;
		private BigInteger userId;
		private Api.TypeInputBotInlineMessageID msgId;
		private BigInteger chatInstance;
		private byte[] data;
		private String gameShortName;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateReadChannelOutbox extends Api.TypeUpdate {
		private BigInteger channelId;
		private int maxId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateDraftMessage extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private int topMsgId;
		private Api.TypeDraftMessage draft;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateReadFeaturedStickers extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateRecentStickers extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateConfig extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePtsChanged extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChannelWebPage extends Api.TypeUpdate {
		private BigInteger channelId;
		private Api.TypeWebPage webpage;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateDialogPinned extends Api.TypeUpdate {
		private Boolean pinned;
		private int folderId;
		private Api.TypeDialogPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePinnedDialogs extends Api.TypeUpdate {
		private int folderId;
		private Api.TypeDialogPeer[] order;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateBotWebhookJSON extends Api.TypeUpdate {
		private Api.TypeDataJSON data;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateBotWebhookJSONQuery extends Api.TypeUpdate {
		private BigInteger queryId;
		private Api.TypeDataJSON data;
		private int timeout;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateBotShippingQuery extends Api.TypeUpdate {
		private BigInteger queryId;
		private BigInteger userId;
		private byte[] payload;
		private Api.TypePostAddress shippingAddress;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateBotPrecheckoutQuery extends Api.TypeUpdate {
		private BigInteger queryId;
		private BigInteger userId;
		private byte[] payload;
		private Api.TypePaymentRequestedInfo info;
		private String shippingOptionId;
		private String currency;
		private BigInteger totalAmount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePhoneCall extends Api.TypeUpdate {
		private Api.TypePhoneCall phoneCall;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateLangPackTooLong extends Api.TypeUpdate {
		private String langCode;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateLangPack extends Api.TypeUpdate {
		private Api.TypeLangPackDifference difference;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateFavedStickers extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChannelReadMessagesContents extends Api.TypeUpdate {
		private BigInteger channelId;
		private int topMsgId;
		private int[] messages;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateContactsReset extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChannelAvailableMessages extends Api.TypeUpdate {
		private BigInteger channelId;
		private int availableMinId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateDialogUnreadMark extends Api.TypeUpdate {
		private Boolean unread;
		private Api.TypeDialogPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateMessagePoll extends Api.TypeUpdate {
		private BigInteger pollId;
		private Api.TypePoll poll;
		private Api.TypePollResults results;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChatDefaultBannedRights extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private Api.TypeChatBannedRights defaultBannedRights;
		private int version;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateFolderPeers extends Api.TypeUpdate {
		private Api.TypeFolderPeer[] folderPeers;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePeerSettings extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private Api.TypePeerSettings settings;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePeerLocated extends Api.TypeUpdate {
		private Api.TypePeerLocated[] peers;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateNewScheduledMessage extends Api.TypeUpdate {
		private Api.TypeMessage message;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateDeleteScheduledMessages extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private int[] messages;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateTheme extends Api.TypeUpdate {
		private Api.TypeTheme theme;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateGeoLiveViewed extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateLoginToken extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateMessagePollVote extends Api.TypeUpdate {
		private BigInteger pollId;
		private BigInteger userId;
		private byte[][] options;
		private int qts;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateDialogFilter extends Api.TypeUpdate {
		private int id;
		private Api.TypeDialogFilter filter;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateDialogFilterOrder extends Api.TypeUpdate {
		private int[] order;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateDialogFilters extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePhoneCallSignalingData extends Api.TypeUpdate {
		private BigInteger phoneCallId;
		private byte[] data;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChannelMessageForwards extends Api.TypeUpdate {
		private BigInteger channelId;
		private int id;
		private int forwards;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateReadChannelDiscussionInbox extends Api.TypeUpdate {
		private BigInteger channelId;
		private int topMsgId;
		private int readMaxId;
		private BigInteger broadcastId;
		private int broadcastPost;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateReadChannelDiscussionOutbox extends Api.TypeUpdate {
		private BigInteger channelId;
		private int topMsgId;
		private int readMaxId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePeerBlocked extends Api.TypeUpdate {
		private Api.TypePeer peerId;
		private Boolean blocked;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChannelUserTyping extends Api.TypeUpdate {
		private BigInteger channelId;
		private int topMsgId;
		private Api.TypePeer fromId;
		private Api.TypeSendMessageAction action;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePinnedMessages extends Api.TypeUpdate {
		private Boolean pinned;
		private Api.TypePeer peer;
		private int[] messages;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePinnedChannelMessages extends Api.TypeUpdate {
		private Boolean pinned;
		private BigInteger channelId;
		private int[] messages;
		private int pts;
		private int ptsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChat extends Api.TypeUpdate {
		private BigInteger chatId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateGroupCallParticipants extends Api.TypeUpdate {
		private Api.TypeInputGroupCall call;
		private Api.TypeGroupCallParticipant[] participants;
		private int version;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateGroupCall extends Api.TypeUpdate {
		private BigInteger chatId;
		private Api.TypeGroupCall call;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePeerHistoryTTL extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private int ttlPeriod;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChatParticipant extends Api.TypeUpdate {
		private BigInteger chatId;
		private int date;
		private BigInteger actorId;
		private BigInteger userId;
		private Api.TypeChatParticipant prevParticipant;
		private Api.TypeChatParticipant newParticipant;
		private Api.TypeExportedChatInvite invite;
		private int qts;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChannelParticipant extends Api.TypeUpdate {
		private BigInteger channelId;
		private int date;
		private BigInteger actorId;
		private BigInteger userId;
		private Api.TypeChannelParticipant prevParticipant;
		private Api.TypeChannelParticipant newParticipant;
		private Api.TypeExportedChatInvite invite;
		private int qts;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateBotStopped extends Api.TypeUpdate {
		private BigInteger userId;
		private int date;
		private Boolean stopped;
		private int qts;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateGroupCallConnection extends Api.TypeUpdate {
		private Boolean presentation;
		private Api.TypeDataJSON params;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateBotCommands extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private BigInteger botId;
		private Api.TypeBotCommand[] commands;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePendingJoinRequests extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private int requestsPending;
		private BigInteger[] recentRequesters;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateBotChatInviteRequester extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private int date;
		private BigInteger userId;
		private String about;
		private Api.TypeExportedChatInvite invite;
		private int qts;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateMessageReactions extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private int msgId;
		private int topMsgId;
		private Api.TypeMessageReactions reactions;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateAttachMenuBots extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateWebViewResultSent extends Api.TypeUpdate {
		private BigInteger queryId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateBotMenuButton extends Api.TypeUpdate {
		private BigInteger botId;
		private Api.TypeBotMenuButton button;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateSavedRingtones extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateTranscribedAudio extends Api.TypeUpdate {
		private Boolean pending;
		private Api.TypePeer peer;
		private int msgId;
		private BigInteger transcriptionId;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateReadFeaturedEmojiStickers extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateUserEmojiStatus extends Api.TypeUpdate {
		private BigInteger userId;
		private Api.TypeEmojiStatus emojiStatus;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateRecentEmojiStatuses extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateRecentReactions extends Api.TypeUpdate {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateMoveStickerSetToTop extends Api.TypeUpdate {
		private Boolean masks;
		private Boolean emojis;
		private BigInteger stickerset;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateMessageExtendedMedia extends Api.TypeUpdate {
		private Api.TypePeer peer;
		private int msgId;
		private Api.TypeMessageExtendedMedia extendedMedia;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChannelPinnedTopic extends Api.TypeUpdate {
		private Boolean pinned;
		private BigInteger channelId;
		private int topicId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateChannelPinnedTopics extends Api.TypeUpdate {
		private BigInteger channelId;
		private int[] order;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatesTooLong extends Api.TypeUpdates {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateShortMessage extends Api.TypeUpdates {
		private Boolean out;
		private Boolean mentioned;
		private Boolean mediaUnread;
		private Boolean silent;
		private int id;
		private BigInteger userId;
		private String message;
		private int pts;
		private int ptsCount;
		private int date;
		private Api.TypeMessageFwdHeader fwdFrom;
		private BigInteger viaBotId;
		private Api.TypeMessageReplyHeader replyTo;
		private Api.TypeMessageEntity[] entities;
		private int ttlPeriod;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateShortChatMessage extends Api.TypeUpdates {
		private Boolean out;
		private Boolean mentioned;
		private Boolean mediaUnread;
		private Boolean silent;
		private int id;
		private BigInteger fromId;
		private BigInteger chatId;
		private String message;
		private int pts;
		private int ptsCount;
		private int date;
		private Api.TypeMessageFwdHeader fwdFrom;
		private BigInteger viaBotId;
		private Api.TypeMessageReplyHeader replyTo;
		private Api.TypeMessageEntity[] entities;
		private int ttlPeriod;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateShort extends Api.TypeUpdates {
		private Api.TypeUpdate update;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatesCombined extends Api.TypeUpdates {
		private Api.TypeUpdate[] updates;
		private Api.TypeUser[] users;
		private Api.TypeChat[] chats;
		private int date;
		private int seqStart;
		private int seq;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Updates extends Api.TypeUpdates {
		private Api.TypeUpdate[] updates;
		private Api.TypeUser[] users;
		private Api.TypeChat[] chats;
		private int date;
		private int seq;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdateShortSentMessage extends Api.TypeUpdates {
		private Boolean out;
		private int id;
		private int pts;
		private int ptsCount;
		private int date;
		private Api.TypeMessageMedia media;
		private Api.TypeMessageEntity[] entities;
		private int ttlPeriod;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DcOption extends Api.TypeDcOption {
		private Boolean ipv6;
		private Boolean mediaOnly;
		private Boolean tcpoOnly;
		private Boolean cdn;
		private Boolean staticSuffix;
		private Boolean thisPortOnly;
		private int id;
		private String ipAddress;
		private int port;
		private byte[] secret;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Config extends Api.TypeConfig {
		private Boolean phonecallsEnabled;
		private Boolean defaultP2pContacts;
		private Boolean preloadFeaturedStickers;
		private Boolean ignorePhoneEntities;
		private Boolean revokePmInbox;
		private Boolean blockedMode;
		private Boolean pfsEnabled;
		private Boolean forceTryIpv6;
		private int date;
		private int expires;
		private Boolean testMode;
		private int thisDc;
		private Api.TypeDcOption[] dcOptions;
		private String dcTxtDomainName;
		private int chatSizeMax;
		private int megagroupSizeMax;
		private int forwardedCountMax;
		private int onlineUpdatePeriodMs;
		private int offlineBlurTimeoutMs;
		private int offlineIdleTimeoutMs;
		private int onlineCloudTimeoutMs;
		private int notifyCloudDelayMs;
		private int notifyDefaultDelayMs;
		private int pushChatPeriodMs;
		private int pushChatLimit;
		private int savedGifsLimit;
		private int editTimeLimit;
		private int revokeTimeLimit;
		private int revokePmTimeLimit;
		private int ratingEDecay;
		private int stickersRecentLimit;
		private int stickersFavedLimit;
		private int channelsReadMediaPeriod;
		private int tmpSessions;
		private int pinnedDialogsCountMax;
		private int pinnedInfolderCountMax;
		private int callReceiveTimeoutMs;
		private int callRingTimeoutMs;
		private int callConnectTimeoutMs;
		private int callPacketTimeoutMs;
		private String meUrlPrefix;
		private String autoupdateUrlPrefix;
		private String gifSearchUsername;
		private String venueSearchUsername;
		private String imgSearchUsername;
		private String staticMapsProvider;
		private int captionLengthMax;
		private int messageLengthMax;
		private int webfileDcId;
		private String suggestedLangCode;
		private int langPackVersion;
		private int baseLangPackVersion;
		private Api.TypeReaction reactionsDefault;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class NearestDc extends Api.TypeNearestDc {
		private String country;
		private int thisDc;
		private int nearestDc;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EncryptedChatEmpty extends Api.TypeEncryptedChat {
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EncryptedChatWaiting extends Api.TypeEncryptedChat {
		private int id;
		private BigInteger accessHash;
		private int date;
		private BigInteger adminId;
		private BigInteger participantId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EncryptedChatRequested extends Api.TypeEncryptedChat {
		private int folderId;
		private int id;
		private BigInteger accessHash;
		private int date;
		private BigInteger adminId;
		private BigInteger participantId;
		private byte[] gA;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EncryptedChat extends Api.TypeEncryptedChat {
		private int id;
		private BigInteger accessHash;
		private int date;
		private BigInteger adminId;
		private BigInteger participantId;
		private byte[] gAOrB;
		private BigInteger keyFingerprint;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EncryptedChatDiscarded extends Api.TypeEncryptedChat {
		private Boolean historyDeleted;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputEncryptedChat extends Api.TypeInputEncryptedChat {
		private int chatId;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EncryptedFileEmpty extends Api.TypeEncryptedFile {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EncryptedFile extends Api.TypeEncryptedFile {
		private BigInteger id;
		private BigInteger accessHash;
		private BigInteger size;
		private int dcId;
		private int keyFingerprint;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputEncryptedFileEmpty extends Api.TypeInputEncryptedFile {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputEncryptedFileUploaded extends Api.TypeInputEncryptedFile {
		private BigInteger id;
		private int parts;
		private String md5Checksum;
		private int keyFingerprint;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputEncryptedFile extends Api.TypeInputEncryptedFile {
		private BigInteger id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputEncryptedFileBigUploaded extends Api.TypeInputEncryptedFile {
		private BigInteger id;
		private int parts;
		private int keyFingerprint;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EncryptedMessage extends Api.TypeEncryptedMessage {
		private BigInteger randomId;
		private int chatId;
		private int date;
		private byte[] bytes;
		private Api.TypeEncryptedFile file;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EncryptedMessageService extends Api.TypeEncryptedMessage {
		private BigInteger randomId;
		private int chatId;
		private int date;
		private byte[] bytes;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputDocumentEmpty extends Api.TypeInputDocument {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputDocument extends Api.TypeInputDocument {
		private BigInteger id;
		private BigInteger accessHash;
		private byte[] fileReference;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DocumentEmpty extends Api.TypeDocument {
		private BigInteger id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Document extends Api.TypeDocument {
		private BigInteger id;
		private BigInteger accessHash;
		private byte[] fileReference;
		private int date;
		private String mimeType;
		private BigInteger size;
		private Api.TypePhotoSize[] thumbs;
		private Api.TypeVideoSize[] videoThumbs;
		private int dcId;
		private Api.TypeDocumentAttribute[] attributes;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class NotifyPeer extends Api.TypeNotifyPeer {
		private Api.TypePeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class NotifyUsers extends Api.TypeNotifyPeer {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class NotifyChats extends Api.TypeNotifyPeer {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class NotifyBroadcasts extends Api.TypeNotifyPeer {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class NotifyForumTopic extends Api.TypeNotifyPeer {
		private Api.TypePeer peer;
		private int topMsgId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageTypingAction extends Api.TypeSendMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageCancelAction extends Api.TypeSendMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageRecordVideoAction extends Api.TypeSendMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageUploadVideoAction extends Api.TypeSendMessageAction {
		private int progress;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageRecordAudioAction extends Api.TypeSendMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageUploadAudioAction extends Api.TypeSendMessageAction {
		private int progress;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageUploadPhotoAction extends Api.TypeSendMessageAction {
		private int progress;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageUploadDocumentAction extends Api.TypeSendMessageAction {
		private int progress;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageGeoLocationAction extends Api.TypeSendMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageChooseContactAction extends Api.TypeSendMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageGamePlayAction extends Api.TypeSendMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageRecordRoundAction extends Api.TypeSendMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageUploadRoundAction extends Api.TypeSendMessageAction {
		private int progress;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SpeakingInGroupCallAction extends Api.TypeSendMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageHistoryImportAction extends Api.TypeSendMessageAction {
		private int progress;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageChooseStickerAction extends Api.TypeSendMessageAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageEmojiInteraction extends Api.TypeSendMessageAction {
		private String emoticon;
		private int msgId;
		private Api.TypeDataJSON interaction;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendMessageEmojiInteractionSeen extends Api.TypeSendMessageAction {
		private String emoticon;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyKeyStatusTimestamp extends Api.TypeInputPrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyKeyChatInvite extends Api.TypeInputPrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyKeyPhoneCall extends Api.TypeInputPrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyKeyPhoneP2P extends Api.TypeInputPrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyKeyForwards extends Api.TypeInputPrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyKeyProfilePhoto extends Api.TypeInputPrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyKeyPhoneNumber extends Api.TypeInputPrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyKeyAddedByPhone extends Api.TypeInputPrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyKeyVoiceMessages extends Api.TypeInputPrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyKeyStatusTimestamp extends Api.TypePrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyKeyChatInvite extends Api.TypePrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyKeyPhoneCall extends Api.TypePrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyKeyPhoneP2P extends Api.TypePrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyKeyForwards extends Api.TypePrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyKeyProfilePhoto extends Api.TypePrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyKeyPhoneNumber extends Api.TypePrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyKeyAddedByPhone extends Api.TypePrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyKeyVoiceMessages extends Api.TypePrivacyKey {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyValueAllowContacts extends Api.TypeInputPrivacyRule {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyValueAllowAll extends Api.TypeInputPrivacyRule {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyValueAllowUsers extends Api.TypeInputPrivacyRule {
		private Api.TypeInputUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyValueDisallowContacts extends Api.TypeInputPrivacyRule {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyValueDisallowAll extends Api.TypeInputPrivacyRule {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyValueDisallowUsers extends Api.TypeInputPrivacyRule {
		private Api.TypeInputUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyValueAllowChatParticipants extends Api.TypeInputPrivacyRule {
		private BigInteger[] chats;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPrivacyValueDisallowChatParticipants extends Api.TypeInputPrivacyRule {
		private BigInteger[] chats;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyValueAllowContacts extends Api.TypePrivacyRule {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyValueAllowAll extends Api.TypePrivacyRule {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyValueAllowUsers extends Api.TypePrivacyRule {
		private BigInteger[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyValueDisallowContacts extends Api.TypePrivacyRule {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyValueDisallowAll extends Api.TypePrivacyRule {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyValueDisallowUsers extends Api.TypePrivacyRule {
		private BigInteger[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyValueAllowChatParticipants extends Api.TypePrivacyRule {
		private BigInteger[] chats;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PrivacyValueDisallowChatParticipants extends Api.TypePrivacyRule {
		private BigInteger[] chats;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AccountDaysTTL extends Api.TypeAccountDaysTTL {
		private int days;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DocumentAttributeImageSize extends Api.TypeDocumentAttribute {
		private int w;
		private int h;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DocumentAttributeAnimated extends Api.TypeDocumentAttribute {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DocumentAttributeSticker extends Api.TypeDocumentAttribute {
		private Boolean mask;
		private String alt;
		private Api.TypeInputStickerSet stickerset;
		private Api.TypeMaskCoords maskCoords;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DocumentAttributeVideo extends Api.TypeDocumentAttribute {
		private Boolean roundMessage;
		private Boolean supportsStreaming;
		private int duration;
		private int w;
		private int h;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DocumentAttributeAudio extends Api.TypeDocumentAttribute {
		private Boolean voice;
		private int duration;
		private String title;
		private String performer;
		private byte[] waveform;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DocumentAttributeFilename extends Api.TypeDocumentAttribute {
		private String fileName;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DocumentAttributeHasStickers extends Api.TypeDocumentAttribute {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DocumentAttributeCustomEmoji extends Api.TypeDocumentAttribute {
		private Boolean free;
		private String alt;
		private Api.TypeInputStickerSet stickerset;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StickerPack extends Api.TypeStickerPack {
		private String emoticon;
		private BigInteger[] documents;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WebPageEmpty extends Api.TypeWebPage {
		private BigInteger id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WebPagePending extends Api.TypeWebPage {
		private BigInteger id;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WebPage extends Api.TypeWebPage {
		private BigInteger id;
		private String url;
		private String displayUrl;
		private int hash;
		private String type;
		private String siteName;
		private String title;
		private String description;
		private Api.TypePhoto photo;
		private String embedUrl;
		private String embedType;
		private int embedWidth;
		private int embedHeight;
		private int duration;
		private String author;
		private Api.TypeDocument document;
		private Api.TypePage cachedPage;
		private Api.TypeWebPageAttribute[] attributes;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WebPageNotModified extends Api.TypeWebPage {
		private int cachedPageViews;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Authorization extends Api.TypeAuthorization {
		private Boolean current;
		private Boolean officialApp;
		private Boolean passwordPending;
		private Boolean encryptedRequestsDisabled;
		private Boolean callRequestsDisabled;
		private BigInteger hash;
		private String deviceModel;
		private String platform;
		private String systemVersion;
		private int apiId;
		private String appName;
		private String appVersion;
		private int dateCreated;
		private int dateActive;
		private String ip;
		private String country;
		private String region;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReceivedNotifyMessage extends Api.TypeReceivedNotifyMessage {
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatInviteExported extends Api.TypeExportedChatInvite {
		private Boolean revoked;
		private Boolean permanent;
		private Boolean requestNeeded;
		private String link;
		private BigInteger adminId;
		private int date;
		private int startDate;
		private int expireDate;
		private int usageLimit;
		private int usage;
		private int requested;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatInvitePublicJoinRequests extends Api.TypeExportedChatInvite {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatInviteAlready extends Api.TypeChatInvite {
		private Api.TypeChat chat;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatInvite extends Api.TypeChatInvite {
		private Boolean channel;
		private Boolean broadcast;
		private Boolean publicSuffix;
		private Boolean megagroup;
		private Boolean requestNeeded;
		private String title;
		private String about;
		private Api.TypePhoto photo;
		private int participantsCount;
		private Api.TypeUser[] participants;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatInvitePeek extends Api.TypeChatInvite {
		private Api.TypeChat chat;
		private int expires;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetEmpty extends Api.TypeInputStickerSet {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetID extends Api.TypeInputStickerSet {
		private BigInteger id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetShortName extends Api.TypeInputStickerSet {
		private String shortName;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetAnimatedEmoji extends Api.TypeInputStickerSet {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetDice extends Api.TypeInputStickerSet {
		private String emoticon;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetAnimatedEmojiAnimations extends Api.TypeInputStickerSet {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetPremiumGifts extends Api.TypeInputStickerSet {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetEmojiGenericAnimations extends Api.TypeInputStickerSet {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetEmojiDefaultStatuses extends Api.TypeInputStickerSet {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetEmojiDefaultTopicIcons extends Api.TypeInputStickerSet {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StickerSet extends Api.TypeStickerSet {
		private Boolean archived;
		private Boolean official;
		private Boolean masks;
		private Boolean animated;
		private Boolean videos;
		private Boolean emojis;
		private int installedDate;
		private BigInteger id;
		private BigInteger accessHash;
		private String title;
		private String shortName;
		private Api.TypePhotoSize[] thumbs;
		private int thumbDcId;
		private int thumbVersion;
		private BigInteger thumbDocumentId;
		private int count;
		private int hash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotCommand extends Api.TypeBotCommand {
		private String command;
		private String description;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotInfo extends Api.TypeBotInfo {
		private BigInteger userId;
		private String description;
		private Api.TypePhoto descriptionPhoto;
		private Api.TypeDocument descriptionDocument;
		private Api.TypeBotCommand[] commands;
		private Api.TypeBotMenuButton menuButton;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButton extends Api.TypeKeyboardButton {
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonUrl extends Api.TypeKeyboardButton {
		private String text;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonCallback extends Api.TypeKeyboardButton {
		private Boolean requiresPassword;
		private String text;
		private byte[] data;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonRequestPhone extends Api.TypeKeyboardButton {
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonRequestGeoLocation extends Api.TypeKeyboardButton {
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonSwitchInline extends Api.TypeKeyboardButton {
		private Boolean samePeer;
		private String text;
		private String query;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonGame extends Api.TypeKeyboardButton {
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonBuy extends Api.TypeKeyboardButton {
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonUrlAuth extends Api.TypeKeyboardButton {
		private String text;
		private String fwdText;
		private String url;
		private int buttonId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputKeyboardButtonUrlAuth extends Api.TypeKeyboardButton {
		private Boolean requestWriteAccess;
		private String text;
		private String fwdText;
		private String url;
		private Api.TypeInputUser bot;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonRequestPoll extends Api.TypeKeyboardButton {
		private Boolean quiz;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputKeyboardButtonUserProfile extends Api.TypeKeyboardButton {
		private String text;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonUserProfile extends Api.TypeKeyboardButton {
		private String text;
		private BigInteger userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonWebView extends Api.TypeKeyboardButton {
		private String text;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonSimpleWebView extends Api.TypeKeyboardButton {
		private String text;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class KeyboardButtonRow extends Api.TypeKeyboardButtonRow {
		private Api.TypeKeyboardButton[] buttons;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReplyKeyboardHide extends Api.TypeReplyMarkup {
		private Boolean selective;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReplyKeyboardForceReply extends Api.TypeReplyMarkup {
		private Boolean singleUse;
		private Boolean selective;
		private String placeholder;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReplyKeyboardMarkup extends Api.TypeReplyMarkup {
		private Boolean resize;
		private Boolean singleUse;
		private Boolean selective;
		private Api.TypeKeyboardButtonRow[] rows;
		private String placeholder;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReplyInlineMarkup extends Api.TypeReplyMarkup {
		private Api.TypeKeyboardButtonRow[] rows;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityUnknown extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityMention extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityHashtag extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityBotCommand extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityUrl extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityEmail extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityBold extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityItalic extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityCode extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityPre extends Api.TypeMessageEntity {
		private int offset;
		private int length;
		private String language;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityTextUrl extends Api.TypeMessageEntity {
		private int offset;
		private int length;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityMentionName extends Api.TypeMessageEntity {
		private int offset;
		private int length;
		private BigInteger userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessageEntityMentionName extends Api.TypeMessageEntity {
		private int offset;
		private int length;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityPhone extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityCashtag extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityUnderline extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityStrike extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityBlockquote extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityBankCard extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntitySpoiler extends Api.TypeMessageEntity {
		private int offset;
		private int length;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageEntityCustomEmoji extends Api.TypeMessageEntity {
		private int offset;
		private int length;
		private BigInteger documentId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputChannelEmpty extends Api.TypeInputChannel {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputChannel extends Api.TypeInputChannel {
		private BigInteger channelId;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputChannelFromMessage extends Api.TypeInputChannel {
		private Api.TypeInputPeer peer;
		private int msgId;
		private BigInteger channelId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageRange extends Api.TypeMessageRange {
		private int minId;
		private int maxId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelMessagesFilterEmpty extends Api.TypeChannelMessagesFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelMessagesFilter extends Api.TypeChannelMessagesFilter {
		private Boolean excludeNewMessages;
		private Api.TypeMessageRange[] ranges;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipant extends Api.TypeChannelParticipant {
		private BigInteger userId;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantSelf extends Api.TypeChannelParticipant {
		private Boolean viaRequest;
		private BigInteger userId;
		private BigInteger inviterId;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantCreator extends Api.TypeChannelParticipant {
		private BigInteger userId;
		private Api.TypeChatAdminRights adminRights;
		private String rank;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantAdmin extends Api.TypeChannelParticipant {
		private Boolean canEdit;
		private Boolean self;
		private BigInteger userId;
		private BigInteger inviterId;
		private BigInteger promotedBy;
		private int date;
		private Api.TypeChatAdminRights adminRights;
		private String rank;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantBanned extends Api.TypeChannelParticipant {
		private Boolean left;
		private Api.TypePeer peer;
		private BigInteger kickedBy;
		private int date;
		private Api.TypeChatBannedRights bannedRights;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantLeft extends Api.TypeChannelParticipant {
		private Api.TypePeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantsRecent extends Api.TypeChannelParticipantsFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantsAdmins extends Api.TypeChannelParticipantsFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantsKicked extends Api.TypeChannelParticipantsFilter {
		private String q;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantsBots extends Api.TypeChannelParticipantsFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantsBanned extends Api.TypeChannelParticipantsFilter {
		private String q;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantsSearch extends Api.TypeChannelParticipantsFilter {
		private String q;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantsContacts extends Api.TypeChannelParticipantsFilter {
		private String q;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipantsMentions extends Api.TypeChannelParticipantsFilter {
		private String q;
		private int topMsgId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineMessageMediaAuto extends Api.TypeInputBotInlineMessage {
		private String message;
		private Api.TypeMessageEntity[] entities;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineMessageText extends Api.TypeInputBotInlineMessage {
		private Boolean noWebpage;
		private String message;
		private Api.TypeMessageEntity[] entities;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineMessageMediaGeo extends Api.TypeInputBotInlineMessage {
		private Api.TypeInputGeoPoint geoPoint;
		private int heading;
		private int period;
		private int proximityNotificationRadius;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineMessageMediaVenue extends Api.TypeInputBotInlineMessage {
		private Api.TypeInputGeoPoint geoPoint;
		private String title;
		private String address;
		private String provider;
		private String venueId;
		private String venueType;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineMessageMediaContact extends Api.TypeInputBotInlineMessage {
		private String phoneNumber;
		private String firstName;
		private String lastName;
		private String vcard;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineMessageGame extends Api.TypeInputBotInlineMessage {
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineMessageMediaInvoice extends Api.TypeInputBotInlineMessage {
		private String title;
		private String description;
		private Api.TypeInputWebDocument photo;
		private Api.TypeInvoice invoice;
		private byte[] payload;
		private String provider;
		private Api.TypeDataJSON providerData;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineResult extends Api.TypeInputBotInlineResult {
		private String id;
		private String type;
		private String title;
		private String description;
		private String url;
		private Api.TypeInputWebDocument thumb;
		private Api.TypeInputWebDocument content;
		private Api.TypeInputBotInlineMessage sendMessage;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineResultPhoto extends Api.TypeInputBotInlineResult {
		private String id;
		private String type;
		private Api.TypeInputPhoto photo;
		private Api.TypeInputBotInlineMessage sendMessage;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineResultDocument extends Api.TypeInputBotInlineResult {
		private String id;
		private String type;
		private String title;
		private String description;
		private Api.TypeInputDocument document;
		private Api.TypeInputBotInlineMessage sendMessage;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineResultGame extends Api.TypeInputBotInlineResult {
		private String id;
		private String shortName;
		private Api.TypeInputBotInlineMessage sendMessage;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotInlineMessageMediaAuto extends Api.TypeBotInlineMessage {
		private String message;
		private Api.TypeMessageEntity[] entities;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotInlineMessageText extends Api.TypeBotInlineMessage {
		private Boolean noWebpage;
		private String message;
		private Api.TypeMessageEntity[] entities;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotInlineMessageMediaGeo extends Api.TypeBotInlineMessage {
		private Api.TypeGeoPoint geo;
		private int heading;
		private int period;
		private int proximityNotificationRadius;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotInlineMessageMediaVenue extends Api.TypeBotInlineMessage {
		private Api.TypeGeoPoint geo;
		private String title;
		private String address;
		private String provider;
		private String venueId;
		private String venueType;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotInlineMessageMediaContact extends Api.TypeBotInlineMessage {
		private String phoneNumber;
		private String firstName;
		private String lastName;
		private String vcard;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotInlineMessageMediaInvoice extends Api.TypeBotInlineMessage {
		private Boolean shippingAddressRequested;
		private Boolean test;
		private String title;
		private String description;
		private Api.TypeWebDocument photo;
		private String currency;
		private BigInteger totalAmount;
		private Api.TypeReplyMarkup replyMarkup;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotInlineResult extends Api.TypeBotInlineResult {
		private String id;
		private String type;
		private String title;
		private String description;
		private String url;
		private Api.TypeWebDocument thumb;
		private Api.TypeWebDocument content;
		private Api.TypeBotInlineMessage sendMessage;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotInlineMediaResult extends Api.TypeBotInlineResult {
		private String id;
		private String type;
		private Api.TypePhoto photo;
		private Api.TypeDocument document;
		private String title;
		private String description;
		private Api.TypeBotInlineMessage sendMessage;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ExportedMessageLink extends Api.TypeExportedMessageLink {
		private String link;
		private String html;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageFwdHeader extends Api.TypeMessageFwdHeader {
		private Boolean imported;
		private Api.TypePeer fromId;
		private String fromName;
		private int date;
		private int channelPost;
		private String postAuthor;
		private Api.TypePeer savedFromPeer;
		private int savedFromMsgId;
		private String psaType;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineMessageID extends Api.TypeInputBotInlineMessageID {
		private int dcId;
		private BigInteger id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputBotInlineMessageID64 extends Api.TypeInputBotInlineMessageID {
		private int dcId;
		private BigInteger ownerId;
		private int id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InlineBotSwitchPM extends Api.TypeInlineBotSwitchPM {
		private String text;
		private String startParam;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TopPeer extends Api.TypeTopPeer {
		private Api.TypePeer peer;
		private double rating;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TopPeerCategoryBotsPM extends Api.TypeTopPeerCategory {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TopPeerCategoryBotsInline extends Api.TypeTopPeerCategory {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TopPeerCategoryCorrespondents extends Api.TypeTopPeerCategory {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TopPeerCategoryGroups extends Api.TypeTopPeerCategory {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TopPeerCategoryChannels extends Api.TypeTopPeerCategory {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TopPeerCategoryPhoneCalls extends Api.TypeTopPeerCategory {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TopPeerCategoryForwardUsers extends Api.TypeTopPeerCategory {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TopPeerCategoryForwardChats extends Api.TypeTopPeerCategory {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TopPeerCategoryPeers extends Api.TypeTopPeerCategoryPeers {
		private Api.TypeTopPeerCategory category;
		private int count;
		private Api.TypeTopPeer[] peers;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DraftMessageEmpty extends Api.TypeDraftMessage {
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DraftMessage extends Api.TypeDraftMessage {
		private Boolean noWebpage;
		private int replyToMsgId;
		private String message;
		private Api.TypeMessageEntity[] entities;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StickerSetCovered extends Api.TypeStickerSetCovered {
		private Api.TypeStickerSet set;
		private Api.TypeDocument cover;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StickerSetMultiCovered extends Api.TypeStickerSetCovered {
		private Api.TypeStickerSet set;
		private Api.TypeDocument[] covers;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StickerSetFullCovered extends Api.TypeStickerSetCovered {
		private Api.TypeStickerSet set;
		private Api.TypeStickerPack[] packs;
		private Api.TypeStickerKeyword[] keywords;
		private Api.TypeDocument[] documents;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MaskCoords extends Api.TypeMaskCoords {
		private int n;
		private double x;
		private double y;
		private double zoom;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickeredMediaPhoto extends Api.TypeInputStickeredMedia {
		private Api.TypeInputPhoto id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickeredMediaDocument extends Api.TypeInputStickeredMedia {
		private Api.TypeInputDocument id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Game extends Api.TypeGame {
		private BigInteger id;
		private BigInteger accessHash;
		private String shortName;
		private String title;
		private String description;
		private Api.TypePhoto photo;
		private Api.TypeDocument document;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputGameID extends Api.TypeInputGame {
		private BigInteger id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputGameShortName extends Api.TypeInputGame {
		private Api.TypeInputUser botId;
		private String shortName;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class HighScore extends Api.TypeHighScore {
		private int pos;
		private BigInteger userId;
		private int score;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextEmpty extends Api.TypeRichText {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextPlain extends Api.TypeRichText {
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextBold extends Api.TypeRichText {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextItalic extends Api.TypeRichText {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextUnderline extends Api.TypeRichText {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextStrike extends Api.TypeRichText {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextFixed extends Api.TypeRichText {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextUrl extends Api.TypeRichText {
		private Api.TypeRichText text;
		private String url;
		private BigInteger webpageId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextEmail extends Api.TypeRichText {
		private Api.TypeRichText text;
		private String email;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextConcat extends Api.TypeRichText {
		private Api.TypeRichText[] texts;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextSubscript extends Api.TypeRichText {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextSuperscript extends Api.TypeRichText {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextMarked extends Api.TypeRichText {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextPhone extends Api.TypeRichText {
		private Api.TypeRichText text;
		private String phone;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextImage extends Api.TypeRichText {
		private BigInteger documentId;
		private int w;
		private int h;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TextAnchor extends Api.TypeRichText {
		private Api.TypeRichText text;
		private String name;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockUnsupported extends Api.TypePageBlock {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockTitle extends Api.TypePageBlock {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockSubtitle extends Api.TypePageBlock {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockAuthorDate extends Api.TypePageBlock {
		private Api.TypeRichText author;
		private int publishedDate;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockHeader extends Api.TypePageBlock {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockSubheader extends Api.TypePageBlock {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockParagraph extends Api.TypePageBlock {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockPreformatted extends Api.TypePageBlock {
		private Api.TypeRichText text;
		private String language;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockFooter extends Api.TypePageBlock {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockDivider extends Api.TypePageBlock {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockAnchor extends Api.TypePageBlock {
		private String name;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockList extends Api.TypePageBlock {
		private Api.TypePageListItem[] items;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockBlockquote extends Api.TypePageBlock {
		private Api.TypeRichText text;
		private Api.TypeRichText caption;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockPullquote extends Api.TypePageBlock {
		private Api.TypeRichText text;
		private Api.TypeRichText caption;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockPhoto extends Api.TypePageBlock {
		private BigInteger photoId;
		private Api.TypePageCaption caption;
		private String url;
		private BigInteger webpageId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockVideo extends Api.TypePageBlock {
		private Boolean autoplay;
		private Boolean loop;
		private BigInteger videoId;
		private Api.TypePageCaption caption;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockCover extends Api.TypePageBlock {
		private Api.TypePageBlock cover;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockEmbed extends Api.TypePageBlock {
		private Boolean fullWidth;
		private Boolean allowScrolling;
		private String url;
		private String html;
		private BigInteger posterPhotoId;
		private int w;
		private int h;
		private Api.TypePageCaption caption;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockEmbedPost extends Api.TypePageBlock {
		private String url;
		private BigInteger webpageId;
		private BigInteger authorPhotoId;
		private String author;
		private int date;
		private Api.TypePageBlock[] blocks;
		private Api.TypePageCaption caption;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockCollage extends Api.TypePageBlock {
		private Api.TypePageBlock[] items;
		private Api.TypePageCaption caption;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockSlideshow extends Api.TypePageBlock {
		private Api.TypePageBlock[] items;
		private Api.TypePageCaption caption;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockChannel extends Api.TypePageBlock {
		private Api.TypeChat channel;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockAudio extends Api.TypePageBlock {
		private BigInteger audioId;
		private Api.TypePageCaption caption;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockKicker extends Api.TypePageBlock {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockTable extends Api.TypePageBlock {
		private Boolean bordered;
		private Boolean striped;
		private Api.TypeRichText title;
		private Api.TypePageTableRow[] rows;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockOrderedList extends Api.TypePageBlock {
		private Api.TypePageListOrderedItem[] items;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockDetails extends Api.TypePageBlock {
		private Boolean open;
		private Api.TypePageBlock[] blocks;
		private Api.TypeRichText title;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockRelatedArticles extends Api.TypePageBlock {
		private Api.TypeRichText title;
		private Api.TypePageRelatedArticle[] articles;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageBlockMap extends Api.TypePageBlock {
		private Api.TypeGeoPoint geo;
		private int zoom;
		private int w;
		private int h;
		private Api.TypePageCaption caption;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneCallDiscardReasonMissed extends Api.TypePhoneCallDiscardReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneCallDiscardReasonDisconnect extends Api.TypePhoneCallDiscardReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneCallDiscardReasonHangup extends Api.TypePhoneCallDiscardReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneCallDiscardReasonBusy extends Api.TypePhoneCallDiscardReason {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DataJSON extends Api.TypeDataJSON {
		private String data;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class LabeledPrice extends Api.TypeLabeledPrice {
		private String label;
		private BigInteger amount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Invoice extends Api.TypeInvoice {
		private Boolean test;
		private Boolean nameRequested;
		private Boolean phoneRequested;
		private Boolean emailRequested;
		private Boolean shippingAddressRequested;
		private Boolean flexible;
		private Boolean phoneToProvider;
		private Boolean emailToProvider;
		private Boolean recurring;
		private String currency;
		private Api.TypeLabeledPrice[] prices;
		private BigInteger maxTipAmount;
		private BigInteger[] suggestedTipAmounts;
		private String recurringTermsUrl;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PaymentCharge extends Api.TypePaymentCharge {
		private String id;
		private String providerChargeId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PostAddress extends Api.TypePostAddress {
		private String streetLine1;
		private String streetLine2;
		private String city;
		private String state;
		private String countryIso2;
		private String postCode;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PaymentRequestedInfo extends Api.TypePaymentRequestedInfo {
		private String name;
		private String phone;
		private String email;
		private Api.TypePostAddress shippingAddress;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PaymentSavedCredentialsCard extends Api.TypePaymentSavedCredentials {
		private String id;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WebDocument extends Api.TypeWebDocument {
		private String url;
		private BigInteger accessHash;
		private int size;
		private String mimeType;
		private Api.TypeDocumentAttribute[] attributes;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WebDocumentNoProxy extends Api.TypeWebDocument {
		private String url;
		private int size;
		private String mimeType;
		private Api.TypeDocumentAttribute[] attributes;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputWebDocument extends Api.TypeInputWebDocument {
		private String url;
		private int size;
		private String mimeType;
		private Api.TypeDocumentAttribute[] attributes;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputWebFileLocation extends Api.TypeInputWebFileLocation {
		private String url;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputWebFileGeoPointLocation extends Api.TypeInputWebFileLocation {
		private Api.TypeInputGeoPoint geoPoint;
		private BigInteger accessHash;
		private int w;
		private int h;
		private int zoom;
		private int scale;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputWebFileAudioAlbumThumbLocation extends Api.TypeInputWebFileLocation {
		private Boolean small;
		private Api.TypeInputDocument document;
		private String title;
		private String performer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPaymentCredentialsSaved extends Api.TypeInputPaymentCredentials {
		private String id;
		private byte[] tmpPassword;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPaymentCredentials extends Api.TypeInputPaymentCredentials {
		private Boolean save;
		private Api.TypeDataJSON data;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPaymentCredentialsApplePay extends Api.TypeInputPaymentCredentials {
		private Api.TypeDataJSON paymentData;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPaymentCredentialsGooglePay extends Api.TypeInputPaymentCredentials {
		private Api.TypeDataJSON paymentToken;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ShippingOption extends Api.TypeShippingOption {
		private String id;
		private String title;
		private Api.TypeLabeledPrice[] prices;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStickerSetItem extends Api.TypeInputStickerSetItem {
		private Api.TypeInputDocument document;
		private String emoji;
		private Api.TypeMaskCoords maskCoords;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputPhoneCall extends Api.TypeInputPhoneCall {
		private BigInteger id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneCallEmpty extends Api.TypePhoneCall {
		private BigInteger id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneCallWaiting extends Api.TypePhoneCall {
		private Boolean video;
		private BigInteger id;
		private BigInteger accessHash;
		private int date;
		private BigInteger adminId;
		private BigInteger participantId;
		private Api.TypePhoneCallProtocol protocol;
		private int receiveDate;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneCallRequested extends Api.TypePhoneCall {
		private Boolean video;
		private BigInteger id;
		private BigInteger accessHash;
		private int date;
		private BigInteger adminId;
		private BigInteger participantId;
		private byte[] gAHash;
		private Api.TypePhoneCallProtocol protocol;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneCallAccepted extends Api.TypePhoneCall {
		private Boolean video;
		private BigInteger id;
		private BigInteger accessHash;
		private int date;
		private BigInteger adminId;
		private BigInteger participantId;
		private byte[] gB;
		private Api.TypePhoneCallProtocol protocol;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneCall extends Api.TypePhoneCall {
		private Boolean p2pAllowed;
		private Boolean video;
		private BigInteger id;
		private BigInteger accessHash;
		private int date;
		private BigInteger adminId;
		private BigInteger participantId;
		private byte[] gAOrB;
		private BigInteger keyFingerprint;
		private Api.TypePhoneCallProtocol protocol;
		private Api.TypePhoneConnection[] connections;
		private int startDate;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneCallDiscarded extends Api.TypePhoneCall {
		private Boolean needRating;
		private Boolean needDebug;
		private Boolean video;
		private BigInteger id;
		private Api.TypePhoneCallDiscardReason reason;
		private int duration;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneConnection extends Api.TypePhoneConnection {
		private Boolean tcp;
		private BigInteger id;
		private String ip;
		private String ipv6;
		private int port;
		private byte[] peerTag;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneConnectionWebrtc extends Api.TypePhoneConnection {
		private Boolean turn;
		private Boolean stun;
		private BigInteger id;
		private String ip;
		private String ipv6;
		private int port;
		private String username;
		private String password;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PhoneCallProtocol extends Api.TypePhoneCallProtocol {
		private Boolean udpP2p;
		private Boolean udpReflector;
		private int minLayer;
		private int maxLayer;
		private String[] libraryVersions;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class CdnPublicKey extends Api.TypeCdnPublicKey {
		private int dcId;
		private String publicKey;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class CdnConfig extends Api.TypeCdnConfig {
		private Api.TypeCdnPublicKey[] publicKeys;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class LangPackString extends Api.TypeLangPackString {
		private String key;
		private String value;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class LangPackStringPluralized extends Api.TypeLangPackString {
		private String key;
		private String zeroValue;
		private String oneValue;
		private String twoValue;
		private String fewValue;
		private String manyValue;
		private String otherValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class LangPackStringDeleted extends Api.TypeLangPackString {
		private String key;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class LangPackDifference extends Api.TypeLangPackDifference {
		private String langCode;
		private int fromVersion;
		private int version;
		private Api.TypeLangPackString[] strings;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class LangPackLanguage extends Api.TypeLangPackLanguage {
		private Boolean official;
		private Boolean rtl;
		private Boolean beta;
		private String name;
		private String nativeName;
		private String langCode;
		private String baseLangCode;
		private String pluralCode;
		private int stringsCount;
		private int translatedCount;
		private String translationsUrl;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionChangeTitle extends Api.TypeChannelAdminLogEventAction {
		private String prevValue;
		private String newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionChangeAbout extends Api.TypeChannelAdminLogEventAction {
		private String prevValue;
		private String newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionChangeUsername extends Api.TypeChannelAdminLogEventAction {
		private String prevValue;
		private String newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionChangePhoto extends Api.TypeChannelAdminLogEventAction {
		private Api.TypePhoto prevPhoto;
		private Api.TypePhoto newPhoto;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionToggleInvites extends Api.TypeChannelAdminLogEventAction {
		private Boolean newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionToggleSignatures extends Api.TypeChannelAdminLogEventAction {
		private Boolean newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionUpdatePinned extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeMessage message;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionEditMessage extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeMessage prevMessage;
		private Api.TypeMessage newMessage;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionDeleteMessage extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeMessage message;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionParticipantJoin extends Api.TypeChannelAdminLogEventAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionParticipantLeave extends Api.TypeChannelAdminLogEventAction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionParticipantInvite extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeChannelParticipant participant;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionParticipantToggleBan extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeChannelParticipant prevParticipant;
		private Api.TypeChannelParticipant newParticipant;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionParticipantToggleAdmin extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeChannelParticipant prevParticipant;
		private Api.TypeChannelParticipant newParticipant;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionChangeStickerSet extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeInputStickerSet prevStickerset;
		private Api.TypeInputStickerSet newStickerset;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionTogglePreHistoryHidden extends Api.TypeChannelAdminLogEventAction {
		private Boolean newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionDefaultBannedRights extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeChatBannedRights prevBannedRights;
		private Api.TypeChatBannedRights newBannedRights;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionStopPoll extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeMessage message;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionChangeLinkedChat extends Api.TypeChannelAdminLogEventAction {
		private BigInteger prevValue;
		private BigInteger newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionChangeLocation extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeChannelLocation prevValue;
		private Api.TypeChannelLocation newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionToggleSlowMode extends Api.TypeChannelAdminLogEventAction {
		private int prevValue;
		private int newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionStartGroupCall extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeInputGroupCall call;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionDiscardGroupCall extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeInputGroupCall call;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionParticipantMute extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeGroupCallParticipant participant;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionParticipantUnmute extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeGroupCallParticipant participant;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionToggleGroupCallSetting extends Api.TypeChannelAdminLogEventAction {
		private Boolean joinMuted;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionParticipantJoinByInvite extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeExportedChatInvite invite;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionExportedInviteDelete extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeExportedChatInvite invite;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionExportedInviteRevoke extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeExportedChatInvite invite;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionExportedInviteEdit extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeExportedChatInvite prevInvite;
		private Api.TypeExportedChatInvite newInvite;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionParticipantVolume extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeGroupCallParticipant participant;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionChangeHistoryTTL extends Api.TypeChannelAdminLogEventAction {
		private int prevValue;
		private int newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionParticipantJoinByRequest extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeExportedChatInvite invite;
		private BigInteger approvedBy;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionToggleNoForwards extends Api.TypeChannelAdminLogEventAction {
		private Boolean newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionSendMessage extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeMessage message;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionChangeAvailableReactions extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeChatReactions prevValue;
		private Api.TypeChatReactions newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionChangeUsernames extends Api.TypeChannelAdminLogEventAction {
		private String[] prevValue;
		private String[] newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionToggleForum extends Api.TypeChannelAdminLogEventAction {
		private Boolean newValue;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionCreateTopic extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeForumTopic topic;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionEditTopic extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeForumTopic prevTopic;
		private Api.TypeForumTopic newTopic;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionDeleteTopic extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeForumTopic topic;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventActionPinTopic extends Api.TypeChannelAdminLogEventAction {
		private Api.TypeForumTopic prevTopic;
		private Api.TypeForumTopic newTopic;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEvent extends Api.TypeChannelAdminLogEvent {
		private BigInteger id;
		private int date;
		private BigInteger userId;
		private Api.TypeChannelAdminLogEventAction action;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelAdminLogEventsFilter extends Api.TypeChannelAdminLogEventsFilter {
		private Boolean join;
		private Boolean leave;
		private Boolean invite;
		private Boolean ban;
		private Boolean unban;
		private Boolean kick;
		private Boolean unkick;
		private Boolean promote;
		private Boolean demote;
		private Boolean info;
		private Boolean settings;
		private Boolean pinned;
		private Boolean edit;
		private Boolean delete;
		private Boolean groupCall;
		private Boolean invites;
		private Boolean send;
		private Boolean forums;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PopularContact extends Api.TypePopularContact {
		private BigInteger clientId;
		private int importers;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RecentMeUrlUnknown extends Api.TypeRecentMeUrl {
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RecentMeUrlUser extends Api.TypeRecentMeUrl {
		private String url;
		private BigInteger userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RecentMeUrlChat extends Api.TypeRecentMeUrl {
		private String url;
		private BigInteger chatId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RecentMeUrlChatInvite extends Api.TypeRecentMeUrl {
		private String url;
		private Api.TypeChatInvite chatInvite;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RecentMeUrlStickerSet extends Api.TypeRecentMeUrl {
		private String url;
		private Api.TypeStickerSetCovered set;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputSingleMedia extends Api.TypeInputSingleMedia {
		private Api.TypeInputMedia media;
		private BigInteger randomId;
		private String message;
		private Api.TypeMessageEntity[] entities;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WebAuthorization extends Api.TypeWebAuthorization {
		private BigInteger hash;
		private BigInteger botId;
		private String domain;
		private String browser;
		private String platform;
		private int dateCreated;
		private int dateActive;
		private String ip;
		private String region;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessageID extends Api.TypeInputMessage {
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessageReplyTo extends Api.TypeInputMessage {
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessagePinned extends Api.TypeInputMessage {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputMessageCallbackQuery extends Api.TypeInputMessage {
		private int id;
		private BigInteger queryId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputDialogPeer extends Api.TypeInputDialogPeer {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputDialogPeerFolder extends Api.TypeInputDialogPeer {
		private int folderId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DialogPeer extends Api.TypeDialogPeer {
		private Api.TypePeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DialogPeerFolder extends Api.TypeDialogPeer {
		private int folderId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class FileHash extends Api.TypeFileHash {
		private BigInteger offset;
		private int limit;
		private byte[] hash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputClientProxy extends Api.TypeInputClientProxy {
		private String address;
		private int port;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputSecureFileUploaded extends Api.TypeInputSecureFile {
		private BigInteger id;
		private int parts;
		private String md5Checksum;
		private byte[] fileHash;
		private byte[] secret;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputSecureFile extends Api.TypeInputSecureFile {
		private BigInteger id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureFileEmpty extends Api.TypeSecureFile {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureFile extends Api.TypeSecureFile {
		private BigInteger id;
		private BigInteger accessHash;
		private BigInteger size;
		private int dcId;
		private int date;
		private byte[] fileHash;
		private byte[] secret;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureData extends Api.TypeSecureData {
		private byte[] data;
		private byte[] dataHash;
		private byte[] secret;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecurePlainPhone extends Api.TypeSecurePlainData {
		private String phone;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecurePlainEmail extends Api.TypeSecurePlainData {
		private String email;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypePersonalDetails extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypePassport extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypeDriverLicense extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypeIdentityCard extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypeInternalPassport extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypeAddress extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypeUtilityBill extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypeBankStatement extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypeRentalAgreement extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypePassportRegistration extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypeTemporaryRegistration extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypePhone extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueTypeEmail extends Api.TypeSecureValueType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValue extends Api.TypeSecureValue {
		private Api.TypeSecureValueType type;
		private Api.TypeSecureData data;
		private Api.TypeSecureFile frontSide;
		private Api.TypeSecureFile reverseSide;
		private Api.TypeSecureFile selfie;
		private Api.TypeSecureFile[] translation;
		private Api.TypeSecureFile[] files;
		private Api.TypeSecurePlainData plainData;
		private byte[] hash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputSecureValue extends Api.TypeInputSecureValue {
		private Api.TypeSecureValueType type;
		private Api.TypeSecureData data;
		private Api.TypeInputSecureFile frontSide;
		private Api.TypeInputSecureFile reverseSide;
		private Api.TypeInputSecureFile selfie;
		private Api.TypeInputSecureFile[] translation;
		private Api.TypeInputSecureFile[] files;
		private Api.TypeSecurePlainData plainData;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueHash extends Api.TypeSecureValueHash {
		private Api.TypeSecureValueType type;
		private byte[] hash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueErrorData extends Api.TypeSecureValueError {
		private Api.TypeSecureValueType type;
		private byte[] dataHash;
		private String field;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueErrorFrontSide extends Api.TypeSecureValueError {
		private Api.TypeSecureValueType type;
		private byte[] fileHash;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueErrorReverseSide extends Api.TypeSecureValueError {
		private Api.TypeSecureValueType type;
		private byte[] fileHash;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueErrorSelfie extends Api.TypeSecureValueError {
		private Api.TypeSecureValueType type;
		private byte[] fileHash;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueErrorFile extends Api.TypeSecureValueError {
		private Api.TypeSecureValueType type;
		private byte[] fileHash;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueErrorFiles extends Api.TypeSecureValueError {
		private Api.TypeSecureValueType type;
		private byte[][] fileHash;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueError extends Api.TypeSecureValueError {
		private Api.TypeSecureValueType type;
		private byte[] hash;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueErrorTranslationFile extends Api.TypeSecureValueError {
		private Api.TypeSecureValueType type;
		private byte[] fileHash;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureValueErrorTranslationFiles extends Api.TypeSecureValueError {
		private Api.TypeSecureValueType type;
		private byte[][] fileHash;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureCredentialsEncrypted extends Api.TypeSecureCredentialsEncrypted {
		private byte[] data;
		private byte[] hash;
		private byte[] secret;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SavedPhoneContact extends Api.TypeSavedContact {
		private String phone;
		private String firstName;
		private String lastName;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PasswordKdfAlgoUnknown extends Api.TypePasswordKdfAlgo {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PasswordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow extends Api.TypePasswordKdfAlgo {
		private byte[] salt1;
		private byte[] salt2;
		private int g;
		private byte[] p;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecurePasswordKdfAlgoUnknown extends Api.TypeSecurePasswordKdfAlgo {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecurePasswordKdfAlgoPBKDF2HMACSHA512iter100000 extends Api.TypeSecurePasswordKdfAlgo {
		private byte[] salt;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecurePasswordKdfAlgoSHA512 extends Api.TypeSecurePasswordKdfAlgo {
		private byte[] salt;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureSecretSettings extends Api.TypeSecureSecretSettings {
		private Api.TypeSecurePasswordKdfAlgo secureAlgo;
		private byte[] secureSecret;
		private BigInteger secureSecretId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputCheckPasswordEmpty extends Api.TypeInputCheckPasswordSRP {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputCheckPasswordSRP extends Api.TypeInputCheckPasswordSRP {
		private BigInteger srpId;
		private byte[] A;
		private byte[] M1;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureRequiredType extends Api.TypeSecureRequiredType {
		private Boolean nativeNames;
		private Boolean selfieRequired;
		private Boolean translationRequired;
		private Api.TypeSecureValueType type;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SecureRequiredTypeOneOf extends Api.TypeSecureRequiredType {
		private Api.TypeSecureRequiredType[] types;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputAppEvent extends Api.TypeInputAppEvent {
		private double time;
		private String type;
		private BigInteger peer;
		private Api.TypeJSONValue data;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class JsonObjectValue extends Api.TypeJSONObjectValue {
		private String key;
		private Api.TypeJSONValue value;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class JsonNull extends Api.TypeJSONValue {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class JsonBool extends Api.TypeJSONValue {
		private Boolean value;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class JsonNumber extends Api.TypeJSONValue {
		private double value;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class JsonString extends Api.TypeJSONValue {
		private String value;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class JsonArray extends Api.TypeJSONValue {
		private Api.TypeJSONValue[] value;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class JsonObject extends Api.TypeJSONValue {
		private Api.TypeJSONObjectValue[] value;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageTableCell extends Api.TypePageTableCell {
		private Boolean header;
		private Boolean alignCenter;
		private Boolean alignRight;
		private Boolean valignMiddle;
		private Boolean valignBottom;
		private Api.TypeRichText text;
		private int colspan;
		private int rowspan;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageTableRow extends Api.TypePageTableRow {
		private Api.TypePageTableCell[] cells;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageCaption extends Api.TypePageCaption {
		private Api.TypeRichText text;
		private Api.TypeRichText credit;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageListItemText extends Api.TypePageListItem {
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageListItemBlocks extends Api.TypePageListItem {
		private Api.TypePageBlock[] blocks;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageListOrderedItemText extends Api.TypePageListOrderedItem {
		private String num;
		private Api.TypeRichText text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageListOrderedItemBlocks extends Api.TypePageListOrderedItem {
		private String num;
		private Api.TypePageBlock[] blocks;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PageRelatedArticle extends Api.TypePageRelatedArticle {
		private String url;
		private BigInteger webpageId;
		private String title;
		private String description;
		private BigInteger photoId;
		private String author;
		private int publishedDate;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Page extends Api.TypePage {
		private Boolean part;
		private Boolean rtl;
		private Boolean v2;
		private String url;
		private Api.TypePageBlock[] blocks;
		private Api.TypePhoto[] photos;
		private Api.TypeDocument[] documents;
		private int views;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PollAnswer extends Api.TypePollAnswer {
		private String text;
		private byte[] option;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Poll extends Api.TypePoll {
		private BigInteger id;
		private Boolean closed;
		private Boolean publicVoters;
		private Boolean multipleChoice;
		private Boolean quiz;
		private String question;
		private Api.TypePollAnswer[] answers;
		private int closePeriod;
		private int closeDate;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PollAnswerVoters extends Api.TypePollAnswerVoters {
		private Boolean chosen;
		private Boolean correct;
		private byte[] option;
		private int voters;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PollResults extends Api.TypePollResults {
		private Boolean min;
		private Api.TypePollAnswerVoters[] results;
		private int totalVoters;
		private BigInteger[] recentVoters;
		private String solution;
		private Api.TypeMessageEntity[] solutionEntities;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatOnlines extends Api.TypeChatOnlines {
		private int onlines;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StatsURL extends Api.TypeStatsURL {
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatAdminRights extends Api.TypeChatAdminRights {
		private Boolean changeInfo;
		private Boolean postMessages;
		private Boolean editMessages;
		private Boolean deleteMessages;
		private Boolean banUsers;
		private Boolean inviteUsers;
		private Boolean pinMessages;
		private Boolean addAdmins;
		private Boolean anonymous;
		private Boolean manageCall;
		private Boolean other;
		private Boolean manageTopics;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatBannedRights extends Api.TypeChatBannedRights {
		private Boolean viewMessages;
		private Boolean sendMessages;
		private Boolean sendMedia;
		private Boolean sendStickers;
		private Boolean sendGifs;
		private Boolean sendGames;
		private Boolean sendInline;
		private Boolean embedLinks;
		private Boolean sendPolls;
		private Boolean changeInfo;
		private Boolean inviteUsers;
		private Boolean pinMessages;
		private Boolean manageTopics;
		private int untilDate;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputWallPaper extends Api.TypeInputWallPaper {
		private BigInteger id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputWallPaperSlug extends Api.TypeInputWallPaper {
		private String slug;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputWallPaperNoFile extends Api.TypeInputWallPaper {
		private BigInteger id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class CodeSettings extends Api.TypeCodeSettings {
		private Boolean allowFlashcall;
		private Boolean currentNumber;
		private Boolean allowAppHash;
		private Boolean allowMissedCall;
		private byte[][] logoutTokens;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WallPaperSettings extends Api.TypeWallPaperSettings {
		private Boolean blur;
		private Boolean motion;
		private int backgroundColor;
		private int secondBackgroundColor;
		private int thirdBackgroundColor;
		private int fourthBackgroundColor;
		private int intensity;
		private int rotation;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AutoDownloadSettings extends Api.TypeAutoDownloadSettings {
		private Boolean disabled;
		private Boolean videoPreloadLarge;
		private Boolean audioPreloadNext;
		private Boolean phonecallsLessData;
		private int photoSizeMax;
		private BigInteger videoSizeMax;
		private BigInteger fileSizeMax;
		private int videoUploadMaxbitrate;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmojiKeyword extends Api.TypeEmojiKeyword {
		private String keyword;
		private String[] emoticons;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmojiKeywordDeleted extends Api.TypeEmojiKeyword {
		private String keyword;
		private String[] emoticons;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmojiKeywordsDifference extends Api.TypeEmojiKeywordsDifference {
		private String langCode;
		private int fromVersion;
		private int version;
		private Api.TypeEmojiKeyword[] keywords;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmojiURL extends Api.TypeEmojiURL {
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmojiLanguage extends Api.TypeEmojiLanguage {
		private String langCode;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Folder extends Api.TypeFolder {
		private Boolean autofillNewBroadcasts;
		private Boolean autofillPublicGroups;
		private Boolean autofillNewCorrespondents;
		private int id;
		private String title;
		private Api.TypeChatPhoto photo;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputFolderPeer extends Api.TypeInputFolderPeer {
		private Api.TypeInputPeer peer;
		private int folderId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class FolderPeer extends Api.TypeFolderPeer {
		private Api.TypePeer peer;
		private int folderId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UrlAuthResultRequest extends Api.TypeUrlAuthResult {
		private Boolean requestWriteAccess;
		private Api.TypeUser bot;
		private String domain;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UrlAuthResultAccepted extends Api.TypeUrlAuthResult {
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UrlAuthResultDefault extends Api.TypeUrlAuthResult {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelLocationEmpty extends Api.TypeChannelLocation {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelLocation extends Api.TypeChannelLocation {
		private Api.TypeGeoPoint geoPoint;
		private String address;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PeerLocated extends Api.TypePeerLocated {
		private Api.TypePeer peer;
		private int expires;
		private int distance;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PeerSelfLocated extends Api.TypePeerLocated {
		private int expires;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RestrictionReason extends Api.TypeRestrictionReason {
		private String platform;
		private String reason;
		private String text;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputTheme extends Api.TypeInputTheme {
		private BigInteger id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputThemeSlug extends Api.TypeInputTheme {
		private String slug;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Theme extends Api.TypeTheme {
		private Boolean creator;
		private Boolean defaultSuffix;
		private Boolean forChat;
		private BigInteger id;
		private BigInteger accessHash;
		private String slug;
		private String title;
		private Api.TypeDocument document;
		private Api.TypeThemeSettings[] settings;
		private String emoticon;
		private int installsCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BaseThemeClassic extends Api.TypeBaseTheme {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BaseThemeDay extends Api.TypeBaseTheme {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BaseThemeNight extends Api.TypeBaseTheme {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BaseThemeTinted extends Api.TypeBaseTheme {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BaseThemeArctic extends Api.TypeBaseTheme {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputThemeSettings extends Api.TypeInputThemeSettings {
		private Boolean messageColorsAnimated;
		private Api.TypeBaseTheme baseTheme;
		private int accentColor;
		private int outboxAccentColor;
		private int[] messageColors;
		private Api.TypeInputWallPaper wallpaper;
		private Api.TypeWallPaperSettings wallpaperSettings;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ThemeSettings extends Api.TypeThemeSettings {
		private Boolean messageColorsAnimated;
		private Api.TypeBaseTheme baseTheme;
		private int accentColor;
		private int outboxAccentColor;
		private int[] messageColors;
		private Api.TypeWallPaper wallpaper;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WebPageAttributeTheme extends Api.TypeWebPageAttribute {
		private Api.TypeDocument[] documents;
		private Api.TypeThemeSettings settings;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageUserVote extends Api.TypeMessageUserVote {
		private BigInteger userId;
		private byte[] option;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageUserVoteInputOption extends Api.TypeMessageUserVote {
		private BigInteger userId;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageUserVoteMultiple extends Api.TypeMessageUserVote {
		private BigInteger userId;
		private byte[][] options;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BankCardOpenUrl extends Api.TypeBankCardOpenUrl {
		private String url;
		private String name;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DialogFilter extends Api.TypeDialogFilter {
		private Boolean contacts;
		private Boolean nonContacts;
		private Boolean groups;
		private Boolean broadcasts;
		private Boolean bots;
		private Boolean excludeMuted;
		private Boolean excludeRead;
		private Boolean excludeArchived;
		private int id;
		private String title;
		private String emoticon;
		private Api.TypeInputPeer[] pinnedPeers;
		private Api.TypeInputPeer[] includePeers;
		private Api.TypeInputPeer[] excludePeers;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DialogFilterDefault extends Api.TypeDialogFilter {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DialogFilterSuggested extends Api.TypeDialogFilterSuggested {
		private Api.TypeDialogFilter filter;
		private String description;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StatsDateRangeDays extends Api.TypeStatsDateRangeDays {
		private int minDate;
		private int maxDate;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StatsAbsValueAndPrev extends Api.TypeStatsAbsValueAndPrev {
		private double current;
		private double previous;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StatsPercentValue extends Api.TypeStatsPercentValue {
		private double part;
		private double total;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StatsGraphAsync extends Api.TypeStatsGraph {
		private String token;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StatsGraphError extends Api.TypeStatsGraph {
		private String error;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StatsGraph extends Api.TypeStatsGraph {
		private Api.TypeDataJSON json;
		private String zoomToken;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageInteractionCounters extends Api.TypeMessageInteractionCounters {
		private int msgId;
		private int views;
		private int forwards;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class VideoSize extends Api.TypeVideoSize {
		private String type;
		private int w;
		private int h;
		private int size;
		private double videoStartTs;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StatsGroupTopPoster extends Api.TypeStatsGroupTopPoster {
		private BigInteger userId;
		private int messages;
		private int avgChars;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StatsGroupTopAdmin extends Api.TypeStatsGroupTopAdmin {
		private BigInteger userId;
		private int deleted;
		private int kicked;
		private int banned;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StatsGroupTopInviter extends Api.TypeStatsGroupTopInviter {
		private BigInteger userId;
		private int invitations;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GlobalPrivacySettings extends Api.TypeGlobalPrivacySettings {
		private Boolean archiveAndMuteNewNoncontactPeers;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageViews extends Api.TypeMessageViews {
		private int views;
		private int forwards;
		private Api.TypeMessageReplies replies;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageReplyHeader extends Api.TypeMessageReplyHeader {
		private Boolean replyToScheduled;
		private Boolean forumTopic;
		private int replyToMsgId;
		private Api.TypePeer replyToPeerId;
		private int replyToTopId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageReplies extends Api.TypeMessageReplies {
		private Boolean comments;
		private int replies;
		private int repliesPts;
		private Api.TypePeer[] recentRepliers;
		private BigInteger channelId;
		private int maxId;
		private int readMaxId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PeerBlocked extends Api.TypePeerBlocked {
		private Api.TypePeer peerId;
		private int date;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GroupCallDiscarded extends Api.TypeGroupCall {
		private BigInteger id;
		private BigInteger accessHash;
		private int duration;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GroupCall extends Api.TypeGroupCall {
		private Boolean joinMuted;
		private Boolean canChangeJoinMuted;
		private Boolean joinDateAsc;
		private Boolean scheduleStartSubscribed;
		private Boolean canStartVideo;
		private Boolean recordVideoActive;
		private Boolean rtmpStream;
		private Boolean listenersHidden;
		private BigInteger id;
		private BigInteger accessHash;
		private int participantsCount;
		private String title;
		private int streamDcId;
		private int recordStartDate;
		private int scheduleDate;
		private int unmutedVideoCount;
		private int unmutedVideoLimit;
		private int version;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputGroupCall extends Api.TypeInputGroupCall {
		private BigInteger id;
		private BigInteger accessHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GroupCallParticipant extends Api.TypeGroupCallParticipant {
		private Boolean muted;
		private Boolean left;
		private Boolean canSelfUnmute;
		private Boolean justJoined;
		private Boolean versioned;
		private Boolean min;
		private Boolean mutedByYou;
		private Boolean volumeByAdmin;
		private Boolean self;
		private Boolean videoJoined;
		private Api.TypePeer peer;
		private int date;
		private int activeDate;
		private int source;
		private int volume;
		private String about;
		private BigInteger raiseHandRating;
		private Api.TypeGroupCallParticipantVideo video;
		private Api.TypeGroupCallParticipantVideo presentation;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InlineQueryPeerTypeSameBotPM extends Api.TypeInlineQueryPeerType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InlineQueryPeerTypePM extends Api.TypeInlineQueryPeerType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InlineQueryPeerTypeChat extends Api.TypeInlineQueryPeerType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InlineQueryPeerTypeMegagroup extends Api.TypeInlineQueryPeerType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InlineQueryPeerTypeBroadcast extends Api.TypeInlineQueryPeerType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatInviteImporter extends Api.TypeChatInviteImporter {
		private Boolean requested;
		private BigInteger userId;
		private int date;
		private String about;
		private BigInteger approvedBy;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatAdminWithInvites extends Api.TypeChatAdminWithInvites {
		private BigInteger adminId;
		private int invitesCount;
		private int revokedInvitesCount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GroupCallParticipantVideoSourceGroup extends Api.TypeGroupCallParticipantVideoSourceGroup {
		private String semantics;
		private int[] sources;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GroupCallParticipantVideo extends Api.TypeGroupCallParticipantVideo {
		private Boolean paused;
		private String endpoint;
		private Api.TypeGroupCallParticipantVideoSourceGroup[] sourceGroups;
		private int audioSource;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotCommandScopeDefault extends Api.TypeBotCommandScope {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotCommandScopeUsers extends Api.TypeBotCommandScope {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotCommandScopeChats extends Api.TypeBotCommandScope {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotCommandScopeChatAdmins extends Api.TypeBotCommandScope {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotCommandScopePeer extends Api.TypeBotCommandScope {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotCommandScopePeerAdmins extends Api.TypeBotCommandScope {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotCommandScopePeerUser extends Api.TypeBotCommandScope {
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SponsoredMessage extends Api.TypeSponsoredMessage {
		private Boolean recommended;
		private Boolean showPeerPhoto;
		private byte[] randomId;
		private Api.TypePeer fromId;
		private Api.TypeChatInvite chatInvite;
		private String chatInviteHash;
		private int channelPost;
		private String startParam;
		private String message;
		private Api.TypeMessageEntity[] entities;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SearchResultsCalendarPeriod extends Api.TypeSearchResultsCalendarPeriod {
		private int date;
		private int minMsgId;
		private int maxMsgId;
		private int count;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SearchResultPosition extends Api.TypeSearchResultsPosition {
		private int msgId;
		private int date;
		private int offset;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReactionCount extends Api.TypeReactionCount {
		private int chosenOrder;
		private Api.TypeReaction reaction;
		private int count;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageReactions extends Api.TypeMessageReactions {
		private Boolean min;
		private Boolean canSeeList;
		private Api.TypeReactionCount[] results;
		private Api.TypeMessagePeerReaction[] recentReactions;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AvailableReaction extends Api.TypeAvailableReaction {
		private Boolean inactive;
		private Boolean premium;
		private String reaction;
		private String title;
		private Api.TypeDocument staticIcon;
		private Api.TypeDocument appearAnimation;
		private Api.TypeDocument selectAnimation;
		private Api.TypeDocument activateAnimation;
		private Api.TypeDocument effectAnimation;
		private Api.TypeDocument aroundAnimation;
		private Api.TypeDocument centerIcon;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessagePeerReaction extends Api.TypeMessagePeerReaction {
		private Boolean big;
		private Boolean unread;
		private Api.TypePeer peerId;
		private Api.TypeReaction reaction;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GroupCallStreamChannel extends Api.TypeGroupCallStreamChannel {
		private int channel;
		private int scale;
		private BigInteger lastTimestampMs;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AttachMenuBotIconColor extends Api.TypeAttachMenuBotIconColor {
		private String name;
		private int color;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AttachMenuBotIcon extends Api.TypeAttachMenuBotIcon {
		private String name;
		private Api.TypeDocument icon;
		private Api.TypeAttachMenuBotIconColor[] colors;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AttachMenuBot extends Api.TypeAttachMenuBot {
		private Boolean inactive;
		private Boolean hasSettings;
		private BigInteger botId;
		private String shortName;
		private Api.TypeAttachMenuPeerType[] peerTypes;
		private Api.TypeAttachMenuBotIcon[] icons;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AttachMenuBotsNotModified extends Api.TypeAttachMenuBots {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AttachMenuBots extends Api.TypeAttachMenuBots {
		private BigInteger hash;
		private Api.TypeAttachMenuBot[] bots;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AttachMenuBotsBot extends Api.TypeAttachMenuBotsBot {
		private Api.TypeAttachMenuBot bot;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WebViewResultUrl extends Api.TypeWebViewResult {
		private BigInteger queryId;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SimpleWebViewResultUrl extends Api.TypeSimpleWebViewResult {
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class WebViewMessageSent extends Api.TypeWebViewMessageSent {
		private Api.TypeInputBotInlineMessageID msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotMenuButtonDefault extends Api.TypeBotMenuButton {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotMenuButtonCommands extends Api.TypeBotMenuButton {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BotMenuButton extends Api.TypeBotMenuButton {
		private String text;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class NotificationSoundDefault extends Api.TypeNotificationSound {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class NotificationSoundNone extends Api.TypeNotificationSound {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class NotificationSoundLocal extends Api.TypeNotificationSound {
		private String title;
		private String data;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class NotificationSoundRingtone extends Api.TypeNotificationSound {
		private BigInteger id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AttachMenuPeerTypeSameBotPM extends Api.TypeAttachMenuPeerType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AttachMenuPeerTypeBotPM extends Api.TypeAttachMenuPeerType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AttachMenuPeerTypePM extends Api.TypeAttachMenuPeerType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AttachMenuPeerTypeChat extends Api.TypeAttachMenuPeerType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AttachMenuPeerTypeBroadcast extends Api.TypeAttachMenuPeerType {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputInvoiceMessage extends Api.TypeInputInvoice {
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputInvoiceSlug extends Api.TypeInputInvoice {
		private String slug;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStorePaymentPremiumSubscription extends Api.TypeInputStorePaymentPurpose {
		private Boolean restore;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InputStorePaymentGiftPremium extends Api.TypeInputStorePaymentPurpose {
		private Api.TypeInputUser userId;
		private String currency;
		private BigInteger amount;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PremiumGiftOption extends Api.TypePremiumGiftOption {
		private int months;
		private String currency;
		private BigInteger amount;
		private String botUrl;
		private String storeProduct;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PaymentFormMethod extends Api.TypePaymentFormMethod {
		private String url;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmojiStatusEmpty extends Api.TypeEmojiStatus {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmojiStatus extends Api.TypeEmojiStatus {
		private BigInteger documentId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmojiStatusUntil extends Api.TypeEmojiStatus {
		private BigInteger documentId;
		private int until;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReactionEmpty extends Api.TypeReaction {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReactionEmoji extends Api.TypeReaction {
		private String emoticon;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReactionCustomEmoji extends Api.TypeReaction {
		private BigInteger documentId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatReactionsNone extends Api.TypeChatReactions {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatReactionsAll extends Api.TypeChatReactions {
		private Boolean allowCustom;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChatReactionsSome extends Api.TypeChatReactions {
		private Api.TypeReaction[] reactions;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmailVerifyPurposeLoginSetup extends Api.TypeEmailVerifyPurpose {
		private String phoneNumber;
		private String phoneCodeHash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmailVerifyPurposeLoginChange extends Api.TypeEmailVerifyPurpose {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmailVerifyPurposePassport extends Api.TypeEmailVerifyPurpose {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmailVerificationCode extends Api.TypeEmailVerification {
		private String code;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmailVerificationGoogle extends Api.TypeEmailVerification {
		private String token;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EmailVerificationApple extends Api.TypeEmailVerification {
		private String token;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PremiumSubscriptionOption extends Api.TypePremiumSubscriptionOption {
		private Boolean current;
		private Boolean canPurchaseUpgrade;
		private int months;
		private String currency;
		private BigInteger amount;
		private String botUrl;
		private String storeProduct;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendAsPeer extends Api.TypeSendAsPeer {
		private Boolean premiumRequired;
		private Api.TypePeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageExtendedMediaPreview extends Api.TypeMessageExtendedMedia {
		private int w;
		private int h;
		private Api.TypePhotoSize thumb;
		private int videoDuration;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class MessageExtendedMedia extends Api.TypeMessageExtendedMedia {
		private Api.TypeMessageMedia media;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class StickerKeyword extends Api.TypeStickerKeyword {
		private BigInteger documentId;
		private String[] keyword;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Username extends Api.TypeUsername {
		private Boolean editable;
		private Boolean active;
		private String username;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ForumTopicDeleted extends Api.TypeForumTopic {
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ForumTopic extends Api.TypeForumTopic {
		private Boolean my;
		private Boolean closed;
		private Boolean pinned;
		private Boolean shortSuffix;
		private int id;
		private int date;
		private String title;
		private int iconColor;
		private BigInteger iconEmojiId;
		private int topMessage;
		private int readInboxMaxId;
		private int readOutboxMaxId;
		private int unreadCount;
		private int unreadMentionsCount;
		private int unreadReactionsCount;
		private Api.TypePeer fromId;
		private Api.TypePeerNotifySettings notifySettings;
		private Api.TypeDraftMessage draft;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReqPq extends Api.TypeResPQ {
		private BigInteger nonce;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReqPqMulti extends Api.TypeResPQ {
		private BigInteger nonce;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReqPqMultiNew extends Api.TypeResPQ {
		private BigInteger nonce;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReqDHParams extends Api.TypeServer_DH_Params {
		private BigInteger nonce;
		private BigInteger serverNonce;
		private byte[] p;
		private byte[] q;
		private BigInteger publicKeyFingerprint;
		private byte[] encryptedData;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SetClientDHParams extends Api.TypeSet_client_DH_params_answer {
		private BigInteger nonce;
		private BigInteger serverNonce;
		private byte[] encryptedData;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DestroyAuthKey extends Api.TypeDestroyAuthKeyRes {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RpcDropAnswer extends Api.TypeRpcDropAnswer {
		private BigInteger reqMsgId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetFutureSalts extends Api.TypeFutureSalts {
		private int num;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class Ping extends Api.TypePong {
		private BigInteger pingId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class PingDelayDisconnect extends Api.TypePong {
		private BigInteger pingId;
		private int disconnectDelay;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DestroySession extends Api.TypeDestroySessionRes {
		private BigInteger sessionId;
	}

	@Data
	public static class InvokeAfterMsg {
		private BigInteger msgId;
		private Object query;
	}

	@Data
	public static class InvokeAfterMsgs {
		private BigInteger[] msgIds;
		private Object query;
	}

	@Data
	public static class InitConnection {
		private int apiId;
		private String deviceModel;
		private String systemVersion;
		private String appVersion;
		private String systemLangCode;
		private String langPack;
		private String langCode;
		private Api.TypeInputClientProxy proxy;
		private Api.TypeJSONValue params;
		private Object query;
	}

	@Data
	public static class InvokeWithLayer {
		private int layer;
		private Object query;
	}

	@Data
	public static class InvokeWithoutUpdates {
		private Object query;
	}

	@Data
	public static class InvokeWithMessagesRange {
		private Api.TypeMessageRange range;
		private Object query;
	}

	@Data
	public static class InvokeWithTakeout {
		private BigInteger takeoutId;
		private Object query;
	}
}
