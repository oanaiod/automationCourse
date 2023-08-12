package main.java.Tests;

import main.java.PageObjects.LoginPage;
import main.java.PageObjects.RegistrationPage;
import main.java.ro.sit.course.course06_07.MyCustomException;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    LoginPage loginPage;
    RegistrationPage registrationPage;

    @Test
    public void registerTest() throws MyCustomException {
        loginPage = new LoginPage(driver);
        loginPage.goToRegistrationPage();
        registrationPage = new RegistrationPage(driver);
//        registrationPage.clickTermsCheckboxUsingActionsScroll();
        registrationPage.clickTermsCheckboxUsingJsScroll();
    }
}
