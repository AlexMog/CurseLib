package cursevoicelib.wsclient.beans;

public class JoinRequestBean extends Packet {
    public JoinRequestBean() {
        super(-2101997347);
        Body = new BodyBean();
    }
    
    public class BodyBean {
        public int CipherAlgorithm, CipherStrength, Status, UserID;
        public String ClientVersion, MachineKey, PublicKey, SessionID;
    }
    
    public BodyBean Body;
}
