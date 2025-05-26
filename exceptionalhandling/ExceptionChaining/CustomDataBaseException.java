package exceptionalhandling.ExceptionChaining;

/*
    Custom exception along which can handle message and a cause.
    Cause is an object of Throwable meaning it can be an error or
    and exception.
 */
public class CustomDataBaseException extends Exception{

    /*
        This constructor takes message and a cause which is passed to its super class.
     */
    public CustomDataBaseException(String message, Throwable cause) {
        super(message, cause);
    }
}
