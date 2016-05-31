package cursevoicelib.restapi.accessors;

import cursevoicelib.restapi.ApiRequester;

public class SyncAccessor extends ApiAccessor {
    private static final String SYNC_URL = "https://sync-v1.curseapp.net/";

    public SyncAccessor(ApiRequester requester) {
        super(requester);
    }

    // TODO: All
}
