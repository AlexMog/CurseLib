package cursevoicelib.restapi.beans;

public class ActiveGiveawayAnswerBean {
    public class GiveawayBean {
        public String GroupID, Title;
        public int GiveawayID, CreatorID, ResponseWindowSeconds, SharingBonus, RollsBeforeWinner, Entries, FakeRollsLeft,
                    Status, CurrentRollNumber;
        public int[] RequiredRoles, AutoClaimRoles, AutoEnterRoles, IgnoredUsers;
        public boolean AllowRepeatWinners, AutoEnterActiveUsers, IncludeOfflineMembers;
        // TODO: RolesBonuses, TopShares
    }
    
    public class GroupGiveawayRollContractBean {
        public int UserID, RollNumber, BestRoleID, RollStatus, ValidStatus;
        public long Timestamp;
        public String Username, BestRoleName;
    }
    
    public class PendingWinnerContractBean {
        public String GroupID, Username;
        public int GiveawayID, UserID, SecondsUntilExpires;
        public long Timestamp;
    }
    
    public GiveawayBean Giveaway;
    public GroupGiveawayRollContractBean Rolls;
    public PendingWinnerContractBean PendingWinner;
    public boolean Entered;
}
