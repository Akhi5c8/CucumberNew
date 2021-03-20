package util;

import io.cucumber.guice.ScenarioScoped;
import lombok.Data;
import org.openqa.selenium.WebDriver;

@Data
@ScenarioScoped
public class WebDriverContext {

   WebDriverContext(){
      System.out.println("WebDriverContext............Called");
   }

   WebDriver driver;

}
