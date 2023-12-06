import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTestNGDemo {
    WebDriver driver;

    @Test
    public void testSearch1() {
        driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
        //driver.findElement(By.className("fa fa-lock")).click();
        //driver.findElement(By.linkText(" Signup / Login")).click();
        String checkNameSignUp = driver.findElement(By.xpath("//div[@class='signup-form']//h2")).getText();
        Assert.assertEquals(checkNameSignUp, "New User Signup!");
        driver.findElement(By.name("name")).sendKeys("AmiraHisham1384");
        driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("Amira17884@gmail.com");
        driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();
        String checkNameINFO = driver.findElement(By.xpath("//h2[@class=\"title text-center\"]")).getText();
        Assert.assertEquals(checkNameINFO, "ENTER ACCOUNT INFORMATION");
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("password")).sendKeys("Pass123");
        driver.findElement(By.id("days")).click();
        driver.findElement(By.xpath("//option[@value=1]")).click();
        driver.findElement(By.id("months")).click();
        driver.findElement(By.xpath("//option[@value=12]")).click();
        driver.findElement(By.id("uniform-years")).click();
        driver.findElement(By.xpath("//option[@value=2021]")).click();
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]")).sendKeys("AmiraHisham1384");
        driver.findElement(By.xpath("//input[@data-qa=\"last_name\"]")).sendKeys("Hussein");
        driver.findElement(By.xpath("//input[@data-qa=\"company\"]")).sendKeys("Giza Systems");
        driver.findElement(By.xpath("//input[@data-qa=\"address\"]")).sendKeys("Rehab City");
        driver.findElement(By.xpath("//input[@data-qa=\"address2\"]")).sendKeys("Fifth Statement");
        driver.findElement(By.id("country")).click();
        driver.findElement(By.xpath("//option[@value=\"Canada\"]")).click();
        driver.findElement(By.id("state")).sendKeys("canada");
        driver.findElement(By.id("city")).sendKeys("Delta");
        driver.findElement(By.id("zipcode")).sendKeys("11841");
        driver.findElement(By.id("mobile_number")).sendKeys("0115391289");
        driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();
        String checkAccountCreated = driver.findElement(By.xpath("//h2[@data-qa=\"account-created\"]")).getText();
        Assert.assertEquals(checkAccountCreated, "ACCOUNT CREATED!");
        driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();


    }

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://automationexercise.com");

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
