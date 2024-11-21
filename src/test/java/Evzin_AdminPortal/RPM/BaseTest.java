package Evzin_AdminPortal.RPM;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	public WebDriver driver;
	
	WebDriverWait wait;

    @BeforeSuite
    public void setup() {
    	//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Initialize wait after driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://kind-flower-094bfea00.5.azurestaticapps.net/");
    }

    @AfterSuite
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
