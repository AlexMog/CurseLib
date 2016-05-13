package cursevoicelib.wsclient.events.factories;

import cursevoicelib.CurseClient;
import cursevoicelib.wsclient.beans.JoinAnswerBean;
import cursevoicelib.wsclient.events.JoinResponseEvent;
import cursevoicelib.wsclient.events.containers.JoinAnswerContainer;

public class JoinFactory {
    public static JoinResponseEvent beanToEvent(CurseClient client, JoinAnswerBean bean) {
        return new JoinResponseEvent(client, new JoinAnswerContainer(bean.EncryptedSessionKey, bean.ServerTime, bean.Status));
    }
}
