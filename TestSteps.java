package MyTests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static MyTests.Main.driver;

public class TestSteps {

    public WebDriver driver;

   public HomePage homePage = new HomePage(driver);

    MobilePhonePage mobilePhonePage = new MobilePhonePage(driver);
    PasswordPage passwordPage = new PasswordPage(driver);
    PersonalDetailPage personalDetailPage = new PersonalDetailPage(driver);
    MoreDetailsPage moreDetailsPage = new MoreDetailsPage(driver);







    //  FirstPage.WaitTime(20);






  //  PasswordPage.AfterPressingContinue();
  //  PasswordPage.RepressingContinue();





    public void clickcloseminiscreen()
    {
        homePage.getCloseMiniScreen().click();
    }
    public void clickAccountButton()
    {
        homePage.getAccountButton().click();
    }
    public void clickSigninButton()
    {
        homePage.getSigninButton().click();
    }
    public void WriteMobilenumberforLogin()
    {
        mobilePhonePage.getMobileNumber().sendKeys(Data.Numbers[1]);
    }
    public void WriteMobilenumber()
    {
        mobilePhonePage.getMobileNumber().sendKeys(Data.Numbers[0]);
    }

    public void clickContinueButton()
    {
        mobilePhonePage.getContinueButton().click();
    }
    public void WriteInputPassword() {
        passwordPage.getInputPassword().sendKeys("//*classAhmed");
    }
    public void ClickLoginButton(){
        passwordPage.getLoginButton().click();
    }
    public void WriteConfirmPassword(){
        passwordPage.getConfirmPassword().sendKeys("//*classAhmed");
    }
    public void PressContinueButton()
    {
        passwordPage.getContinueButton().click();
    }
    public void ClickFirstName()
    {
        personalDetailPage.getFirstName().click();
    }
    public void WriteFirstName()
    {
        personalDetailPage.getFirstName().sendKeys("Ahmed");
    }
    public void ClickLastName()
    {
        personalDetailPage.getLastName().click();
    }
    public void WriteLastName()
    {
        personalDetailPage.getLastName().sendKeys("Ahmady");
    }
    public void WriteEmail()
    {
        personalDetailPage.getEmail().sendKeys("a.elahmady@gmail.com");
    }
    public void PressContinueButtonInPersonalDetails()
    {
        personalDetailPage.getContinueButton().click();
    }
    public void ClickGendertoOpenDropDown()
    {
        moreDetailsPage.getGendertoOpenDropDown().click();
    }
    public void ChooseGenderFromDropDown()
    {
            moreDetailsPage.getGenderFromDropDown().click();
    }
    public void ChooseDate()
    {
          moreDetailsPage.getDate().sendKeys(Data.SuggestedDate);
    }
    public void AcceptTermCondition()
    {
           moreDetailsPage.getTermCondition().click();
    }
    public void PressContinueButtonInMoreDetailsPage()
    {
        moreDetailsPage.getContinueButton().click();

    }



}




