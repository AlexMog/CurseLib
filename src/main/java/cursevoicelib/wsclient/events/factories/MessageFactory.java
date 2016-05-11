package cursevoicelib.wsclient.events.factories;

import cursevoicelib.CurseClient;
import cursevoicelib.enums.ConversationNotificationType;
import cursevoicelib.enums.ConversationType;
import cursevoicelib.restapi.containers.MessageContainer;
import cursevoicelib.restapi.containers.SenderContainer;
import cursevoicelib.wsclient.beans.ReceivedMessageBean;
import cursevoicelib.wsclient.events.MessageEvent;

public class MessageFactory {
    public static MessageEvent beanToMessage(CurseClient client, ReceivedMessageBean bean) {
        return new MessageEvent(client, new MessageContainer(
                new SenderContainer(
                        bean.Body.SenderName,
                        bean.Body.SenderID,
                        bean.Body.SenderPermissions,
                        bean.Body.SenderVanityRole,
                        /* TODO */ null
                    ),
                bean.Body.ConversationID,
                bean.Body.RootConversationID,
                bean.Body.Body,
                bean.Body.ClientID,
                bean.Body.ServerID,
                bean.Body.ContactID,
                bean.Body.LikeCount,
                ConversationType.valueOf(bean.Body.ConversationType),
                ConversationNotificationType.valueOf(bean.Body.NotificationType),
                bean.Body.Timestamp,
                bean.Body.DeletedTimestamp,
                bean.Body.EditedTimestamp,
                bean.Body.IsDeleted,
                bean.Body.RecipientID));
    }
}
