package cursevoicelib.restapi.beans;

public class SessionAnswerBean {
    public class UserBean {
        public int UserID, ConnectionStatus, FriendCount, CurrentGameID, CurrentGameState, GroupMessagePushPreference, FriendMessagePushPregerence;
        public boolean FriendRequestPushEnabled, MentionsPushEnabled;
        public String Username, CustomStatusMessage, CustomStatusTimestamp, AvatarUrl, CurrentGameStatusMessage, CurrentGameTimestamp;
    }
    
    public String SessionID, MachineKey;
    public UserBean User;
    public int[] Platforms;
}
