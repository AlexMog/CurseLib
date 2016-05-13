package cursevoicelib.restapi.accessors;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;

import cursevoicelib.helpers.GsonHelper;
import cursevoicelib.restapi.ApiRequester;
import cursevoicelib.restapi.ApiResponse;
import cursevoicelib.restapi.beans.SessionAnswerBean;
import cursevoicelib.restapi.beans.SessionRequestBean;

public class SessionsAccessor extends ApiAccessor {
    private static final String SESSIONS_URL = "https://sessions-v1.curseapp.net/";

    public SessionsAccessor(ApiRequester requester) {
        super(requester);
    }

    /***
     * 
     * @param machineKey
     * @param platform platforms: 0: windows, 1: mac, 2: ios, 3: android, 4: WindowsPhone, 5: blackberry, 6: chrome, 7: unknown
     * @return
     * @throws URISyntaxException 
     * @throws IOException 
     * @throws ClientProtocolException 
     */
    public SessionAnswerBean generateSession(SessionRequestBean request) throws ClientProtocolException, IOException, URISyntaxException {
        ApiResponse resp = mRequester.doPost(SESSIONS_URL + "sessions",
                new BasicNameValuePair("MachineKey", request.MachineKey),
                new BasicNameValuePair("Platform", Integer.toString(request.Platform)),
                new BasicNameValuePair("DeviceID", request.DeviceID),
                new BasicNameValuePair("PushKitToken", request.PushKitToken));
        return GsonHelper.fromJson(resp.getContent(), SessionAnswerBean.class);
    }
    
    /***
     * Removes the session cookie
     * @throws URISyntaxException 
     * @throws IOException 
     * @throws ClientProtocolException 
     */
    public void removeSessions() throws ClientProtocolException, IOException, URISyntaxException {
        mRequester.doDelete(SESSIONS_URL + "sessions");
    }
    
    /**
     * Removes the session of a specific device
     * @param machineKey
     * @param deviceId
     * @throws ClientProtocolException
     * @throws IOException
     * @throws URISyntaxException
     */
    public void removeSession(String machineKey, String deviceId) throws ClientProtocolException, IOException, URISyntaxException {
        mRequester.doDelete(SESSIONS_URL + "sessions/" + machineKey + "/tokens/" + deviceId);
    }
}
