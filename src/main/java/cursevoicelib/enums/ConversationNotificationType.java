package cursevoicelib.enums;

public enum ConversationNotificationType {
    /**
     * New message received
     */
    Normal(0),
    /**
     * A message have been edited
     */
    Edited(1),
    /**
     * A message have been liked
     */
    Liked(2),
    /**
     * A message have been deleted
     */
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
