package cursevoicelib.wsclient;

public class PacketData {
    private Class<?> mPacketClass;
    
    public PacketData(Class<?> packetClass) {
        mPacketClass = packetClass;
    }
    
    public Class<?> getPacketClass() {
        return mPacketClass;
    }
}
