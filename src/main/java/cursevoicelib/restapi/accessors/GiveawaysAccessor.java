package cursevoicelib.restapi.accessors;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;

import cursevoicelib.helpers.GsonHelper;
import cursevoicelib.restapi.ApiRequester;
import cursevoicelib.restapi.beans.ActiveGiveawayAnswerBean;

public class GiveawaysAccessor extends ApiAccessor {
    private static final String GIVEAWAYS_URL = "https://giveaways-v1.curseapp.net/";

    public GiveawaysAccessor(ApiRequester requester) {
        super(requester);
    }

    /**
     * Get the current active Giveaway from the goup Id
     * @param groupId
     * @return
     * @throws ClientProtocolException
     * @throws IOException
     * @throws URISyntaxException
     */
    public ActiveGiveawayAnswerBean getGiveaway(String groupId) throws ClientProtocolException, IOException, URISyntaxException {
        return GsonHelper.fromJson(mRequester.doGet(GIVEAWAYS_URL + "/" + groupId).getContent(), ActiveGiveawayAnswerBean.class);
    }
    
    // TODO: Other methods
}
