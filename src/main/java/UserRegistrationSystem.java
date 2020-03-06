import java.util.regex.Pattern;

public class UserRegistrationSystem {

    //DECLARE PATTERN
    String firstNamePattern="^[A-Z][a-z]{2,}$";
    String lastNamePattern="^[A-Z][a-z]{2,}$";
    String emailPattern="^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
    //WELCOME MESSAGE
    public static void main (String args[]){
        System.out.println("WELL COME USER REGISTRATION SYSTEM");
    }

    //  METHOD TO VALIDATE FIRST NAME
    public boolean validateFirstName(String firstName) {
        return (Pattern.matches(firstNamePattern,firstName));
    }

    //  METHOD TO VALIDATE LAST NAME
    public boolean validatelastName(String emailName) {
       return (Pattern.matches(emailPattern,emailName));
    }

    // METHOD TO VALIDATE EMAIL
    public boolean validateEmailName(String emailName) {
        return (Pattern.matches(emailPattern,emailName));
    }
}