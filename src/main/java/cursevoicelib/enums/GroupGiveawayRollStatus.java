package cursevoicelib.enums;

public enum GroupGiveawayRollStatus {
    Pending(0),
    Invalid(1),
    Claimed(2),
    ClaimExpired(3),
    Fake(4);
    
    private final int value;

    GroupGiveawayRollStatus(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
    
    public static GroupGiveawayRollStatus valueOf(int value) {
        for (GroupGiveawayRollStatus l : GroupGiveawayRollStatus.values()) {
            if (l.getValue() == value) return l;
        }
        throw new IllegalArgumentException("Not found");
    }
}
