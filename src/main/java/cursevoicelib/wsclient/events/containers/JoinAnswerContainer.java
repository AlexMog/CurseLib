package cursevoicelib.wsclient.events.containers;

public class JoinAnswerContainer {
    private final String mEncryptedSessionKey, mServerTime;
    private final int mStatus;
    
    public JoinAnswerContainer(String encryptedSessionKey, String serverTime, int status) {
        mEncryptedSessionKey = encryptedSessionKey;
        mServerTime = serverTime;
        mStatus = status;
    }
    
    public String getEncryptedSessionKey() {
        return mEncryptedSessionKey;
    }
    
    public String getServerTime() {
        return mServerTime;
    }
    
    public int getStatus() {
        return mStatus;
    }
}
