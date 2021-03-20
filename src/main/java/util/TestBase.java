package util;

import com.google.inject.Inject;
import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

@ScenarioScoped
public class TestBase {

    @Inject
    WebDriverContext webDriverContext;

   public WebDriver driver;
    public static Properties prop;

//    public TestBase(){
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream=new FileInputStream("testdata.properties");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        prop = new Properties();
//        try {
//            prop.load(fileInputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void initialise() {
//        if (prop.getProperty("browser").equals("chrome")) {
//            //open browser
//            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.get(prop.getProperty("url"));
//        }
//        else
//        {
//            System.out.println("Give proper browser name");
//        }
//
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().pageLoadTimeout(TimeUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_TIME, TimeUnit.SECONDS);
//    }


    @Before
    public void invokeBrowser(){
        System.out.println("Before method");

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        webDriverContext.setDriver(driver);
        driver.get("https://www.google.com/");

        System.out.println("InvokeBrowser");
    }

    @After
    public void closeBrowser(){
        System.out.println("After method");
        driver.quit();
    }

}
