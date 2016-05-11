package cursevoicelib.restapi.containers;

public class UserContainer {
    private final String mUsername;
    private final int mId;
    
    public UserContainer(String username, int id) {
        mUsername = username;
        mId = id;
    }
    
    public String getUsername() {
        return mUsername;
    }
    
    public int getId() {
        return mId;
    }
}
