package test.java.OldTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.junit.Assert;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RegistrationTest
{
    private WebDriver chromeDriver;

    @DataProvider(name = "userEmpty")
    public Iterator<Object[]> userEmpty() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[]{"", "12345678", "1234567",  "Oana", "Iusan", "io@gmail.com", "07202023", "Romania", "", "Username should not be empty", ""});
        return dp.iterator();
    }
    @DataProvider(name = "passNotMatch")
    public Iterator<Object[]> passNotMatch() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[]{"User", "12345678", "1234567",  "Oana", "Iusan", "io@gmail.com", "07202023", "Romania", "", "Passwords should match", ""});
        return dp.iterator();
    }

    @DataProvider(name = "passTooShort")
    public Iterator<Object[]> passTooShort() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[]{"User", "1234", "1234",  "Oana", "Iusan", "io@gmail.com", "07202023", "Romania", "", "Password should be at least 8 characters", ""});
        return dp.iterator();
    }

    @DataProvider(name = "termsCheck")
    public Iterator<Object[]> termsCheck() {
        Collection<Object[]> dp = new ArrayList<>();
        dp.add(new String[]{"User", "12345678", "12345678",  "Oana", "Iusan", "io@gmail.com", "07202023", "Romania", "", "Terms box should be checked", ""});
        return dp.iterator();
    }

    @AfterMethod
    public void quit() {
        chromeDriver.quit();
    }

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                "D:\\automationCourse\\automationCourse\\target\\generated-sources\\annotations\\resources\\drivers\\chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://adimoldovan.github.io/web-stubs/signin/");

    }

    /////////////////////////////////////////////////////////////////////
    // This testcase checks if the user field has input or is empty    //
    // In case the filed is empty it throws an error                   //
    /////////////////////////////////////////////////////////////////////
    @Test(dataProvider = "userEmpty")
    public void userTest(String username, String password, String confirmPassword,
                              String firstName, String lastName, String email, String dateTime, String nationality,
                              String userNameError, String passwordError, String generalError) throws InterruptedException {


        WebElement Register = chromeDriver.findElement(By.xpath("//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/p[2]/div/a"));
        Register.click();

        Thread.sleep(3000);
        WebElement UserName = chromeDriver.findElement(By.id("username"));
        UserName.clear();
        UserName.sendKeys(username);

        WebElement Pass = chromeDriver.findElement(By.id("password"));
        Pass.clear();
        Pass.sendKeys(password);

        WebElement ConfPass = chromeDriver.findElement(By.id("password2"));
        ConfPass.clear();
        ConfPass.sendKeys(confirmPassword);


        WebElement Title = chromeDriver.findElement(By.id("Ms"));
        Title.sendKeys(Keys.CONTROL, Keys.END);
        Title.click();

        WebElement FName = chromeDriver.findElement(By.id("input-first-name"));
        FName.clear();
        FName.sendKeys(firstName);


        WebElement LName = chromeDriver.findElement(By.id("input-last-name"));
        LName.clear();
        LName.sendKeys(lastName);
        LName.sendKeys(Keys.CONTROL, Keys.END);

        WebElement Email = chromeDriver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(email);

        WebElement DateOfBirth = chromeDriver.findElement(By.name("dob"));
        Thread.sleep(2000);
        DateOfBirth.sendKeys(dateTime);

        WebElement Nationality = chromeDriver.findElement(By.id("input-nationality"));
        Select select = new Select(Nationality);
        select.selectByVisibleText(nationality);

        WebElement Terms = chromeDriver.findElement(By.xpath("//*[@id=\"terms\"]"));
        Terms.sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(2000);
        Terms.click();

        WebElement RegisterButton = chromeDriver.findElement(By.tagName("button"));
        Thread.sleep(2000);
        RegisterButton.click();


        if (username.length() == 0) {
            WebElement passwordErrorElement = chromeDriver.findElement(By.xpath("//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[1]/small[2]"));
            String actualPasswordError = passwordErrorElement.getText();
            Assert.assertEquals("User field empty!", passwordError, actualPasswordError);

        }
    }

    //////////////////////////////////////////////////////////////////////////////
    // This testcase checks if the password and password2 fields are the same   //
    // In case the fields are different it throws an error                      //
    //////////////////////////////////////////////////////////////////////////////
    @Test(dataProvider = "passNotMatch")
    public void passwordTest1(String username, String password, String confirmPassword,
                             String firstName, String lastName, String email, String dateTime, String nationality,
                             String userNameError, String passwordError, String generalError) throws InterruptedException {


        WebElement Register = chromeDriver.findElement(By.xpath("//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/p[2]/div/a"));
        Register.click();

        Thread.sleep(3000);
        WebElement UserName = chromeDriver.findElement(By.id("username"));
        UserName.clear();
        UserName.sendKeys(username);

        WebElement Pass = chromeDriver.findElement(By.id("password"));
        Pass.clear();
        Pass.sendKeys(password);

        WebElement ConfPass = chromeDriver.findElement(By.id("password2"));
        ConfPass.clear();
        ConfPass.sendKeys(confirmPassword);

        WebElement Title = chromeDriver.findElement(By.id("Ms"));
        Title.sendKeys(Keys.CONTROL, Keys.END);
        Title.click();

        WebElement FName = chromeDriver.findElement(By.id("input-first-name"));
        FName.clear();
        FName.sendKeys(firstName);


        WebElement LName = chromeDriver.findElement(By.id("input-last-name"));
        LName.clear();
        LName.sendKeys(lastName);
        LName.sendKeys(Keys.CONTROL, Keys.END);

        WebElement Email = chromeDriver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(email);

        WebElement DateOfBirth = chromeDriver.findElement(By.name("dob"));
        Thread.sleep(2000);
        DateOfBirth.sendKeys(dateTime);

        WebElement Nationality = chromeDriver.findElement(By.id("input-nationality"));
        Select select = new Select(Nationality);
        select.selectByVisibleText(nationality);

        WebElement Terms = chromeDriver.findElement(By.xpath("//*[@id=\"terms\"]"));
        Terms.sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(2000);
        Terms.click();

        WebElement RegisterButton = chromeDriver.findElement(By.tagName("button"));
        Thread.sleep(2000);
        RegisterButton.click();

        if (password != confirmPassword) {
            WebElement passwordErrorElement = chromeDriver.findElement(By.xpath("//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[3]/small[1]"));
            String actualPasswordError = passwordErrorElement.getText();
            Assert.assertEquals("Pass do not match!", passwordError, actualPasswordError);

        }
    }

    //////////////////////////////////////////////////////////////////////////////
    // This testcase checks if the password field has at least 8 characters     //
    // In case the field has fewer characters than 8 it throws an error         //
    //////////////////////////////////////////////////////////////////////////////
    @Test(dataProvider = "passTooShort")
    public void passwordTest2(String username, String password, String confirmPassword,
                              String firstName, String lastName, String email, String dateTime, String nationality,
                              String userNameError, String passwordError, String generalError) throws InterruptedException {


        WebElement Register = chromeDriver.findElement(By.xpath("//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/p[2]/div/a"));
        Register.click();

        Thread.sleep(3000);
        WebElement UserName = chromeDriver.findElement(By.id("username"));
        UserName.clear();
        UserName.sendKeys(username);

        WebElement Pass = chromeDriver.findElement(By.id("password"));
        Pass.clear();
        Pass.sendKeys(password);

        WebElement ConfPass = chromeDriver.findElement(By.id("password2"));
        ConfPass.clear();
        ConfPass.sendKeys(confirmPassword);

        WebElement Title = chromeDriver.findElement(By.id("Ms"));
        Title.sendKeys(Keys.CONTROL, Keys.END);
        Title.click();

        WebElement FName = chromeDriver.findElement(By.id("input-first-name"));
        FName.clear();
        FName.sendKeys(firstName);


        WebElement LName = chromeDriver.findElement(By.id("input-last-name"));
        LName.clear();
        LName.sendKeys(lastName);
        LName.sendKeys(Keys.CONTROL, Keys.END);

        WebElement Email = chromeDriver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(email);

        WebElement DateOfBirth = chromeDriver.findElement(By.name("dob"));
        Thread.sleep(2000);
        DateOfBirth.sendKeys(dateTime);

        WebElement Nationality = chromeDriver.findElement(By.id("input-nationality"));
        Select select = new Select(Nationality);
        select.selectByVisibleText(nationality);

        WebElement Terms = chromeDriver.findElement(By.xpath("//*[@id=\"terms\"]"));
        Terms.sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(2000);
        Terms.click();

        WebElement RegisterButton = chromeDriver.findElement(By.tagName("button"));
        Thread.sleep(2000);
        RegisterButton.click();

        if (password.length() < 8) {
            WebElement passwordErrorElement = chromeDriver.findElement(By.xpath("//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[2]/small[2]"));
            String actualPasswordError = passwordErrorElement.getText();
            Assert.assertEquals("Pass too short!", passwordError, actualPasswordError);

        }

    }

    /////////////////////////////////////////////////////////
    // This testcase checks if the terms field is checked  //
    // is not it throws an error                           //
    /////////////////////////////////////////////////////////
    @Test(dataProvider = "termsCheck")
    public void termsTest(String username, String password, String confirmPassword,
                              String firstName, String lastName, String email, String dateTime, String nationality,
                              String userNameError, String passwordError, String generalError) throws InterruptedException {


        WebElement Register = chromeDriver.findElement(By.xpath("//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/p[2]/div/a"));
        Register.click();

        Thread.sleep(3000);
        WebElement UserName = chromeDriver.findElement(By.id("username"));
        UserName.clear();
        UserName.sendKeys(username);

        WebElement Pass = chromeDriver.findElement(By.id("password"));
        Pass.clear();
        Pass.sendKeys(password);

        WebElement ConfPass = chromeDriver.findElement(By.id("password2"));
        ConfPass.clear();
        ConfPass.sendKeys(confirmPassword);

        WebElement Title = chromeDriver.findElement(By.id("Ms"));
        Title.sendKeys(Keys.CONTROL, Keys.END);
        Title.click();

        WebElement FName = chromeDriver.findElement(By.id("input-first-name"));
        FName.clear();
        FName.sendKeys(firstName);


        WebElement LName = chromeDriver.findElement(By.id("input-last-name"));
        LName.clear();
        LName.sendKeys(lastName);
        LName.sendKeys(Keys.CONTROL, Keys.END);

        WebElement Email = chromeDriver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys(email);

        WebElement DateOfBirth = chromeDriver.findElement(By.name("dob"));
        Thread.sleep(2000);
        DateOfBirth.sendKeys(dateTime);

        WebElement Nationality = chromeDriver.findElement(By.id("input-nationality"));
        Select select = new Select(Nationality);
        select.selectByVisibleText(nationality);

        WebElement Terms = chromeDriver.findElement(By.xpath("//*[@id=\"terms\"]"));
        Terms.sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(2000);
        //Terms.click();

        WebElement RegisterButton = chromeDriver.findElement(By.tagName("button"));
        RegisterButton.sendKeys(Keys.CONTROL, Keys.END);
        Thread.sleep(2000);
        RegisterButton.click();

        if (!Terms.isSelected()) {
            WebElement passwordErrorElement = chromeDriver.findElement(By.xpath("//*[@id=\"svelte\"]/div[1]/div[2]/div[2]/div/div/div/form/div[11]/small"));
            String actualPasswordError = passwordErrorElement.getText();
            Assert.assertEquals("Terms needs to be checked!", passwordError, actualPasswordError);

        }


    }


}
