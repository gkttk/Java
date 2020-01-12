package homework7.console_3_4;

public class CountEqual3Exception extends RuntimeException{
    public CountEqual3Exception() {
    }

    public CountEqual3Exception(String message) {
        super(message);
    }

    public CountEqual3Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public CountEqual3Exception(Throwable cause) {
        super(cause);
    }

    public CountEqual3Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
