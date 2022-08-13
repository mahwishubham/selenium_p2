package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    // Selenium locators: id, className, tagName, cssSelector, xpath, linkText, partialLinkText, name

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
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
    public void clickLoginButton() {
        // The following line of code is replaced by using PageFactory instead
//        WebElement loginButton = driver.findElement(By.id("login-btn"));
        loginButton.click();
    }
    public void clickRegisterButton() {
        // The following line of code is replaced by using PageFactory instead
//        WebElement loginButton = driver.findElement(By.id("login-btn"));
        registerButton.click();
    }
    public void clickCurrentButton() {
        // The following line of code is replaced by using PageFactory instead
//        WebElement loginButton = driver.findElement(By.id("login-btn"));
        currentButton.click();
    }
}