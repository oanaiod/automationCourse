package main.java.Tests;

import main.java.PageObjects.LoginPage;
import main.java.PageObjects.ModalPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalTest extends BaseTest {
    LoginPage loginPage;
    ModalPage modalPage;

    @Test
    public void clickInterceptedExceptionTest()  {
        loginPage = new LoginPage(driver);
        loginPage.goToModalPage();
        modalPage = new ModalPage(driver);
        modalPage.openModal();
        Assert.assertTrue(modalPage.cancelButtonIsDisplayed());
//        open modal again when it`s already open
//        modalPage.closeModalWithX();
//        modalPage.openModal();
//        modalPage.closeModalWithCancel();
//        modalPage.openModal();
//        modalPage.closeButtonUsingEscape();

////////////////////////////////////////
// HOMEWORK CLOSE MODAL FROM ANYWHERE //
////////////////////////////////////////
        modalPage.closeModalWithClickAnywhere();
    }
}
