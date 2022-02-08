package Week4.Session15.Assignment;

public class InvalidAmountException extends Exception {
    InvalidAmountException() {
        System.out.println("Default Constructor :: InvalidAmountException ");
    }

    InvalidAmountException(String msg) {
        System.out.println("Parameter String msg :: InvalidAmountException "+msg);
    }

    InvalidAmountException(Throwable cause) {
        System.out.println("Parameter Throwable cause :: InvalidAmountException");
    }

    InvalidAmountException(String msg , Throwable cause) {
        System.out.println("Parameter msg , cause :: InvalidAmountException");
    }

}
