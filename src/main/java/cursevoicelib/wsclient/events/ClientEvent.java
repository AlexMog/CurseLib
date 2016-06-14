package cursevoicelib.wsclient.events;

import cursevoicelib.CurseClient;

public abstract class ClientEvent {
    protected final CurseClient mClient;
    
    public ClientEvent(CurseClient client) {
        mClient = client;
    }
    
    public CurseClient getCurseClient() {
        return mClient;
    }
}
