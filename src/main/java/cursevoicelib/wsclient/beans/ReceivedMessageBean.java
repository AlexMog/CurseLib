package cursevoicelib.wsclient.beans;

public class ReceivedMessageBean extends Packet {

    public ReceivedMessageBean() {
        super(-635182161);
    }
    
    public class BodyBean {
        // TODO: Attachments, ContentTags, LikeUserIDs, LikeUsernames, Mentions, SenderRoles
        public String Body, ClientID, ContactID, ConversationID,
            RootConversationID, SenderName, ServerID, DeletedUsername,
            EditedUsername;
        public int ConversationType, DeletedUserID,
            EditedUserID, LikeCount, NotificationType, RecipientID,
            SenderID, SenderPermissions, SenderVanityRole;
        public boolean IsDeleted;
        public long Timestamp, DeletedTimestamp, EditedTimestamp;
    }
    
    public BodyBean Body;
}
