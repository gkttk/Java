package homework7.сhecked_2.exceptions;

public class WhereIsHelloException extends Exception{
    public WhereIsHelloException() {
    }

    public WhereIsHelloException(String message) {
        super(message);
    }

    public WhereIsHelloException(String message, Throwable cause) {
        super(message, cause);
    }

    public WhereIsHelloException(Throwable cause) {
        super(cause);
    }

    public WhereIsHelloException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
