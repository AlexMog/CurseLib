package cursevoicelib.restapi;

import cursevoicelib.restapi.accessors.ContactsAccessor;
import cursevoicelib.restapi.accessors.ConversationsAccessor;
import cursevoicelib.restapi.accessors.GiveawaysAccessor;
import cursevoicelib.restapi.accessors.GroupsAccessor;
import cursevoicelib.restapi.accessors.LoginAccessor;
import cursevoicelib.restapi.accessors.PollsAccessor;
import cursevoicelib.restapi.accessors.ReportingAccessor;
import cursevoicelib.restapi.accessors.SessionsAccessor;
import cursevoicelib.restapi.accessors.SyncAccessor;

public class RestApi {
    private ApiRequester mRequester = new ApiRequester();
    private final LoginAccessor mLoginAccessor = new LoginAccessor(mRequester);
    private final SessionsAccessor mSessionsAccessor = new SessionsAccessor(mRequester);
    private final ContactsAccessor mContactsAccessor = new ContactsAccessor(mRequester);
    private final ConversationsAccessor mConversationsAccessors = new ConversationsAccessor(mRequester);
    private final GiveawaysAccessor mGiveawaysAccessor = new GiveawaysAccessor(mRequester);
    private final GroupsAccessor mGroupsAccessor = new GroupsAccessor(mRequester);
    private final PollsAccessor mPollsAccessor = new PollsAccessor(mRequester);
    private final ReportingAccessor mReportingAccessor = new ReportingAccessor(mRequester);
    private final SyncAccessor mSyncAccessor = new SyncAccessor(mRequester);
    
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
    
    /**
     * Get the Accessor for the Conversations API
     * @return
     */
    public ConversationsAccessor getConversationsAccessor() {
        return mConversationsAccessors;
    }
    
    /**
     * Get the Accessor for the Giveaways API
     * @return
     */
    public GiveawaysAccessor getGiveawaysAccessor() {
        return mGiveawaysAccessor;
    }
    
    /**
     * Get the Accessor for the Groups API
     * @return
     */
    public GroupsAccessor getGroupsAccessor() {
        return mGroupsAccessor;
    }
    
    /**
     * Get the Accessor for the Polls API
     * @return
     */
    public PollsAccessor getPollsAccessor() {
        return mPollsAccessor;
    }
    
    /**
     * Get the Accessor for the Reporting API
     * @return
     */
    public ReportingAccessor getReportingAccessor() {
        return mReportingAccessor;
    }
    
    /**
     * Get the Accessor for the Sync API
     * @return
     */
    public SyncAccessor getSyncAccessor() {
        return mSyncAccessor;
    }
}
