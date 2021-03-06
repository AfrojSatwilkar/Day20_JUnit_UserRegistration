package Day20_JUnit;

import org.junit.Assert;
import org.junit.Test;

public class UserDetailsTest {
    UserDetails userDetails = new UserDetails();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = userDetails.firstName("Afroj");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = userDetails.firstName("afroj");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = userDetails.lastName("Satwilkar");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsNotProper_ReturnFalse() {
        boolean actualResult = userDetails.lastName("satwilkar");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenEmailId_IsProper_ReturnTrue() {
        boolean actualResult = userDetails.email("afroz.satvilkar2014@gmail.com");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenEmailId_IsNotProper_ReturnFalse() {
        boolean actualResult = userDetails.email("afrozsatvilkar.gmail.com");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenMobileNumber_IsProper_ReturnTrue() {
        boolean actualResult = userDetails.phoneNumber("91 9075528330");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenMobileNumber_IsNotProper_ReturnFalse() {
        boolean actualResult = userDetails.phoneNumber("91 907552833047");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsProper_ReturnTrue() {
        boolean actualResult = userDetails.password("Afroj@786");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenPasswordRule1_IsNotProper_ReturnFalse() {
        boolean actualResult = userDetails.password("jnsdsjRcvc");
        Assert.assertEquals(false, actualResult);
    }

//    @Test
//    public void givenPasswordRule2_IsProper_ReturnTrue() {
//        boolean actualResult = junitUserRegistration.passwordRule2("qwgthRLjkdl");
//        Assert.assertEquals(true, actualResult);
//    }
//
//    @Test
//    public void givenPasswordRule2_IsNotProper_ReturnFalse() {
//        boolean actualResult = junitUserRegistration.passwordRule2("jnsdjcvcp");
//        Assert.assertEquals(false, actualResult);
//    }
//
//    @Test
//    public void givenPasswordRule3_IsProper_ReturnTrue() {
//        boolean actualResult = junitUserRegistration.passwordRule3("qw98hRLkdl");
//        Assert.assertEquals(true, actualResult);
//    }
//
//    @Test
//    public void givenPasswordRule3_IsNotProper_ReturnFalse() {
//        boolean actualResult = junitUserRegistration.passwordRule3("jnsdjcvcp");
//        Assert.assertEquals(false, actualResult);
//    }
//
//    @Test
//    public void givenPasswordRule4_IsProper_ReturnTrue() {
//        boolean actualResult = junitUserRegistration.passwordRule4("qw98hRL@&dl");
//        Assert.assertEquals(true, actualResult);
//    }
//
//    @Test
//    public void givenPasswordRule4_IsNotProper_ReturnFalse() {
//        boolean actualResult = junitUserRegistration.passwordRule4("jsdjcvcp");
//        Assert.assertEquals(false, actualResult);
//    }

}