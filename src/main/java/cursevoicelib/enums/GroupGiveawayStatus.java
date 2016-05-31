package cursevoicelib.enums;

public enum GroupGiveawayStatus {
    /**
     * Giveaway is active
     */
    Active(0),
    /**
     * Giveaway is closed for registery, and rolling dices.
     */
    Rolling(1),
    /**
     * Wiaing for the claim from the user who won
     */
    WaitingForClaim(2),
    /**
     * Already claimed.
     */
    Claimed(3),
    /**
     * Ended.
     */
    Ended(4),
    /**
     * Not active anymore.
     */
    Inactive(5);
    
    private final int value;

    GroupGiveawayStatus(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
    
    public static GroupGiveawayStatus valueOf(int value) {
        for (GroupGiveawayStatus l : GroupGiveawayStatus.values()) {
            if (l.getValue() == value) return l;
        }
        throw new IllegalArgumentException("Not found");
     }
}
