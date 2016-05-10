package cursevoicelib.wsclient.beans;

public class SendMessageBean extends Packet {
    public SendMessageBean() {
        super(-2124552136);
    }

    public class BodyBean {
        public String AttachmentID, ClientID, ConversationID, Message;
    }
    
    public BodyBean Body = new BodyBean();
}
