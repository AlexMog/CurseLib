package cursevoicelib.enums;

public enum FriendshipStatus {
    /**
     * Waiting for your answer
     */
    AwaitingMe(0),
    /**
     * Waiting for the other answer
     */
    AwaitingThem(1),
    /**
     * Confirmed friendship
     */
    Confirmed(2),
    /**
     * Declined by you
     */
    DeclinedByMe(3),
    /**
     * Declined by the second user
     */
    DeclinedByThem(4),
    /**
     * Removed
     */
    Removing(5),
    /**
     * Deleted
     */
    Deleted(6);
    
    private final int value;

    FriendshipStatus(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
    
    public static FriendshipStatus valueOf(int value) {
        for (FriendshipStatus l : FriendshipStatus.values()) {
            if (l.getValue() == value) return l;
        }
        throw new IllegalArgumentException("Not found");
     }
}
