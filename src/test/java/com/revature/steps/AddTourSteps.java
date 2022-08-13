package com.revature.steps;

import com.revature.pages.AddTourPage;
import com.revature.pages.LoginPage;
import com.revature.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import static com.revature.testrunner.testrunner.driver;

public class AddTourSteps {
    public AddTourPage addTourPage;


    @Given("I am at the add tours page")
    public void iamatheaddtourspage(){
        driver.get("http://ec2-35-91-56-192.us-west-2.compute.amazonaws.com/login.html");
        addTourPage = new AddTourPage(driver);


    }


    @When("I select {string} for day")
    public void iSelectForDay(String day) {
        addTourPage.clickDayDropdown();

    }
}
