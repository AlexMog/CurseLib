package cursevoicelib.wsclient.events;

import cursevoicelib.CurseClient;
import cursevoicelib.restapi.containers.MessageContainer;

public class MessageEvent extends ClientEvent {
    private final MessageContainer mMessage;

    public MessageEvent(CurseClient client, MessageContainer message) {
        super(client);
        mMessage = message;
    }

    public MessageContainer getMessage() {
        return mMessage;
    }
}
