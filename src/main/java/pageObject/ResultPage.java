package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.openqa.selenium.By.xpath;

public class ResultPage extends BasePage{

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//*[@class=\"ui-search-money-picker__li\"]/a/span[contains(text(),'Hasta $ 2.000.000')]")
    private WebElement priceMaxTwoMillons;

    @FindBy(xpath = ".//span[contains(text(),'Córdoba')]")
    private WebElement cordobaProvince;

    @FindBy(xpath = ".//span[contains(text(),'Más relevantes')]")
    private WebElement moreRelevantOption;

    @FindBy(xpath = ".//span[contains(text(),'Menor precio')]")
    private WebElement lowestPriceOption;

    @FindBy(xpath = ".//div[contains(text(),'Córdoba')]")
    private WebElement cordobaFilter;

    @FindBy(xpath = ".//div[contains(text(),'Hasta $ 2.000.000')]")
    private WebElement until2MFilter;

    @FindBy(xpath = ".//span[contains(text(),'resultados')]")
    private WebElement results;

    public void clickOnMaxPrice(){
        getWait().until(ExpectedConditions.visibilityOf(priceMaxTwoMillons));
        this.priceMaxTwoMillons.click();
    }

    public void clickOnCordobaProvince()
    {
        this.cordobaProvince.click();
    }

    public void selectOrderDesc(){
        this.moreRelevantOption.click();
        getWait().until(ExpectedConditions.visibilityOf(lowestPriceOption));
        this.lowestPriceOption.click();
    }

    public boolean isFilterMaxPriceApplied(){
        return this.until2MFilter.getText().contains("Hasta $ 2.000.000");
    }

    public boolean isCordobaProvinceApplied() {
        return this.cordobaFilter.getText().contains("Córdoba");
    }

    public String obtainResults(){
        return this.results.getText();
    }
}
