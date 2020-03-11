import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationSytemTest {
    UserRegistrationSystem userregistrationproblem = new UserRegistrationSystem();

    //TEST TO CHECK  FIRST NAME VALID
    @Test
    public void givenFirstName_whenValid_thenReturn() {
        String name="Nilesh";
        boolean firstName = userregistrationproblem.validateFirstName(name);
        Assert.assertTrue(firstName);
    }

    //TEST TO CHECK FIRST NAME INVALID
    @Test
    public void givenFirstName_whenInvalid_thenReturn() {
        String name="nilesh";
        boolean firstName = userregistrationproblem.validateFirstName(name);
        Assert.assertFalse(firstName);
    }

    //TEST TO CHECK  LAST NAME VALID
    @Test
    public void givenLastName_whenValid_thenReturn() {
        String name="nileshLad";
        boolean lastName = userregistrationproblem.validatelastName(name);
        Assert.assertTrue(lastName);
    }

    //TEST TO CHECK LAST NAME INVALID
    @Test
    public void givenLastName_whenInvalid_thenReturn() {
        String name="NILESHlad";
        boolean lastName = userregistrationproblem.validatelastName(name);
        Assert.assertFalse(lastName);
    }

    //TEST TO CHECK  EMAIL VALID
    @Test
    public void givenEmailName_whenValid_thenReturn() {
        String name="ladnilesh1994@gmail.co.in";
        boolean emailName = userregistrationproblem.validateEmailName(name);
        Assert.assertTrue(emailName);
    }

    //TEST TO CHECK EMAIL NAME INVALID
    @Test
    public void givenEmailName_whenInvalid_thenReturn() {
        String name="ladnilesh1994@gmail.com";
        boolean emailName = userregistrationproblem.validateEmailName(name);
        Assert.assertFalse(emailName);
    }

    //TEST TO CHECK MOBILE NUMBER VALID
    @Test
    public void givenMobileNumberValidThenReturn() {
        String number=918888310299
        boolean mobileNumber= userregistrationproblem.validateMobileNumber(number);
        Assert.assertTrue(mobileNumber);
    }

    //TEST TO CHECK MOBILE NUMBER INVALID
    @Test
    public void givenMobileNumberValidThenReturn() {
        String number=91888310299
        boolean mobileNumber= userregistrationproblem.validateMobileNumbernumber(number);
        Assert.assertFlase(mobileNumber);
    }

    }
