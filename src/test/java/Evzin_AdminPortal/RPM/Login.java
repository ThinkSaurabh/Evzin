package Evzin_AdminPortal.RPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BaseTest{

	
	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void login(String email, String password) {
		driver.findElement(By.name("email")).sendKeys(email);
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.cssSelector(".MuiButton-containedPrimary.MuiButton-fullWidth")).click();
	}
}
