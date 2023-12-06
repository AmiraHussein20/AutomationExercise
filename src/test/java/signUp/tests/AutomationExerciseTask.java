package signUp.tests;

import framework.engine.DriveFactory;
import framework.engine.JsonFileManager;
import framework.engine.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signUp.pages.homePage;
import signUp.pages.signUpPage;
import signUp.pages.userInfoPage;


public class AutomationExerciseTask {
    JsonFileManager testData;

    private WebDriver driver;
  private signUpPage signpage;
  private userInfoPage userinfo;
  private homePage homepage;

    @BeforeMethod
    public void beforeMethod() {
        driver = DriveFactory.initDriver();
        driver.manage().window().maximize();
        signpage = new signUpPage(driver);
        userinfo = new userInfoPage(driver);
        homepage = new homePage(driver);
        homepage.navigateToAutomationHomePageUrl();
    }
    @BeforeClass
    public void beforeClass() {
        PropertiesReader.loadProperties();
        testData = new JsonFileManager("src/test/resources/Test Data/TestData.json");
    }
    @Test
    public void CreateUser() {
        homepage.navigateToSignUpPage();
        signpage.assertOnSignUpText("New User Signup!");
        signpage.enterInfoOFSignUpPage(testData.getTestData("testDataName"),testData.getTestData("testDataMail")+System.currentTimeMillis()+"@gizasystems.com");
        userinfo.enterAccountInfo(testData.getTestData("testDataPass"));
        userinfo.assertOnUserInfo("ENTER ACCOUNT INFORMATION");
        userinfo.enterAddressInfo(testData.getTestData("testDataFirstName"),testData.getTestData("testDataLastName"),testData.getTestData("testDataCompany"),testData.getTestData("testDataAddress1"),testData.getTestData("testDataAddress2"),testData.getTestData("testDataState"),testData.getTestData("testDataCity"),testData.getTestData("testDataZipCode"),testData.getTestData("testDataMobile"));
        userinfo.assertAccountCreated("ACCOUNT CREATED!");
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}

