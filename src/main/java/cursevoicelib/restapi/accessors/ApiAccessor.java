package cursevoicelib.restapi.accessors;

import cursevoicelib.restapi.ApiRequester;

public abstract class ApiAccessor {
    protected ApiRequester mRequester;
    
    public ApiAccessor(ApiRequester requester) {
        if (requester == null) throw new NullPointerException("Requester cannot be null");
        mRequester = requester;
    }
    
    public ApiRequester getRequester() {
        return mRequester;
    }
    
    public void setRequester(ApiRequester requester) {
        mRequester = requester;
    }
}
