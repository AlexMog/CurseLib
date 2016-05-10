package cursevoicelib.wsclient;

import cursevoicelib.wsclient.beans.ReceivedMessageBean;

public interface ClientListener {
    void onMessage(Client client, ReceivedMessageBean bean);
}
