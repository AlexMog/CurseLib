package cursevoicelib.restapi.accessors;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;

import cursevoicelib.helpers.GsonHelper;
import cursevoicelib.restapi.ApiRequester;
import cursevoicelib.wsclient.beans.ReceivedMessageBean;

public class ConversationsAccessor extends ApiAccessor {
    private static final String CONVERSATION_URL = "https://conversations-v1.curseapp.net/";

    public ConversationsAccessor(ApiRequester requester) {
        super(requester);
    }
    
    public ReceivedMessageBean getMessages(String conversationId, long endTimestamp, int pageSize) throws ClientProtocolException, IOException, URISyntaxException {
        return GsonHelper.fromJson(mRequester.doGet(CONVERSATION_URL + "/conversations/" + conversationId
                    + "?endTimestamp=" + endTimestamp + "&pageSize=" + pageSize).getContent(),
                ReceivedMessageBean.class);
    }
    
    public void editMessage(String conversationId, String messageId, long messageTimestamp, String text, int[] mentions) throws ClientProtocolException, IOException, URISyntaxException {
        mRequester.doPost(CONVERSATION_URL + "conversations/" + conversationId
                + "/" + messageId + "-" + messageTimestamp,
            new BasicNameValuePair("Body", text),
            new BasicNameValuePair("Mentions", GsonHelper.toJson(mentions != null ? mentions : new int[0])));
    }
    
    public void deleteMessage(String conversationId, String messageId, long messageTimestamp) throws ClientProtocolException, IOException, URISyntaxException {
        mRequester.doDelete(CONVERSATION_URL + "conversations/" + conversationId
                + "/" + messageId + "-" + messageTimestamp);
    }
    
    
    public void likeMessage(String conversationId, String messageId, long messageTimestamp) throws ClientProtocolException, IOException, URISyntaxException {
        mRequester.doPost(CONVERSATION_URL + "conversations/" + conversationId
                + "/" + messageId + "-" + messageTimestamp + "/like");
    }
    
    public void unlikeMessage(String conversationId, String messageId, long messageTimestamp) throws ClientProtocolException, IOException, URISyntaxException {
        mRequester.doPost(CONVERSATION_URL + "conversations/" + conversationId
                + "/" + messageId + "-" + messageTimestamp + "/unlike");
    }
    // TODO: Attachments management and search
}
