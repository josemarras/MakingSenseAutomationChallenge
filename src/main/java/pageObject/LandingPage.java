package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="cb1-edit")
    private WebElement searchLbl;

    @FindBy(xpath = (".//*[@aria-label=\"Buscar\"]"))
    private  WebElement searchBtn;

    @FindBy(xpath = "//button[contains(text(),'Entendido')]")
    private  WebElement entendidoBtn;


    public void clickOnAcceptCookies() {
        getWait().until(ExpectedConditions.visibilityOf(entendidoBtn));
        this.entendidoBtn.click();
    }

    public void searchArticle (String article){
        this.searchLbl.sendKeys(article);
        this.searchBtn.click();
    }

    //Asserts
    public boolean isTitleDisplayed(){
        return getDriver().getTitle().equals("Mercado Libre Argentina - Envíos Gratis en el día");

    }
}
