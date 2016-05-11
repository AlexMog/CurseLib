# CurseLib
CurseLib is a library to interact with CurseVoice tchat and REST APIs.

# Getting started

First of all, you will need to compile the sources of the library.

Clone this repository and use maven to compile sources.

###### Prerequisites:
* Java 1.7
* Maven 3.0.5

Build the project by using the following command (with tests):

    $ mvn clean install

If you want to have a quicker build, you can avoid the tests:

    $ mvn clean install -DskipITs
    

### Example

Here is an example of usage of the library:

```java
CurseClient client = new CurseClient("USER", "PASSWORD");
client.authenticate();
client.connectWS();

client.addListener(new ClientListener() {
    
    public void onOpen(ServerHandshake handshakedata) {
        System.out.println("I am connected to the tchat!");
    }
    
    public void onMessage(CurseClient client, ReceivedMessageBean bean) {
        System.out.println("New message received from @" + bean.Body.SenderName + ": " + bean.Body.Body);
    }
    
    public void onError(Exception ex) {
        System.out.println("Error catched :(, but the client will still run.");
        ex.printStackTrace();
    }
    
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("Connection closed " + (remote ? "by the server" : "") + ": (" + code + ")" + reason);
    }
});
```