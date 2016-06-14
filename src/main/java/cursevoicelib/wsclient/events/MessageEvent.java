package cursevoicelib.wsclient.events;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;

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
    
    public void edit(String newContent) throws ClientProtocolException, IOException, URISyntaxException {
        mClient.getRestApi().getConversationsAccessor()
            .editMessage(mMessage.getConversationId(), mMessage.getClientId(), mMessage.getTimestamp(), newContent, null);
    }
    
    public void delete() throws ClientProtocolException, IOException, URISyntaxException {
        mClient.getRestApi().getConversationsAccessor()
            .deleteMessage(mMessage.getConversationId(), mMessage.getClientId(), mMessage.getTimestamp());
    }
    
    public void like() throws ClientProtocolException, IOException, URISyntaxException {
        mClient.getRestApi().getConversationsAccessor()
            .likeMessage(mMessage.getConversationId(), mMessage.getClientId(), mMessage.getTimestamp());
    }
    
    public void unlike() throws ClientProtocolException, IOException, URISyntaxException {
        mClient.getRestApi().getConversationsAccessor()
            .unlikeMessage(mMessage.getConversationId(), mMessage.getClientId(), mMessage.getTimestamp());
    }
}
