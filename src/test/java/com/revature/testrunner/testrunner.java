package com.revature.testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
@CucumberOptions(glue="com.revature.steps", features={"src/test/resources/index.feature",
        "src/test/resources/login.feature", "src/test/resources/register.feature", "src/test/resources/mytours.feature",
        "src/test/resources/addtour.feature", "src/test/resources/tours.feature"})
public class testrunner extends AbstractTestNGCucumberTests{


    public static WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}