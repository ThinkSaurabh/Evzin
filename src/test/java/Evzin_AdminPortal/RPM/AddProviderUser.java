package Evzin_AdminPortal.RPM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProviderUser extends Authentication{

	 @Test(priority=3)
		
		public void ClickHospital() throws InterruptedException {
		    Thread.sleep(5000);
			driver.findElement(By.xpath("//p[normalize-space()='Hospital193']")).click();
		}
		
		@Test(priority=4, dependsOnMethods= {"ClickHospital"})
		
		public void ClickProviders() {
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();	
		}
		
		@Test(priority=5, dependsOnMethods= {"ClickProviders"})
		
		public void AddProviderUserbutton() {
			driver.findElement(By.xpath("//button[normalize-space()='Add Provider User']")).click();
		}
		
		@Test(priority=6, dependsOnMethods= {"AddProviderUserbutton"})
		
		public void AddProviderUser() throws InterruptedException {
			
			String generatedProviderName;
			String Firstname;
			String Lastname;
			
			//Provider type
			driver.findElement(By.name("provider_type")).click();
			WebElement ProviderType = driver.findElement(By.xpath("//li[contains(text(), 'Billing Admin')]"));
			ProviderType.click();
			//ID
			driver.findElement(By.name("id_number")).sendKeys(String.valueOf(RandomUtil.generateRandomNumber(100000)));
			//First name
	        WebElement First = driver.findElement(By.name("first_name"));
	        First.click();
	        Firstname = "Provider";
	        First.sendKeys(Firstname);
			//Last name
	        WebElement Last = driver.findElement(By.name("last_name"));
	        Last.click();
	        Lastname = (String.valueOf(RandomUtil.generateRandomNumber(1000)));
	        Last.sendKeys(Lastname);
	        //Store Provider name 
	        generatedProviderName = Firstname+" "+Lastname;
	        System.out.println(generatedProviderName);
			//Role
			driver.findElement(By.name("role")).click();
			WebElement Role = driver.findElement(By.xpath("//li[contains(text(), 'demo')]"));
			Role.click();
			//Specialty
			driver.findElement(By.name("speciality")).click();
			WebElement speciality = driver.findElement(By.xpath("//li[contains(text(), 'Cardiology')]"));
			speciality.click();
			//license_number
			driver.findElement(By.name("license_number")).sendKeys(String.valueOf(RandomUtil.generateRandomNumber(1000000)));
			//Npi
			driver.findElement(By.name("npi")).sendKeys("0"+String.valueOf(RandomUtil.generateRandomNumber(1000000000)));
			//Email
			String Randomemail = Evzin_AdminPortal.RPM.RandomEmail.GetrandomEmail();
		    WebElement emailinput = driver.findElement(By.name("email"));
		    emailinput.sendKeys(Randomemail);
		    //Phone no.
		    WebElement Phonenumber = driver.findElement(By.xpath("//div[@role='button' and @aria-haspopup='listbox']"));
		    Phonenumber.click();
		    WebElement countryname = driver.findElement(By.xpath("//span[@class='country-name' and text()='India']"));
		    countryname.click();
		    driver.findElement(By.xpath("//input[@placeholder='Enter phone number']")).sendKeys("9"+String.valueOf(RandomUtil.generateRandomNumber(1000000000)));
		    //Gender
		    driver.findElement(By.name("gender")).click();
			WebElement gender = driver.findElement(By.xpath("//li[contains(text(), 'Male')]"));
			gender.click();
			//DOB
			driver.findElement(By.xpath("//button[@aria-label='Choose date']//*[name()='svg']")).click();
			driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/button[3]")).click();
			
			//Clinic Address Line 1
			driver.findElement(By.name("address.address_line_1")).sendKeys("abc");
			//Clinic Address Line 2
			driver.findElement(By.name("address.address_line_2")).sendKeys("xyz");
			//Country
			WebElement Country = driver.findElement(By.name("country"));
			Country.click();
		    WebElement country1 = driver.findElement(By.xpath("//li[contains(text(), 'India')]"));
		    country1.click();
		    //State
		    driver.findElement(By.name("address.state")).sendKeys("Maharashtra");
		    //City
		    driver.findElement(By.name("address.city")).sendKeys("Pune");
		    //Zip
		    driver.findElement(By.name("address.zip")).sendKeys("411057");
		    //year_of_experience
		    driver.findElement(By.name("year_of_experience")).sendKeys("20");
		    //working_hours
		    driver.findElement(By.name("working_hours")).sendKeys("8");
		    //Availability 1
		    driver.findElement(By.xpath("//button[@aria-label='Choose time']")).click();
	        driver.findElement(By.xpath("(//li[@aria-label='4 hours'])[1]")).click();
	        driver.findElement(By.xpath("(//li[@aria-label='15 minutes'])[1]")).click();
	        //Availability 2
	        int maxRetries = 3; // Maximum number of retries
	        for (int i = 0; i < maxRetries; i++) {
	            try {
	                // Click the "Choose time" button
	                driver.findElement(By.xpath("//button[@aria-label='Choose time']")).click();
	                
	                // Select "5 hours"
	                driver.findElement(By.xpath("(//li[@aria-label='5 hours'])[1]")).click();
	                
	                // Select "20 minutes"
	                driver.findElement(By.xpath("(//li[@aria-label='20 minutes'])[1]")).click();
	                
	                // Exit loop if successful
	                break;
	            } catch (StaleElementReferenceException e) {
	                System.out.println("StaleElementReferenceException caught. Retrying... (" + (i + 1) + "/" + maxRetries + ")");
	                // Optionally, add a short wait before retrying
	                Thread.sleep(1000);
	            } catch (Exception e) {
	                System.out.println("An unexpected exception occurred: " + e.getMessage());
	                throw e; // Rethrow if it's a different exception
	            }
	        }

//	        driver.findElement(By.xpath("//button[@aria-label='Choose time']")).click();
//	        driver.findElement(By.xpath("(//li[@aria-label='5 hours'])[1]")).click();
//	        driver.findElement(By.xpath("(//li[@aria-label='20 minutes'])[1]")).click();
//		    //Language
		    driver.findElement(By.name("language")).click();
			WebElement language = driver.findElement(By.xpath("//li[contains(text(), 'English')]"));
			language.click();
			//website
			driver.findElement(By.name("website")).sendKeys("https://xd.adobe.com/");
			//state_license_number
			driver.findElement(By.name("state_license_number")).sendKeys(String.valueOf(RandomUtil.generateRandomNumber(100000)));
			//Bio
			driver.findElement(By.name("bio")).sendKeys("Test bio");
			//Save
			driver.findElement(By.xpath("//button[contains(@class, 'MuiButton-containedPrimary') and text()='Save']")).click();
		    Thread.sleep(3000);
		    //CheckProvider
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    String providerXpath = "//p[contains(normalize-space(text()),'" + generatedProviderName + "')]";
		    Assert.assertTrue(
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(providerXpath))) != null,
		            "Provider " + generatedProviderName + " not found."
		        );
		    System.out.println("Provider " + generatedProviderName + " found successfully.");
		    
		}
}
