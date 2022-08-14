package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    // Selenium locators: id, className, tagName, cssSelector, xpath, linkText, partialLinkText, name

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
//        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//body/nav[1]/div[1]/span[1]/div[1]/a[1]")
    private WebElement tourButton;

    @FindBy(xpath="//a[contains(text(),'Stops')]")
    private WebElement stopsButton;

    @FindBy(xpath="//a[contains(text(),'Guides')]")
    private WebElement guidesButton;

    @FindBy(id="login")
    private WebElement loginButton;

    @FindBy(id="register")
    private WebElement registerButton;

    @FindBy(id="tour")
    private WebElement currentButton;

    @FindBy(id = "alltours")
    private WebElement allToursButton;

    @FindBy(id = "logout")
    private WebElement logoutButton;

    @FindBy(id = "mytours")
    private WebElement mytoursbutton;

    @FindBy(id = "addtours")
    private WebElement addtourbutton;


    public void clickToursButton() throws InterruptedException {
Thread.sleep(2);
        tourButton.click();
    }
    public void clickStopsButton() {

        stopsButton.click();
    }
    public void clickGuidesButton() {

        guidesButton.click();
    }
    public void clickLoginButton() {

        loginButton.click();
    }
    public void clickRegisterButton() {

        registerButton.click();
    }
    public void clickCurrentButton() {

        currentButton.click();
    }

    public void loggedInAsUser() {
        LoginPage loginPage = new LoginPage(driver);
        ToursPage toursPage = new ToursPage(driver);
        loginPage.typeUsername("jd03@a.ca");
        loginPage.typePassword("password");

        loginPage.clickLoginButton();


        toursPage.clickHomeButton();
    }

    public void clickLogoutButton() {

        logoutButton.click();
    }

    public void clickAllToursButton() {

        allToursButton.click();
    }

    public void loggedInAsGuide() {
        LoginPage loginPage = new LoginPage(driver);
        ToursPage toursPage = new ToursPage(driver);
        loginPage.typeUsername("mc@a.ca");
        loginPage.typePassword("password");

        loginPage.clickLoginButton();



        toursPage.clickHomeButton();
    }

    public void clickAddTourButton() {

        addtourbutton.click();
    }

    public void clickMyToursButton() {

        mytoursbutton.click();
    }
}