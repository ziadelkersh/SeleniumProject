package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PasswordPage {
    public static WebDriver driver ;
    public PasswordPage(WebDriver driver)
    {
        this.driver =driver ;
    }

    static By InputPassword = By.xpath("//*[@class='mdc-text-field__input password-input  ']");
    static By ConfirmPassword = By.xpath("//*[@class='mdc-text-field__input confirm-password-input']");
   // static  String partialAttributeValue = "mdc-ripple-upgraded";
  // static By ContinueButton = By.xpath( "//*[contains(@class,'" + partialAttributeValue + "']" );
   static By ContinueButton = By.xpath("//*[@class='mdc-button mdc-button--touch mdc-button--raised to-personal-details mdc-ripple-upgraded']");

    static By ContinueButtonAfterPressing = By.xpath("//*[@class='mdc-button mdc-button--touch mdc-button--raised to-personal-details mdc-ripple-upgraded mdc-ripple-upgraded--foreground-activation mdc-ripple-upgraded--background-focused']");
    static By Login = By.xpath("//*[@id='loginButton']");
    public org.openqa.selenium.WebElement getInputPassword()
    { return driver.findElement(InputPassword);}
    public org.openqa.selenium.WebElement getConfirmPassword()
    {return driver.findElement(ConfirmPassword);}
    public org.openqa.selenium.WebElement getContinueButton(){
      // ExplicitWait(driver ,20);
        HomePage.WaitTime(10);
        return driver.findElement(ContinueButton);
    }
   public static void AfterPressingContinue()
    {
        HomePage.WaitTime(5);
        driver.findElement(ContinueButtonAfterPressing).click();
    }
    public static void RepressingContinue()
    {
        driver.findElement(By.xpath("//*[@class='mdc-touch-target-wrapper']")).click();
        //driver.findElement(ContinueButton);
        HomePage.WaitTime(5);
        driver.findElement(By.xpath("(//*[@class='mdc-button__touch'])[1]")).click();

    }
    public org.openqa.selenium.WebElement getLoginButton()
    { return driver.findElement(Login);}

    public static void ExplicitWait (WebDriver driver,int Time){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(Time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(ContinueButton));
    }
}

