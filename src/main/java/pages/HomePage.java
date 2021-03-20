package pages;

import io.cucumber.java.de.Wenn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.TestBase;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(xpath = "//title[contains(text(),'Free CRM')]")
    WebElement homePageTitle;

    @FindBy(xpath = "//*[contains(@href,'ui.cogmento.com')]")
    WebElement loginHomeBtn;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String verifyHomePageTitle(){
        return homePageTitle.getText();
    }

    public LoginPage clickLoginBtn(){
        loginHomeBtn.click();
        return new LoginPage();
    }

}
