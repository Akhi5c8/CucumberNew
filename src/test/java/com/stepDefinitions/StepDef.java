package com.stepDefinitions;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.WebDriverContext;

import java.util.List;

@ScenarioScoped
public class StepDef extends BaseSD {

    StepDef(){
        System.out.println("StepDef....Constructor");
    }


    @Inject
    WebDriverContext webDriverContext;


    @Then("^user enters username and password$")
    public void user_enters_username_and_password() {
//        List<WebElement> element=webDriverContext.getDriver().findElements(By.tagName("a"));
//        for (int i=0;i<element.size();i++){
//            System.out.println(element.get(i).getText());
//        }

    }

}
