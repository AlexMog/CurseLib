package cursevoicelib.restapi.accessors;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import cursevoicelib.helpers.GsonHelper;
import cursevoicelib.restapi.ApiRequester;
import cursevoicelib.restapi.ApiResponse;
import cursevoicelib.restapi.beans.ContactsAnswerBean;
import cursevoicelib.restapi.beans.FriendshipContactAnswerBean;

public class ContactsAccessor extends ApiAccessor {
    private static final String CONTACTS_URL = "https://contacts-v1.curseapp.net/";
    
    public ContactsAccessor(ApiRequester requester) {
        super(requester);
    }
    
    /**
     * Get the contact list
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @throws URISyntaxException
     */
    public ContactsAnswerBean getContacts() throws ClientProtocolException, IOException, URISyntaxException {
        ApiResponse resp = mRequester.doGet(CONTACTS_URL + "contacts");
        return GsonHelper.fromJson(resp.getContent(), ContactsAnswerBean.class);
    }
    
    /**
     * Get a friendship using its ID
     * @param friendshipId
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @throws URISyntaxException
     */
    public FriendshipContactAnswerBean getFriendship(String friendshipId) throws ClientProtocolException, IOException, URISyntaxException {
        ApiResponse resp = mRequester.doGet(CONTACTS_URL + "friendship/" + friendshipId);
        return GsonHelper.fromJson(resp.getContent(), FriendshipContactAnswerBean.class);
    }
}
