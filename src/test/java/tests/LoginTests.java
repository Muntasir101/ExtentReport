package tests;

import static utils.extentreports.ExtentTestManager.startTest;

import java.lang.reflect.Method;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    @Test(priority = 0, description = "Invalid Login Scenario with wrong username and password.")
    public void invalidLoginTest_InvalidUserNameInvalidPassword(Method method) {
        //ExtentReports Description
        startTest(method.getName(), "Invalid Login Scenario with invalid username and password.");

        homePage
            .goToOpencart()
            .goToLoginPage()
            .loginToN11("muntasir@test.com", "11122233444")
            .verifyLogin("Warning: No match for E-Mail Address and/or Password.");
    }

    @Test(priority = 1, description = "Invalid Login Scenario with empty username and password.")
    public void invalidLoginTest_EmptyUserEmptyPassword(Method method) {
        //ExtentReports Description
        startTest(method.getName(), "Invalid Login Scenario with empty username and password.");

        homePage
            .goToOpencart()
            .goToLoginPage()
            .loginToN11("", "")
                .verifyLogin("Warning: No match for E-Mail Address and/or Password.");

    }
}