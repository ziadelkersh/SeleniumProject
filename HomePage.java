package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class HomePage {

    public static WebDriver driver ;
    public HomePage(WebDriver driver)
    {
         this.driver =driver ;
    }

    static By closeminiscreen = By.xpath("(//*[@class='ic'])[55]");
    static By AccountButton = By.xpath("(//*[@class='trig -df -i-ctr -fs16'])[1]");
    static By SigninButton = By.xpath("//*[@class='btn _prim -fw _md']");
    public static void getcloseminiscreen()
    {
        driver.findElement(closeminiscreen);
    }

    public org.openqa.selenium.WebElement getCloseMiniScreen() {
        return driver.findElement(closeminiscreen);
    }

    public org.openqa.selenium.WebElement  getAccountButton()
    {
        return driver.findElement(AccountButton);
    }


    public org.openqa.selenium.WebElement getSigninButton ()
    {
     return  driver.findElement(SigninButton);
    }


    public static void WaitTime( int Time) {driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Time));}



}