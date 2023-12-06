package signUp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    private WebDriver driver;

    String automationHomePageUrl="http://automationexercise.com";
    private final By signUpClick = By.xpath("//i[@class='fa fa-lock']");

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToAutomationHomePageUrl() {
        driver.navigate().to(automationHomePageUrl);
    }
    public void navigateToSignUpPage(){
        driver.findElement(signUpClick).click();
    }
}
