package cursevoicelib.enums;

public enum ConversationType {
    /**
     * Friendship conversation
     */
    Friendship(0),
    /**
     * Group conversation
     */
    Group(1),
    /**
     * AdHoc conversation
     */
    AdHoc(2),
    /**
     * Private conversation
     */
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
