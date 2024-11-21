package Evzin_AdminPortal.RPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Authentication extends BaseTest{
	

	Login login;
	
	 @BeforeMethod
	    public void setUpLogin() {
	        login = new Login(driver); // Pass the driver to Login
	    }
	 
	@Test(priority=1)
	public void testlogin() throws InterruptedException {
		login.login("omkar.more@thinkitive.com", "Qwerty@123");
	}
	
 	
	@Test(priority=7)
	void testlogout() {
 		WebElement logoutbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Logout']")));
 	    logoutbutton.click();
 	    WebElement yesButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("Yes")));
 	    yesButton.click();
	}
	
	
	
	

}
