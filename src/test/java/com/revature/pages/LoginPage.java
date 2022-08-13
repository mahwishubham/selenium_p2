package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public void typeUsername(String username) {
        // The following line of code is replaced by using PageFactory instead
//        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys(username);
    }

    public void typePassword(String password) {
        // The following line of code is replaced by using PageFactory instead
//        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);
    }
    public void clickLoginButton() {
        // The following line of code is replaced by using PageFactory instead
//        WebElement loginButton = driver.findElement(By.id("login-btn"));
        loginButton.click();
    }
    public void clickToursButton() {
        // The following line of code is replaced by using PageFactory instead
//        WebElement loginButton = driver.findElement(By.id("login-btn"));
        tourButton.click();
    }
    public void clickStopsButton() {
        // The following line of code is replaced by using PageFactory instead
//        WebElement loginButton = driver.findElement(By.id("login-btn"));
        stopsButton.click();
    }
    public void clickGuidesButton() {
        // The following line of code is replaced by using PageFactory instead
//        WebElement loginButton = driver.findElement(By.id("login-btn"));
        guidesButton.click();
    }
    public void clickHomeButton() {
        // The following line of code is replaced by using PageFactory instead
//        WebElement loginButton = driver.findElement(By.id("login-btn"));
        homeButton.click();
    }
    public void clickRegisterButton() {
        // The following line of code is replaced by using PageFactory instead
//        WebElement loginButton = driver.findElement(By.id("login-btn"));
        registerButton.click();
    }

}