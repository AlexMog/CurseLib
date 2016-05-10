## Websockets protocol

(Title = TypeID)

### -2101997347

Used when connected by the client.

Body:

- CipherAlgorithm (int?) : Unknown. Allways 0.
- CipherStrength (int?) : Unknown. Allways 0.
- ClientVersion (String) : Client version. Value to use: "7.0.30"
- MachineKey (String) : The machineKey generated during the authentication phase.
- PublicKey (?) : Unknown.
- SessionID (String) : The SessionID generated using the Sessions API.
- Status (int?) : The request status?. Default: 1
- UserID (int) : The account ID. Can be found using the Sessions or Logins Api.

### -815187584

This TypeID is answered by the server after a successful -2101997347 one.

Body:

- EncryptedSessionKey (String?) : Unknown. Always null right now (no encryption).
- ServerTime (String) : Server time. Exemple: "2016-05-10T13:29:35.87177Z"
- Status (int) : The answer status?!

### -476754606

Seems to be the "StayAlive" or "Ping" System.

Sended by the client, the servers answers the same.

Body:

- Signal (boolean): Unknown. Always true.

### -635182161

Seems to be received when a new message is received on a channel

Body:

- Attachments (Array) : Unknown.
- Body (String) : Contents of the message.
- ClientID (String) : The client ID who send the message?
- ContactID (String) : The contact ID who send the message?
- ContentTags (Array) : Unknown.
- ConversationID (String) : The ConversationID of the conversation where the message is?
- ConversationType (int) : The type of conversation? (1 seems to be a normal group conv)
- DeletedTimestamp (int) : If the message is deleted, the timestamp when he got deleted?
- DeletedUserID (int) : Who deleted the message?
- DeletedUsername (int) : The username of the person who deleted?
- EditedTimestamp (int) : A timestamp of the last edition.
- EditedUserID (int) : Who edited the message.
- EditedUsername (int) : Username of who edited the message.
- IsDeleted (boolean) : Is the message deleted?
- LikeCount (int) : Number of likes
- LikeUserIDs (array of int) : Who liked.
- LikeUsernames (Array of String) : Who liked. Username version.
- Mentions (Array) : ?
- NotificationType (int?) : Unknown. 0 seems to be a normal message?!
- RecipientID (int?) : Unknown.
- RootConversationID (String) : Unknown.
- SenderID (int) : The sender's userID.
- SenderName (String) : The Sender's name.
- SenderPermissions (int?) : The sender's permissions?
- SenderRoles (Array of int?) : The sender's roles?
- SenderVanityRole (int) : Unknown.
- ServerID (String) : The group/Server id?
- Timestamp (int) : Timestamp of the message. When the message was sent.


### 937250613 

Sended from the server. Seems to be sended when a "user status" change.

Body: TODO

### -2124552136

Sended by the client to send a new message.

Body: TODO

### 705131365 

Answer received by the client after a -2124552136 to define if the message have been sended, or not.

Body: TODO

### -342895375

Mark Read Request?

### -1422086075

Health check request?

### -1669214322

Call Notification?

### -1145188782

Call responded notification?

### -695526586

Conversation read notification?

### 738704822

External Community link changed notification?

### 580569888

Friendship change notification?

### 1216900677

Friendship removed notification?

### -1001397130

Friend suggestion notification?

### 149631008

Group change notification?

### 1519023790

Group giveaway changed notification?

### -1519023790

Group giveaway settings notification?

### -1732183626

Group invitation notification?

### -1942550100

Group poll changed notification?

### -34150280

Group poll settings notification?

### 72981382

Group preference notification?

### -1641871686

User client settings notification?
