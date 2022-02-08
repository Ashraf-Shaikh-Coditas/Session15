package Week4.Session15.Practice;

public class RegisterUser {
    public void validateAge(int age) throws InvalidAgeException {
        if(age <= 18)
            throw new InvalidAgeException("You are not above 18");
    }

    public void validateCitizenship(String citizenship) throws InvalidCitizenshipException {
        if(!"Indian".equalsIgnoreCase(citizenship))
            throw  new InvalidCitizenshipException("You are not Indian Citizen");
    }
}
