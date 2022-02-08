package Week4.Session15.Assignment;

public class InsufficientBalanceException extends Exception {
    InsufficientBalanceException() {
        System.out.println("Default Constructor :: InsufficientBalanceException ");
    }

    InsufficientBalanceException(String msg) {
        System.out.println("Parameter String msg :: InsufficientBalanceException "+msg);
    }

    InsufficientBalanceException(Throwable cause) {
        System.out.println("Parameter Throwable cause :: InsufficientBalanceException");
    }

    InsufficientBalanceException(String msg , Throwable cause) {
        System.out.println("Parameter msg , cause :: InsufficientBalanceException");
    }

}
