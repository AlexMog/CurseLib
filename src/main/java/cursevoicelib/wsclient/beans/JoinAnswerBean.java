package cursevoicelib.wsclient.beans;

public class JoinAnswerBean extends Packet {
    public JoinAnswerBean() {
        super(-815187584);
    }
    
    public String EncryptedSessionKey, ServerTime;
    public int Status;
}
