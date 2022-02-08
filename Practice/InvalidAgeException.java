package Week4.Session15.Practice;

public class InvalidAgeException extends Exception {
    InvalidAgeException() {
        System.out.println("Default Constructor :: InvalidAgeException ");
    }

    InvalidAgeException(String msg) {
        System.out.println("Parameter String msg :: InvalidAgeException "+msg);
    }

    InvalidAgeException(Throwable cause) {
        System.out.println("Parameter Throwable cause :: InvalidAgeException");
    }

    InvalidAgeException(String msg , Throwable cause) {
        System.out.println("Parameter msg , cause :: InvalidAgeException");
    }
}
