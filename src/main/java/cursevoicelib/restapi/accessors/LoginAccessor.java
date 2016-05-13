package cursevoicelib.restapi.accessors;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.message.BasicNameValuePair;

import cursevoicelib.exceptions.AuthenticationFailedException;
import cursevoicelib.helpers.GsonHelper;
import cursevoicelib.restapi.ApiRequester;
import cursevoicelib.restapi.ApiResponse;
import cursevoicelib.restapi.beans.LoginAnswerBean;

public class LoginAccessor extends ApiAccessor {
    private static final String LOGINS_URL = "https://logins-v1.curseapp.net/";
    private boolean mAuthenticated = false;

    public LoginAccessor(ApiRequester requester) {
        super(requester);
    }
    
    /**
     * Authenticate to the API
     * @param username
     * @param password
     * @return
     * @throws IOException
     * @throws URISyntaxException
     * @throws AuthenticationFailedException
     */
    public LoginAnswerBean authenticate(String username, String password) throws IOException, URISyntaxException, AuthenticationFailedException {
        ApiResponse resp = mRequester.doPost(LOGINS_URL + "login",
                new BasicNameValuePair("Username", username),
                new BasicNameValuePair("Password", password));
        // if the answer is not 200, we are not authenticated
        if (resp.getCode() != 200) {
            mAuthenticated = false;
            throw new AuthenticationFailedException();
        }
        mAuthenticated = true;
        LoginAnswerBean bean = GsonHelper.fromJson(resp.getContent(), LoginAnswerBean.class);
        mRequester.setToken(bean.Session.Token);
        return bean;
    }
    
    //TODO: add the other login methods, and the register methods from the API (https://logins-v1.curseapp.net/help)
    
    /**
     * Return true if already authenticated
     * @return
     */
    public boolean isAuthenticated() {
        return mAuthenticated;
    }
}
