package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);

        //Receive driver and wait time
        wait = new WebDriverWait(driver, 3);
        this.driver = driver;
    }

    protected WebDriver getDriver(){
        return driver;
    }

    protected WebDriverWait getWait(){
        return wait;
    }

    public void dispose(){
        if(driver != null){
            driver.quit();
        }
    }
}
