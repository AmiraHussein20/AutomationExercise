import org.testng.annotations.*;

public class TestNGDemo {
    @Test()
    public void test1(){
        System.out.println("test1");
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2");
    }
    @Test(dependsOnMethods = {"test2"})
    public void test3(){
        System.out.println("test3");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method to run before each test case");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method to run after each test case");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class to run before any test case in the class (First thing in the class to be executed)");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class to run after any test case in the class (Last thing in the class to be executed)");
    }
}
