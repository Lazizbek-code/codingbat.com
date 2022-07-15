package lazizbek.uz.codingbat.payload;

public class ApiResponse {

    private boolean success;
    private String massage;
    private Object object;

    public ApiResponse(String massage, boolean success) {
        this.success = success;
        this.massage = massage;
    }

    public ApiResponse( Object object,boolean success) {
        this.success = success;
        this.object = object;
    }

    public ApiResponse(Object object) {
        this.object = object;
    }

    public ApiResponse() {
    }

    public ApiResponse(boolean success, String massage, Object object) {
        this.success = success;
        this.massage = massage;
        this.object = object;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
