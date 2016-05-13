package cursevoicelib.wsclient.events;

import cursevoicelib.CurseClient;
import cursevoicelib.wsclient.events.containers.JoinAnswerContainer;

public class JoinResponseEvent extends ClientEvent {
    private final JoinAnswerContainer mJoinAnswer;

    public JoinResponseEvent(CurseClient client, JoinAnswerContainer joinAnswer) {
        super(client);
        mJoinAnswer = joinAnswer;
    }

    public JoinAnswerContainer getJoinAnswer() {
        return mJoinAnswer;
    }
}
