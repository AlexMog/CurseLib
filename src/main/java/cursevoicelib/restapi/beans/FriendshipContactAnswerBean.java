package cursevoicelib.restapi.beans;

public class FriendshipContactAnswerBean {
    public int Status, OtherUserID, OtherUserRegionID, OtherUserConnectionStatus, OtherUserGameID, OtherUserGameState,
        UnreadCount, MutualFriendCount;
    public long OtherUserConnectionStatusTimestamp, RequestedTimestamp, AvatarTimestamp;
    public String OtherUsername, OtherUserNickname, InvitationMessage, OtherUserStatusMessage,
        OtherUserGameStatusMessage, OtherUserGameTimestamp, OtherUserAvatarUrl, DateConfirmed, DateMessaged,
        DateRead;
    public boolean IsFavorite;
}
