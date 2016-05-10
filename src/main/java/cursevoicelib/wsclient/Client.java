package cursevoicelib.wsclient;

import java.io.IOException;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.SSLContext;

import org.java_websocket.handshake.ServerHandshake;

import cursevoicelib.CurseClient;
import cursevoicelib.helpers.GsonHelper;
import cursevoicelib.util.log.Log;
import cursevoicelib.wsclient.beans.JoinRequestBean;
import cursevoicelib.wsclient.beans.Packet;

public class Client extends ClientRewrite {
    private String mMachineKey, mSessionId;
    private int mUserId;
    private Interpretator mInterpretator = new Interpretator(this);

    public Client(URI serverURI) throws KeyManagementException, NoSuchAlgorithmException, IOException {
        super(serverURI);
        SSLContext sslContext = null;
        sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, null, null);

        setSocket(sslContext.getSocketFactory().createSocket());
    }
    
    public void setCredentials(String machineKey, String sessionId, int userId) {
        mMachineKey = machineKey;
        mSessionId = sessionId;
        mUserId = userId;
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        mInterpretator.onOpen(handshakedata);
        JoinRequestBean bean = new JoinRequestBean();
        bean.Body.CipherAlgorithm = 0;
        bean.Body.CipherStrength = 0;
        bean.Body.ClientVersion = CurseClient.CLIENT_VERSION;
        bean.Body.MachineKey = mMachineKey;
        bean.Body.PublicKey = null;
        bean.Body.SessionID = mSessionId;
        bean.Body.Status = 1;
        bean.Body.UserID = mUserId;
        sendPacket(bean);
    }
    
    public void sendPacket(Packet bean) {
        String toSend = GsonHelper.toJson(bean);
        Log.info("Sending: " + toSend);
        send(toSend);
    }

    @Override
    public void onMessage(String message) {
        Log.info(message);
        mInterpretator.interpretate(message);
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        Log.info("Connection closed: " + reason);
        mInterpretator.onClose(code, reason, remote);
    }

    @Override
    public void onError(Exception ex) {
        Log.warn("Error cated on client", ex);
        mInterpretator.onError(ex);
    }

    public void addListener(ClientListener listener) {
        mInterpretator.addListener(listener);
    }
    
    public void removeListener(ClientListener listener) {
        mInterpretator.removeListener(listener);
    }
}
