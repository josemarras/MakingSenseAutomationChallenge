package test;

import driver.MyDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import pageObject.HomePage;


public class BaseTest {
    protected static MyDriver myDriver;
    protected static HomePage homePage;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"browser","url"})

    public void beforeSuite(String browser, String url){
        myDriver = new MyDriver(browser);
        myDriver.getDriver().get(url);
        myDriver.getDriver().manage().window().maximize();
        homePage = new HomePage(myDriver.getDriver());

    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        homePage.dispose();
    }
}
