package Pages;

import MyTests.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoreDetailsPage {
    public static WebDriver driver ;
    public MoreDetailsPage(WebDriver driver)
    {
        this.driver =driver ;
    }

    static By Gender = By.xpath("//*[@class='mdc-select__anchor']");
    static By Genderdropdown = By.xpath("//*[@class='mdc-deprecated-list-item__text']");
    static By Date = By.xpath("(//*[@class='mdc-text-field__input'])[3]");
    static By TermConditionsCB = By.xpath("//*[@id='acceptTC']");
    static By ContinueButton = By.xpath("(//*[@class='mdc-button__touch'])[3]");

    public org.openqa.selenium.WebElement getGendertoOpenDropDown(){return driver.findElement(Gender);}
    public org.openqa.selenium.WebElement getGenderFromDropDown(){return driver.findElement(Genderdropdown);}
    public org.openqa.selenium.WebElement getDate(){return driver.findElement(Date);}
    public org.openqa.selenium.WebElement getTermCondition(){ return driver.findElement(TermConditionsCB);}
    public org.openqa.selenium.WebElement getContinueButton(){return driver.findElement(ContinueButton);}


}




