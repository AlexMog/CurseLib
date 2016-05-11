package cursevoicelib.enums;

public enum ConversationNotificationType {
    Normal(0),
    Edited(1),
    Liked(2),
    Deleted(3);
    
    private final int value;

    ConversationNotificationType(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
    
    public static ConversationNotificationType valueOf(int value) {
        for (ConversationNotificationType l : ConversationNotificationType.values()) {
            if (l.getValue() == value) return l;
        }
        throw new IllegalArgumentException("Not found");
     }
}
