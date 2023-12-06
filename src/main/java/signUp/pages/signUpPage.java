package signUp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class signUpPage {
    private WebDriver driver;

    /*String automationHomePageUrl="http://automationexercise.com";
    private final By signUpClick = By.xpath("//i[@class='fa fa-lock']");*/
    private final By signUpText = By.xpath("//div[@class='signup-form']//h2");
    private final By enterName = By.name("name");
    private final By enterEmail = By.xpath("//input[@data-qa=\"signup-email\"]");
    private final By signUpButton = By.xpath("//button[@data-qa=\"signup-button\"]");

    public signUpPage(WebDriver driver) {
        this.driver = driver;
    }


    public void assertOnSignUpText(String expectedResult) {
        String checkNameSignUp = driver.findElement(signUpText).getText();
        Assert.assertEquals(checkNameSignUp, expectedResult);
    }

    public void enterInfoOFSignUpPage(String name, String email){
        driver.findElement(enterName).sendKeys(name);
        driver.findElement(enterEmail).sendKeys(email);
        driver.findElement(signUpButton).click();
    }
}
