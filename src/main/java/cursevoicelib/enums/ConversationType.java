package cursevoicelib.enums;

public enum ConversationType {
    Friendship(0),
    Group(1),
    AdHoc(2),
    GroupPrivateConversation(3);
    
    private final int value;

    ConversationType(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
    
    public static ConversationType valueOf(int value) {
        for (ConversationType l : ConversationType.values()) {
            if (l.getValue() == value) return l;
        }
        throw new IllegalArgumentException("Not found");
     }
}
