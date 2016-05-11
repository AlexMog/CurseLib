package cursevoicelib.restapi.containers;

public class SenderContainer extends UserContainer {
    private final int mPermissions, mVanityRole;
    private final int[] mRoles;

    public SenderContainer(String username, int id, int permissions, int vanityRole, int[] roles) {
        super(username, id);
        mPermissions = permissions;
        mVanityRole = vanityRole;
        mRoles = roles;
    }
    
    public int getPermissions() {
        return mPermissions;
    }
    
    public int getVanityRole() {
        return mVanityRole;
    }
    
    public int[] getRoles() {
        return mRoles;
    }
}
