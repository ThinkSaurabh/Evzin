package Evzin_AdminPortal.RPM;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProviderGroup extends BaseTest{
	
	//Create hospital name variable at global level
	String Hospital = "Hospital"+ String.valueOf(RandomUtil.generateRandomNumber(1000));
	//Initialize wait class
	
	@Test(priority=1)
	public void testlogin() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("omkar.more@thinkitive.com");
	    driver.findElement(By.name("password")).sendKeys("Qwerty@123");
	    //driver.findElement(By.cssSelector(".MuiButton-containedPrimary.MuiButton-fullWidth")).click();
	    WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".MuiButton-containedPrimary.MuiButton-fullWidth")));
	    System.out.println("Clicking login button");
	    loginButton.click();
	}

	@Test(priority=2, dependsOnMethods = {"testlogin"})
	public void ProviderGroup() throws InterruptedException {
		
	    //Add button
		WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiButton-containedPrimary') and normalize-space()='Add']")));
		addButton.click();
	    //Add Provider group button
	    driver.findElement(By.xpath("//li[normalize-space()='Add Provider Group']")).click();
	    //Id number
	    driver.findElement(By.name("id_number")).sendKeys(String.valueOf(RandomUtil.generateRandomNumber(100000)));
	    //Hospital name
	    WebElement Providergroup = driver.findElement(By.name("hospital_name"));
	    Providergroup.sendKeys(Hospital);
	    //type of facility
	    driver.findElement(By.name("type_of_facility")).click();
	    driver.findElement(By.xpath("//*[text()='demo']")).click();
	    //registration no.
	    driver.findElement(By.name("registration_number")).sendKeys(String.valueOf(RandomUtil.generateRandomNumber(1000000)));
	    //contact
	    driver.findElement(By.name("contact_person_name")).sendKeys("abc");
	    //designation
	    driver.findElement(By.name("contact_person_designation")).sendKeys("QA engineer");
	    //Email
	    String RandomEmail = Evzin_AdminPortal.RPM.RandomEmail.GetrandomEmail();
	    WebElement Emailinput = driver.findElement(By.name("contact_email"));
	    Emailinput.sendKeys(RandomEmail);
	    //Phone no.
	    WebElement phoneDropdown = driver.findElement(By.xpath("//div[@role='button' and @aria-haspopup='listbox']"));
	    phoneDropdown.click();
	    WebElement option = driver.findElement(By.xpath("//span[@class='country-name' and text()='India']"));
	    option.click();
	    driver.findElement(By.xpath("//input[@placeholder='Contact phone number']")).sendKeys("9"+String.valueOf(RandomUtil.generateRandomNumber(1000000000)));
	    //Organization address line 1
	    driver.findElement(By.name("address.address_line_1")).sendKeys("abc");
	    //Organization address line 2
	    driver.findElement(By.name("address.address_line_2")).sendKeys("xyz");
	    //Country name
	    WebElement Countrydropdown = driver.findElement(By.name("country"));
	    Countrydropdown.click();
	    WebElement country = driver.findElement(By.xpath("//li[contains(text(), 'India')]"));
	    country.click();
	    //State
	    driver.findElement(By.name("address.state")).sendKeys("Maharashtra");
	    //City
	    driver.findElement(By.name("address.city")).sendKeys("Pune");
	    //Zip
	    driver.findElement(By.name("address.zip")).sendKeys("411057");
	    //Staff
	    driver.findElement(By.name("number_of_staff")).sendKeys("15");
	    //Bed
	    driver.findElement(By.name("number_of_bed")).sendKeys("100");
	    //Specialties
	    WebElement Specialties = driver.findElement(By.name("speciality"));
	    Specialties.click();
	    WebElement Specialties2 = driver.findElement(By.xpath("//li[contains(text(), 'Orthopedics')]"));
	    Specialties2.click();
	    //operating hours
	    driver.findElement(By.name("operating_hours")).sendKeys("12");
	    //Insurance accepted
	    WebElement Insurance = driver.findElement(By.name("insurance_accepted"));
	    Insurance.click();
	    WebElement Insurance2 = driver.findElement(By.xpath("//li[contains(text(), 'Private Health Insurance')]"));
	    Insurance2.click();
	    //Affiliated networks
	    WebElement Affiliatednetworks = driver.findElement(By.name("affiliated_networks"));
	    Affiliatednetworks.click();
	    WebElement Affiliatednetworks2 = driver.findElement(By.xpath("//li[contains(text(), 'Medicaid')]"));
	    Affiliatednetworks2.click();
	    //Telehealth
	    WebElement Telehealth = driver.findElement(By.name("telehealth_services"));
	    Telehealth.click();
	    WebElement telehealthservice = driver.findElement(By.xpath("//li[contains(text(), 'demo')]"));
	    telehealthservice.click();
	    //Compliance certification
	    WebElement Compliancecertification = driver.findElement(By.name("compliance_certifications"));
	    Compliancecertification.click();
	    WebElement Compliancecertification2 = driver.findElement(By.xpath("//li[contains(text(), 'GDPR Compliant')]"));
	    Compliancecertification2.click();
	    //Timezone
	    WebElement Timezone = driver.findElement(By.name("timezone"));
	    Timezone.click();
	    WebElement Timezone2 = driver.findElement(By.xpath("//li[contains(text(), 'America/Phoenix')]"));
	    Timezone2.click();
	    //Website
	    driver.findElement(By.name("website")).sendKeys("https://xd.adobe.com/");
	    //tax id
	    driver.findElement(By.name("tax_id")).sendKeys(String.valueOf(RandomUtil.generateRandomNumber(100000)));
	    //NPI no.
	    driver.findElement(By.name("npi_number")).sendKeys(String.valueOf(RandomUtil.generateRandomNumber(1000000000))+"0");
	    //State license no.
	    driver.findElement(By.name("state_license_number")).sendKeys(String.valueOf(RandomUtil.generateRandomNumber(100000)));
	    //Note
	    driver.findElement(By.name("note")).sendKeys("Test note");
	    //Save button
	    WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'MuiButton-containedPrimary') and text()='Save']")));
	    saveButton.click();
	    }
	
    @Test(priority=3,dependsOnMethods= {"ProviderGroup"})
	
	public void ClickHospital() throws InterruptedException {
    	WebElement hospital = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='"+ Hospital + "']")));
    	hospital.click();
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
//        driver.findElement(By.xpath("//button[@aria-label='Choose time']")).click();
//        driver.findElement(By.xpath("(//li[@aria-label='5 hours'])[1]")).click();
//        driver.findElement(By.xpath("(//li[@aria-label='20 minutes'])[1]")).click();
	    //Language
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
		WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'MuiButton-containedPrimary') and text()='Save']")));
	    saveButton.click();
	    //CheckProvider
	    String providerXpath = "//p[contains(normalize-space(text()),'" + generatedProviderName + "')]";
	    Assert.assertTrue(
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(providerXpath))) != null,
	            "Provider " + generatedProviderName + " not found."
	        );
	    System.out.println("Provider " + generatedProviderName + " found successfully.");
	    
	}
	
	@Test(priority=7)
	void testlogout() {
 		WebElement logoutbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Logout']")));
 	    logoutbutton.click();
 	    WebElement yesButton = wait.until(ExpectedConditions.elementToBeClickable(By.name("Yes")));
 	    yesButton.click();
	}
	
}
