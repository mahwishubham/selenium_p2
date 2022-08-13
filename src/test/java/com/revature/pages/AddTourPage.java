package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddTourPage {
    // Selenium locators: id, className, tagName, cssSelector, xpath, linkText, partialLinkText, name

    private WebDriver driver;

    public AddTourPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
        LoginPage loginPage = new LoginPage(driver);
        MyToursPage myToursPage = new MyToursPage(driver);

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("mytours.html"));
        myToursPage.clickAddTour();
        wdw.until(ExpectedConditions.urlContains("addTour.html"));

    }
    @FindBy(id = "days")
    private WebElement dayDropdown;

    @FindBy(xpath = "//body/div[@id='home']/div[1]/ul[1]/div[1]/div[1]")
    private WebElement poiDropdown;

    @FindBy(id = "price")
    private WebElement priceInput;

    @FindBy(id = "title")
    private WebElement titleInput;

    public void clickDayDropdown() {
        dayDropdown.click();
    }
    public void clickPoiDropdown(){
        poiDropdown.click();
    }
    public void typePoiDropdown(String pois){
        poiDropdown.sendKeys(pois);
    }
    public void typePrice(String price){
        priceInput.sendKeys(price);
    }
    public void typeTitle(String title){
        titleInput.sendKeys(title);
    }
}
