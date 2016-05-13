package cursevoicelib.restapi;

import cursevoicelib.restapi.accessors.ContactsAccessor;
import cursevoicelib.restapi.accessors.LoginAccessor;
import cursevoicelib.restapi.accessors.SessionsAccessor;

public class RestApi {
    private static final String REPORTING_URL = "https://reporting-v1.curseapp.net/",
            GIVEAWAYS_URL = "https://giveaways-v1.curseapp.net/",
            GROUPS_URL = "https://groups-v1.curseapp.net/",
            SYNC_URL = "https://sync-v1.curseapp.net/",
            POOL_URL = "https://polls-v1.curseapp.net/",
            CONVERSATION_URL = "https://conversations-v1.curseapp.net/";
    private ApiRequester mRequester = new ApiRequester();
    private final LoginAccessor mLoginAccessor = new LoginAccessor(mRequester);
    private final SessionsAccessor mSessionsAccessor = new SessionsAccessor(mRequester);
    private final ContactsAccessor mContactsAccessor = new ContactsAccessor(mRequester);
    
    /**
     * Return true if the client is already authenticated
     * @return
     */
    public boolean isAuthenticated() {
        return mLoginAccessor.isAuthenticated();
    }
    
    /**
     * Clears the cookies
     */
    public void clearCookies() {
        mRequester.clearCookies();
    }
    
    /**
     * Get the login accessor for the Logins API
     * @return
     */
    public LoginAccessor getLoginAccessor() {
        return mLoginAccessor;
    }
    
    /**
     * Get the accessor for the Sessions API
     * @return
     */
    public SessionsAccessor getSessionsAccessor() {
        return mSessionsAccessor;
    }
    
    /**
     * Get the Accessor for the Contacts API
     * @return
     */
    public ContactsAccessor getContactsAccessor() {
        return mContactsAccessor;
    }
}
