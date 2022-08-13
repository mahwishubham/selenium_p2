package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ToursPage {
    private WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Guides')]")
    private WebElement guidesButton;

    @FindBy(xpath = "//a[contains(text(),'Stops')]")
    private WebElement stopsButton;

    @FindBy(id = "register")
    private WebElement registerButton;

    @FindBy(id = "login")
    private WebElement loginButton;

    @FindBy(id = "home")
    private WebElement homeButton;

    public ToursPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
    public void ToursPageLoggedUser(WebDriver login){
        LoginPage loginPage = new LoginPage(login);
        loginPage.typeUsername("jd03@a.ca");
        loginPage.typePassword("password");

        loginPage.clickLoginButton();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("tours.html"));
    }
    public void ToursPageLoggedGuide(WebDriver guide){
        LoginPage loginPage = new LoginPage(guide);
        loginPage.typeUsername("mc@a.ca");
        loginPage.typePassword("password");

        loginPage.clickLoginButton();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(3));

        wdw.until(ExpectedConditions.urlContains("mytours.html"));
        loginPage.clickToursButton();
    }

    public void clickGuideButton() {
        guidesButton.click();
    }

    public void clickStopsButton() {
        stopsButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void clickHomeButton() {homeButton.click();
    }
}