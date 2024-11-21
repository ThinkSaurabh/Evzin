package Evzin_ProviderPortal.RPM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Evzin_AdminPortal.RPM.BaseTest;
import Evzin_AdminPortal.RPM.Login;
import Evzin_AdminPortal.RPM.RandomUtil;

public class AddMember extends BaseTest {

	private Login login;
	
	@BeforeClass
    public void setUp() {
        login = new Login(driver);        
    }
	
	@Test
	public void addmember() {
		//Login
		login.login("saurabh.kale+552@thinkitive.com", "R76uzs)*");
		//AddMember button
		driver.findElement(By.xpath("//button[normalize-space()='Add Member']")).click();
		//Enter member details
		driver.findElement(By.xpath("//button[normalize-space()='Enter Member Details']")).click();
		//ID
		driver.findElement(By.name("ehr_id")).sendKeys(String.valueOf(RandomUtil.generateRandomNumber(1000000)));
		//First name
		WebElement First = driver.findElement(By.name("first_name"));
        First.click();
        String Firstname = "Member";
        First.sendKeys(Firstname);
		//Last name
        WebElement Last = driver.findElement(By.name("last_name"));
        Last.click();
        String Lastname = (String.valueOf(RandomUtil.generateRandomNumber(1000)));
        Last.sendKeys(Lastname);
        //Store Provider name 
        String generatedProviderName = Firstname+" "+Lastname;
        System.out.println(generatedProviderName);
        //DOB
        driver.findElement(By.xpath(" //button[@aria-label='Choose date']//*[name()='svg']")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='12']"))).click();
        driver.findElement(By.xpath("//button[normalize-space()='12']")).click();
        //Gender
	    driver.findElement(By.name("gender")).click();
		WebElement gender = driver.findElement(By.xpath("//li[contains(text(), 'Male')]"));
		gender.click();
		//Marital Status
		driver.findElement(By.xpath("//div[6]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")).click();
		driver.findElement(By.xpath("//li[text()='Single']")).click();
		//Race
		driver.findElement(By.xpath("//div[7]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")).click();
		driver.findElement(By.xpath("//li[text()='Asian']")).click();
		//Ethnicity
		driver.findElement(By.xpath("//div[8]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")).click();
		driver.findElement(By.xpath("//li[text()='Hispanic or Latino']")).click();
		//MRN number
		driver.findElement(By.name("mrn")).sendKeys(String.valueOf(RandomUtil.generateRandomNumber(100000)));
		//Contact
		WebElement Phonenumber = driver.findElement(By.xpath("//div[@role='button' and @aria-haspopup='listbox']"));
	    Phonenumber.click();
	    WebElement countryname = driver.findElement(By.xpath("//span[@class='country-name' and text()='India']"));
	    countryname.click();
	    driver.findElement(By.xpath("//input[@placeholder='Enter phone number']")).sendKeys("9"+String.valueOf(RandomUtil.generateRandomNumber(1000000000)));
	    //Email
	    String Randomemail = Evzin_AdminPortal.RPM.RandomEmail.GetrandomEmail();
	    driver.findElement(By.name("email")).sendKeys(Randomemail);
	    //Primary Care Provider
	    driver.findElement(By.xpath("//div[13]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")).click();
	    driver.findElement(By.xpath("//li[text()='Garry Smith']")).click();
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	    List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='presentation']//li")));
//	    if (options.isEmpty()) {
//	        throw new RuntimeException("No options found in the dropdown");
//	    }
//	    Random random = new Random();
//	    int randomIndex = random.nextInt(options.size());
//	    WebElement randomOption = options.get(randomIndex);
//	    System.out.println("Selected Option: " + randomOption.getText());
//	    randomOption.click();
	    //Consent
	    driver.findElement(By.xpath("//div[14]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")).click();
	    driver.findElement(By.xpath("//li[text()='Yes']")).click();
	    //Address Line 1
	    driver.findElement(By.name("address.address_line_1")).sendKeys("abc");
	    //Address Line 2
	    driver.findElement(By.name("address.address_line_2")).sendKeys("xyz");
	    //Country
	    driver.findElement(By.xpath("//div[19]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")).click();
	    driver.findElement(By.xpath("//li[text()='India']")).click();
	    //State
	    driver.findElement(By.name("address.state")).sendKeys("MH");
	    //City
	    driver.findElement(By.name("address.city")).sendKeys("Pune");
	    //ZIP
	    driver.findElement(By.name("address.zip")).sendKeys(String.valueOf(RandomUtil.generateRandomNumber(100000)));
	    //Save
	    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	}

}
