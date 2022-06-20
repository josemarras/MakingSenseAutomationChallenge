package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.LandingPage;
import pageObject.ResultPage;

public class searchCar extends BaseTest{
    protected LandingPage landingPage;
    protected HomePage homePage;
    protected ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        this.homePage = new HomePage(myDriver.getDriver());
        this.landingPage = new LandingPage(myDriver.getDriver());
        this.resultPage = new ResultPage(myDriver.getDriver());
    }

    @Test
    public void searchCardTest() {
        String car = "Autos";
        String province = "Córdoba";

        //Select Argentina country
        this.homePage.clickOnArg();

        //Accept Cookies
        this.landingPage.clickOnAcceptCookies();

        //Send text "Autos" to search
        Assert.assertTrue(this.landingPage.isTitleDisplayed());
        this.landingPage.searchArticle(car);

        //Apply filters
        this.resultPage.clickOnMaxPrice();
        this.resultPage.clickOnCordobaProvince();
        this.resultPage.selectOrderDesc();

        //Assert filters applied
        Assert.assertTrue(this.resultPage.isCordobaProvinceApplied());
        Assert.assertTrue(this.resultPage.isFilterMaxPriceApplied());

        //Print results
        String resultados = this.resultPage.obtainResults();
        System.out.println("La cantidad de Autos encontrados para el filtro aplicado es de: " +resultados);




    }




}
