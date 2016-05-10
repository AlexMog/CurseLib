package cursevoicelib.wsclient;

import org.java_websocket.handshake.ServerHandshake;

import cursevoicelib.wsclient.beans.ReceivedMessageBean;

public interface ClientListener {
    void onMessage(Client client, ReceivedMessageBean bean);
    void onClose(int code, String reason, boolean remote);
    void onError(Exception ex);
    void onOpen(ServerHandshake handshakedata);
    
    /**
    Missing:
    callNotification
    callRespondedNotification
    conversationMessageResponse
    conversationReadNotification
    externalCommunityLinkChangedNotification
    friendshipChangeNotification
    friendshipRemovedNotification
    friendSuggestionNotification
    groupChangeNotification
    groupGiveawayChangedNotification
    groupGiveawaySettingsNotification
    groupInvitationNotification
    groupPollChangedNotification
    groupPollSettingsNotification
    groupPreferenceNotification
    joinResponse
    userChangeNotification
    userClientSettingsNotification
     */
}
