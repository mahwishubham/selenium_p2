package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    // Selenium locators: id, className, tagName, cssSelector, xpath, linkText, partialLinkText, name

    private WebDriver driver;

    @FindBy(id="email-login-input")
    private WebElement usernameInput;

    @FindBy(id="password-login-input")
    private WebElement passwordInput;

    @FindBy(id="login")
    private WebElement loginButton;

    @FindBy(xpath="//body/nav[1]/div[1]/span[1]/div[1]/a[1]")
    private WebElement tourButton;

    @FindBy(xpath="//a[contains(text(),'Stops')]")
    private WebElement stopsButton;

    @FindBy(xpath="//a[contains(text(),'Guides')]")
    private WebElement guidesButton;

    @FindBy(id="home")
    private WebElement homeButton;

    @FindBy(id="register")
    private WebElement registerButton;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
//        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public void typeUsername(String username) {

        usernameInput.sendKeys(username);
    }

    public void typePassword(String password) {

        passwordInput.sendKeys(password);
    }
    public void clickLoginButton() {

        loginButton.click();
    }
    public void clickToursButton() {

        tourButton.click();
    }
    public void clickStopsButton() {

        stopsButton.click();
    }
    public void clickGuidesButton() {

        guidesButton.click();
    }
    public void clickHomeButton() {

        homeButton.click();
    }
    public void clickRegisterButton() {

        registerButton.click();
    }

}