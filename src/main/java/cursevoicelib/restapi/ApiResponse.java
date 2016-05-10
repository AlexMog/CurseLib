package cursevoicelib.restapi;

public class ApiResponse {
    private String mContent;
    private int mCode;
    
    public ApiResponse(int code, String content) {
        mContent = content;
        mCode = code;
    }
    
    public int getCode() {
        return mCode;
    }
    
    public String getContent() {
        return mContent;
    }
}
