package cursevoicelib.wsclient;

import org.java_websocket.handshake.ServerHandshake;

import cursevoicelib.wsclient.events.JoinResponseEvent;
import cursevoicelib.wsclient.events.MessageEvent;

public interface ClientListener {
    /**
     * Called when on new EventMessages.
     * @param event
     */
    void onMessage(MessageEvent event);
    /**
     * Called when the server answers to the join request. (handshake phase)
     * @param event
     */
    void onJoinResponse(JoinResponseEvent event);
    /**
     * Called when the server closes the connection
     * @param code
     * @param reason
     * @param remote
     */
    void onClose(int code, String reason, boolean remote);
    /**
     * Called if an error is catched
     * @param ex
     */
    void onError(Exception ex);
    /**
     * Called when connected to the server (and before send the join request)
     * @param handshakedata
     */
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
