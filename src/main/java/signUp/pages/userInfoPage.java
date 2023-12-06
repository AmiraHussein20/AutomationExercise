package signUp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class userInfoPage {
    private WebDriver driver;
    private final By infoUser = By.xpath("//h2[@class=\"title text-center\"]");
    private final By enterGender = By.id("id_gender2");
    private final By enterPassword = By.id("password");
    private final By enterDays = By.id("days");
    private final By selectDay = By.xpath("//option[@value=1]");
    private final By enterMonths = By.id("months");
    private final By selectMonth = By.xpath("//option[@value=12]");
    private final By enterYears = By.id("uniform-years");
    private final By selectYear = By.xpath("//option[@value=2021]");
    private final By newsLetter = By.id("newsletter");
    private final By selectOption = By.id("optin");
    private final By firstName = By.xpath("//input[@data-qa=\"first_name\"]");
    private final By lastName = By.xpath("//input[@data-qa=\"last_name\"]");
    private final By companyName = By.xpath("//input[@data-qa=\"company\"]");
    private final By address1 = By.xpath("//input[@data-qa=\"address\"]");
    private final By address2 = By.xpath("//input[@data-qa=\"address2\"]");
    private final By countryName = By.id("country");
    private final By selectCountry = By.xpath("//option[@value=\"Canada\"]");
    private final By enterState = By.id("state");
    private final By enterCity = By.id("city");
    private final By enterZipCode = By.id("zipcode");
    private final By mobileNumber = By.id("mobile_number");
    private final By createAccountText = By.xpath("//button[@data-qa=\"create-account\"]");
    private final By checkCreateAccountText = By.xpath("//h2[@data-qa=\"account-created\"]");
    private final By continueButton = By.xpath("//a[@data-qa=\"continue-button\"]");

    public userInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertOnUserInfo(String expectedInfo) {
        String checkNameINFO = driver.findElement(infoUser).getText();
        Assert.assertEquals(checkNameINFO, expectedInfo);
    }
    public void assertAccountCreated(String expectedData) {
        String checkAccountCreated = driver.findElement(checkCreateAccountText).getText();
        Assert.assertEquals(checkAccountCreated, expectedData);
    }
    public void enterAccountInfo(String password){
        driver.findElement(enterGender).click();
        driver.findElement(enterPassword).sendKeys(password);
        driver.findElement(enterDays).click();
        driver.findElement(selectDay).click();
        driver.findElement(enterMonths).click();
        driver.findElement(selectMonth).click();
        driver.findElement(enterYears).click();
        driver.findElement(selectYear).click();
        driver.findElement(newsLetter).click();
        driver.findElement(selectOption).click();
    }
    public void enterAddressInfo(String firstname,String lastname,String company,String firstAddress,String secondAddress,String stateName,String cityName,String zipcode,String mobile){
        driver.findElement(firstName).sendKeys(firstname);
        driver.findElement(lastName).sendKeys(lastname);
        driver.findElement(companyName).sendKeys(company);
        driver.findElement(address1).sendKeys(firstAddress);
        driver.findElement(address2).sendKeys(secondAddress);
        driver.findElement(countryName).click();
        driver.findElement(selectCountry).click();
        driver.findElement(enterState).sendKeys(stateName);
        driver.findElement(enterCity).sendKeys(cityName);
        driver.findElement(enterZipCode).sendKeys(zipcode);
        driver.findElement(mobileNumber).sendKeys(mobile);
        driver.findElement(createAccountText).click();
    }

}
