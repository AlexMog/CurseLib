package cursevoicelib.restapi.containers;

import cursevoicelib.enums.ConversationNotificationType;
import cursevoicelib.enums.ConversationType;

public class MessageContainer {
    private final String mConversationId, mRootConversationId, mText, mClientId, mServerId, mContactId;
    private final int mLikeCount, mRecipentId;
    private final ConversationType mConversationType;
    private final ConversationNotificationType mNotificationType;
    private final long mTimestamp, mDeletedTimestamp, mEditedTimestamp;
    private final boolean mIsDeleted;
    private final SenderContainer mSender;
    //TODO: Edited user and Deleted User
    //TODO: Replace ALL "ids" by their object models/value, after getting them from the API
    
    public MessageContainer(SenderContainer sender, String conversationId, String rootConversationId, String text, String clientId, String serverId,
            String contactId, int likeCount, ConversationType conversationType, ConversationNotificationType notificationType,
            long timestamp, long deletedTimestamp, long editedTimestamp, boolean isDeleted, int recipentId) {
        mConversationId = conversationId;
        mRootConversationId = rootConversationId;
        mText = text;
        mClientId = clientId;
        mServerId = serverId;
        mContactId = contactId;
        mLikeCount = likeCount;
        mConversationType = conversationType;
        mNotificationType = notificationType;
        mTimestamp = timestamp;
        mDeletedTimestamp = deletedTimestamp;
        mEditedTimestamp = editedTimestamp;
        mIsDeleted = isDeleted;
        mSender = sender;
        mRecipentId = recipentId;
    }
    
    public int getRecipentId() {
        return mRecipentId;
    }
    
    public boolean isDeleted() {
        return mIsDeleted;
    }
    
    public long getEditedTimestamp() {
        return mEditedTimestamp;
    }
    
    public long getDeletedTimestamp() {
        return mDeletedTimestamp;
    }
    
    public long getTimestamp() {
        return mTimestamp;
    }
    
    public ConversationNotificationType getNotificationType() {
        return mNotificationType;
    }
    
    public ConversationType getConversationType() {
        return mConversationType;
    }
    
    public int getLikeCount() {
        return mLikeCount;
    }
    
    public String getContactId() {
        return mContactId;
    }
    
    public String getServerId() {
        return mServerId;
    }
    
    public String getclientId() {
        return mClientId;
    }
    
    public String getText() {
        return mText;
    }
    
    public String getRootConversationId() {
        return mRootConversationId;
    }
    
    public String getConversationId() {
        return mConversationId;
    }
    
    public SenderContainer getSender() {
        return mSender;
    }
}
