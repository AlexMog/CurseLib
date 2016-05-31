package cursevoicelib.enums;

public enum GroupGiveawayWinnerValidStatus {
    Unknown(0),
    Valid(1),
    MissingRole(2),
    Offline(3),
    FakeRoll(4),
    NoMembership(5);
    
    private final int value;

    GroupGiveawayWinnerValidStatus(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
    
    public static GroupGiveawayWinnerValidStatus valueOf(int value) {
        for (GroupGiveawayWinnerValidStatus l : GroupGiveawayWinnerValidStatus.values()) {
            if (l.getValue() == value) return l;
        }
        throw new IllegalArgumentException("Not found");
    }
}
