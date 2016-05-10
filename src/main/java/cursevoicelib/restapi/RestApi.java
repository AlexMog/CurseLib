package cursevoicelib.restapi;

import cursevoicelib.restapi.accessors.LoginAccessor;
import cursevoicelib.restapi.accessors.SessionsAccessor;

public class RestApi {
    private static final String CONTACTS_URL = "https://contacts-v1.curseapp.net/",
            REPORTING_URL = "https://reporting-v1.curseapp.net/",
            GIVEAWAYS_URL = "https://giveaways-v1.curseapp.net/",
            GROUPS_URL = "https://groups-v1.curseapp.net/",
            SYNC_URL = "https://sync-v1.curseapp.net/",
            POOL_URL = "https://polls-v1.curseapp.net/",
            CONVERSATION_URL = "https://conversations-v1.curseapp.net/";
    private ApiRequester mRequester = new ApiRequester();
    private final LoginAccessor mLoginAccessor = new LoginAccessor(mRequester);
    private final SessionsAccessor mSessionsAccessor = new SessionsAccessor(mRequester);
    
    public boolean isAuthenticated() {
        return mLoginAccessor.isAuthenticated();
    }
    
    public void clearCookies() {
        mRequester.clearCookies();
    }
    
    public LoginAccessor getLoginAccessor() {
        return mLoginAccessor;
    }
    
    public SessionsAccessor getSessionsAccessor() {
        return mSessionsAccessor;
    }
}
