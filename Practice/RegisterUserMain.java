package Week4.Session15.Practice;

public class RegisterUserMain {
    public static void main(String[] args) {
        RegisterUser obj_user1 = new RegisterUser();

        try {
            try {
                obj_user1.validateCitizenship("Indein");
            } catch (InvalidCitizenshipException e) {
                System.out.println("Invalid Citizenship Exception caught");
            } finally {
                System.out.println("Inner Finally");
            }

            obj_user1.validateAge(17);

        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age Exception caught");
        } finally {
            System.out.println("Outer Finally");
        }
    }
}

/*

Parameter String msg :: InvalidCitizenshipException You are not Indian Citizen
Invalid Citizenship Exception caught
Inner Finally
Parameter String msg :: InvalidAgeException You are not above 18
Invalid Age Exception caught
Outer Finally

* */