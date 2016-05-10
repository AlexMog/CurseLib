package cursevoicelib.restapi.beans;

public class LoginAnswerBean {
    public class SessionBean {
        public int UserID, SubscriptionToken;
        public long Expires, RenewAfter;
        public String Username, SessionID, Token, EmailAddress;
        public boolean EffectivePremiumStatus, ActualPremiumStatus, IsTemporaryAccount;
    }
    
    public SessionBean Session;
}
