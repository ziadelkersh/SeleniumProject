package Pages;

import MyTests.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MobilePhonePage {
    public static WebDriver driver ;
    public MobilePhonePage(WebDriver driver)
    {
        this.driver =driver ;
    }

    static By Mobilenumber = By.xpath("//*[@class='mdc-text-field__input']");
    static By ContinueButton = By.xpath("(//*[@class='mdc-button__touch'])[1]");

    public static void WriteMobilenumber(){driver.findElement(Mobilenumber).sendKeys(Data.Numbers[0]);}

    public org.openqa.selenium.WebElement getMobileNumber()
    {
       return driver.findElement(Mobilenumber);
    }
    public org.openqa.selenium.WebElement getContinueButton()
    {
        return driver.findElement(ContinueButton);
    }



    public static void ExplicitWait (WebDriver driver,int Time){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(Time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Mobilenumber));
    }
}

