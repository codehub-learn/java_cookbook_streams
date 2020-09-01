package gr.codehub.cookbook.exceptions;

public class BusinessException extends Exception {
    private int exceptionId;

    public BusinessException(){
        super();
    }

    public BusinessException(int exceptionId, String message){
        super(message);
        this.exceptionId = exceptionId;
    }

    public int getExceptionId() {
        return exceptionId;
    }

    public void setExceptionId(int exceptionId) {
        this.exceptionId = exceptionId;
    }

}
