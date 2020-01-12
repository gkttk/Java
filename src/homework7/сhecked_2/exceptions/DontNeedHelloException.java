package homework7.сhecked_2.exceptions;

public class DontNeedHelloException extends Exception{

    public DontNeedHelloException() {
    }

    public DontNeedHelloException(String message) {
        super(message);
    }

    public DontNeedHelloException(String message, Throwable cause) {
        super(message, cause);
    }

    public DontNeedHelloException(Throwable cause) {
        super(cause);
    }

    public DontNeedHelloException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
