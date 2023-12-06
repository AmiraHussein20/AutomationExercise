import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class screenShot {
    WebDriver driver;
    @Test
    public void TakingScreenshots (){
        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        System.out.println("Screenshot taken : " + screenshot.getAbsolutePath());
        try {
            Files.move(screenshot.toPath(), new File("src/sc/test.png").toPath());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
        @BeforeMethod
        public void beforeMethod() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://the-internet.herokuapp.com/");
        }
        @AfterMethod
        public void afterMethod() {
            driver.quit();
        }
    }

