package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalDetailPage {
    public static WebDriver driver ;
    public PersonalDetailPage(WebDriver driver)
    {
        this.driver =driver ;
    }

    static By FirstName = By.xpath("(//*[@class='mdc-text-field__input'])[1]");
    static By LastName = By.xpath("//*[@id='input_last_name']");
    static By Email = By.xpath("//*[@class='mdc-text-field__input email-input']");
    static By LastNamenew = By.xpath("(//*[@class='mdc-text-field__input'])[2]");
    static By ContinueButton = By.xpath("//*[@class='mdc-button mdc-button--touch mdc-button--raised to-personal-details-part-2 mdc-ripple-upgraded']");

    public org.openqa.selenium.WebElement getFirstName(){return driver.findElement(FirstName);}
    public static void WriteFirstName(){driver.findElement(FirstName).sendKeys("Ahmed");}
    public org.openqa.selenium.WebElement getLastName(){return driver.findElement(LastNamenew);}
    public static void WriteLastName(){driver.findElement(LastName).sendKeys("Ahmady");}
    public org.openqa.selenium.WebElement getEmail(){return driver.findElement(Email);}
    public org.openqa.selenium.WebElement getContinueButton(){return driver.findElement(ContinueButton);}


}








