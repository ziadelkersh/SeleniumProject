package MyTests;

import org.openqa.selenium.WebDriver;



public class Main {
   public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

TestCases testCases = new TestCases();

        testCases.SetUp();
        testCases.SignUp();
        testCases.Login(); //will run Login test case
        testCases.exit();





}

}