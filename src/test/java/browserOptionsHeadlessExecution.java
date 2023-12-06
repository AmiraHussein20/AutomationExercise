import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class browserOptionsHeadlessExecution {
    WebDriver driver;

        @Test
        public void arguments() {
            ChromeOptions options = new ChromeOptions();

            options.addArguments("-headless");

            driver = new ChromeDriver(options);
        }

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}


