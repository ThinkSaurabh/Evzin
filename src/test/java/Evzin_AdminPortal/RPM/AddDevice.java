package Evzin_AdminPortal.RPM;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddDevice extends Authentication{

	
	 @Test(priority=3)
		
		public void ClickHospital() throws InterruptedException {
		    Thread.sleep(1000);
			driver.findElement(By.xpath("//p[normalize-space()='Hospital193']")).click();
		}
	 
	@Test(priority=4)
	public void ClickDevice() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/div[2]/div/div[1]/div/div/div/button[3]")).click();
	}
	
	@Test(priority=5)
	public void AddDevicebutton() {
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div/div/div[1]/div[2]/button[2]")).click();
	}
	
	@Test(priority=6)
	public void Adddeviceform() throws InterruptedException {
		String Devicename = "Device" + String.valueOf(1000);
		driver.findElement(By.name("device_name")).sendKeys(Devicename);
		System.out.println(Devicename);
		driver.findElement(By.name("serial_number")).sendKeys(String.valueOf(1000000));
		driver.findElement(By.name("device_id")).sendKeys(String.valueOf(1000));
		driver.findElement(By.xpath("//button[@title='Open']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//li[text()='Hospital419']")).click();		
//	    driver.findElement(By.xpath("//*[@id=\":rh:\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	}
	
	
}
