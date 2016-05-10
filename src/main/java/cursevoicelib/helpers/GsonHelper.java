package cursevoicelib.helpers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonHelper {
    private static final Gson GSON = new GsonBuilder().serializeNulls().create();
    
    static {
        
    }
    
    public static String toJson(Object o) {
        return GSON.toJson(o);
    }
    
    public static <T> T fromJson(String json, Class<T> c) {
        return (T)GSON.fromJson(json, c);
    }
}
