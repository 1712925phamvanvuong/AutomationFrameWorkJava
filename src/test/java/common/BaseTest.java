package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    public WebDriver getDriver(){
        return driver;
    }

    public WebDriver setDriver(String browserType, String appURL){
        switch (browserType){
            case "chrome":{
                this.driver = initChromeDriver(appURL);
                break;
            }
            case "firefox":{
                this.driver = initFirefoxDriver(appURL);
                break;
            }
            case "IE":{
                this.driver = initIEDriver(appURL);
                break;
            }
            default:
                this.driver = initChromeDriver(appURL);
        }
        return this.driver;
    }

    private static WebDriver initChromeDriver(String appURL){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    private static WebDriver initFirefoxDriver(String appURL){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    private static WebDriver initIEDriver(String appURL){
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.navigate().to(appURL);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    @BeforeMethod
    public void initializeTestBaseSetup(String browserType, String appURl){
        try{
            setDriver(browserType, appURl);
        }catch (Exception e){

        }
    }
}
