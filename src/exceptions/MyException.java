/**
 * JavaLab
 **/

package exceptions;

/**
 *
 * @author ducccuongict
 */
public class MyException extends Exception {
    private String reason;
    private String context;
    private String info;
    
    public static final String EXIST = "0001";
    public static final String NOT_EXISTED = "0002";
    public static final String INVALID = "0003";
    public static final String NO_ITEM = "0004"; 
    public static final String NOT_EMPTY = "0005";
    
    public MyException(String reason) {
        super(reason);
        this.reason = reason;
    }
    
    public MyException(String reason, String context) {
        super(reason);
        this.reason = reason;
        this.context = context;
    }
    
    public MyException(String reason, String context, String info) {
        super(reason);
        this.reason = reason;
        this.context = context;
        this.info = info;
    }
    
    public MyException(Exception cause, String context) {
        super(cause.getCause());
        if (cause instanceof MyException) {
            this.reason = ((MyException) cause).getReason();
//            this.context = ((MyException) cause).getContext();
            this.context = context;
            this.info = ((MyException) cause).getInfo();
        } else {
            this.context = cause.getMessage();
        }
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reasonType) {
        switch(reasonType) {
           case "":
                this.reason = "Null Pointer Exception";
                break;
           case EXIST:
                this.reason = "The id of the item you’ve entered is already existed!";
                break;
           case NOT_EXISTED:
                this.reason = "The item you want to update is not existed!";
                break;
           case INVALID:
                this.reason = "The item you’ve entered is not valid!";
                break;
           case NO_ITEM:
                this.reason = "There is no item!";
               break;
           case NOT_EMPTY:
               this.reason = "The id of the item you’ve entered can not be empty!";
               break;
           default:
               this.reason = "Undefined exception";
               break;
        }
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    
    public String getMessage() {
        String message = "";
        if (getReason() != "") {
            message += "Reason: " + getReason();
        }
        if (getContext() != "") {
            message += "\nContext: " + getContext();
        }
        if (!getInfo().isEmpty()) {
            message += "\nAdditional info: " + getInfo();
        }
        return message;
    }
    
    @Override
    public String toString() {
        return this.getClass() + getMessage();
    }
}
