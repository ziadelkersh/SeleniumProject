package MyTests;
import MyTests.TestSteps;
import Pages.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static MyTests.Main.driver;

public class TestCases  {
    public TestSteps testSteps = new TestSteps();


    @BeforeTest
    public void SetUp() {

        System.setProperty("webdriver.chrome.driver", Data.CHROME_DRIVER_LOCATION);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable nodification");
        driver = new ChromeDriver(options);
        DesiredCapabilities cp = new DesiredCapabilities();
        cp.setCapability(ChromeOptions.CAPABILITY,options);
        options.merge(cp);
        HomePage Page = new HomePage(driver);
        MobilePhonePage Page2 = new MobilePhonePage(driver);
        PasswordPage Page3 = new PasswordPage(driver);
        PersonalDetailPage Page4 = new PersonalDetailPage(driver);
        MoreDetailsPage Page5 = new MoreDetailsPage(driver);

        driver.get(Data.Base_URL);
        driver.manage().window().maximize();


    }

    @Test(testName ="Login")
    public void Login () throws java.lang.AssertionError{
        try {

            testSteps.clickcloseminiscreen();
            testSteps.clickAccountButton();
            testSteps.clickSigninButton();
            HomePage.WaitTime(20);
            testSteps.WriteMobilenumberforLogin();
            testSteps.clickContinueButton();
            testSteps.WriteInputPassword();
            HomePage.WaitTime(3);
            testSteps.ClickLoginButton();



        } catch (java.lang.AssertionError e) {
            // e.printstactrace();
             driver.quit();
         }
        }

    @Test(testName ="SignUp")
    public void SignUp() throws java.lang.AssertionError  {
        try {
            testSteps.clickcloseminiscreen();
            testSteps.clickAccountButton();
            testSteps.clickSigninButton();
            MobilePhonePage.ExplicitWait(driver, 10);
            testSteps.WriteMobilenumber();
            testSteps.clickContinueButton();
            testSteps.WriteInputPassword();
            testSteps.WriteConfirmPassword();
            testSteps.PressContinueButton();
            HomePage.WaitTime(20);
            testSteps.ClickFirstName();
            testSteps.WriteFirstName();
            testSteps.ClickLastName();
            testSteps.WriteLastName();
            testSteps.WriteEmail();
            HomePage.WaitTime(20);
            testSteps.PressContinueButtonInPersonalDetails();
            testSteps.ClickGendertoOpenDropDown();
            testSteps.ChooseGenderFromDropDown();
            testSteps.ChooseDate();
            testSteps.AcceptTermCondition();
            testSteps.PressContinueButtonInMoreDetailsPage();

        }
        catch (java.lang.AssertionError e) {
            // e.printstactrace();
            driver.quit();
        }

    }
    @AfterTest
    public void exit() {
        HomePage.WaitTime(20);
        driver.quit();
        HomePage.WaitTime(20);


    }


}
