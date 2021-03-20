package com.stepDefinitions;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import util.WebDriverContext;

import java.util.List;

@ScenarioScoped
public class StepDefinition2 extends BaseSD {

    WebDriver driver;
    HomePage homePage;

    @Inject
    StepDefinition2(WebDriverContext webDriverContext) {
        System.out.println("StepDefinition2....Constructor");
        driver = webDriverContext.getDriver();

        //All PageObject below
        homePage = new HomePage(driver);
    }


    @Given("^User is in Site Home page$")
    public void user_is_in_site_home_page() {
        System.out.println("*************************");
        System.out.println(homePage.getTitle());
        System.out.println("*************************");

    }

    @When("^Title of the page is CRM$")
    public void title_of_the_page_is_crm() {
        System.out.println(homePage.getTitle());
    }

    @Then("^click on login button in home page$")
    public void click_on_login_button_in_home_page() {
        System.out.println(homePage.getTitle());

    }


}
