package Week4.Session15.Practice;

public class InvalidCitizenshipException extends RuntimeException {
    InvalidCitizenshipException() {
        System.out.println("Default Constructor :: InvalidCitizenshipException ");
    }

    InvalidCitizenshipException(String msg) {
        System.out.println("Parameter String msg :: InvalidCitizenshipException "+msg);
    }

    InvalidCitizenshipException(Throwable cause) {
        System.out.println("Parameter Throwable cause :: InvalidCitizenshipException");
    }

    InvalidCitizenshipException(String msg , Throwable cause) {
        System.out.println("Parameter msg , cause :: InvalidCitizenshipException");
    }
}
