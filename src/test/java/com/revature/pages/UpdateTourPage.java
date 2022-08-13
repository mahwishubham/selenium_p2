package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdateTourPage {
    private WebDriver driver;

    public UpdateTourPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.typeUsername("mc@a.ca");
        loginPage.typePassword("password");

        loginPage.clickLoginButton();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("mytours.html"));
        MyToursPage myToursPage = new MyToursPage(driver);
        myToursPage.clickUpdateFirstButton();
    }
    @FindBy(id = "days")
    private WebElement daysDropdown;

    @FindBy(id = "price")
    private WebElement priceInput;

    @FindBy(id = "inactive")
    private WebElement inactiveRadio;

    @FindBy(id = "active")
    private WebElement activeRadio;

    @FindBy(id = "update-Button")
    private WebElement updateButton;

    public void clickDayDropdown(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(daysDropdown));
        daysDropdown.click();
    }
    public void typeAmount(String price){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.visibilityOf(priceInput));
        priceInput.sendKeys(price);
    }
    public void clickInactiveRadio(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(inactiveRadio));
        inactiveRadio.click();
    }
    public void clickActiveRadio(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(activeRadio));
        activeRadio.click();
    }
    public void clickAddTour(){
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));
        wdw.until(ExpectedConditions.elementToBeClickable(updateButton));
        updateButton.click();
    }
}
