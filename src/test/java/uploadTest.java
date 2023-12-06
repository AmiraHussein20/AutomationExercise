import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class uploadTest {
    WebDriver driver;
    @Test
    public void upload(){
        File uploadFile = new File("D:/Users/amira.hussein/Pictures/Screenshots/Attribute Name.png");
        driver.findElement(By.xpath("//a[@href=\"/upload\"]")).click();
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys(uploadFile.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
    }
    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(" https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
