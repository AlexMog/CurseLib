package cursevoicelib.restapi.beans;

public class SessionRequestBean {
    public String MachineKey, DeviceID, PushKitToken;
    public int Platform;
    
    public SessionRequestBean(String machineKey, String deviceId, String pushKitToken, int platform) {
        MachineKey = machineKey;
        DeviceID = deviceId;
        PushKitToken = pushKitToken;
        Platform = platform;
    }
    
    public SessionRequestBean() {}
}
