package cursevoicelib.enums;

public enum FriendshipStatus {
    AwaitingMe(0),
    AwaitingThem(1),
    Confirmed(2),
    DeclinedByMe(3),
    DeclinedByThem(4),
    Removing(5),
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
