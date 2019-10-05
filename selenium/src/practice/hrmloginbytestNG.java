package practice;

//open browser navigate to orangeHRM.
//verify login
//in pim module add employee,choose file from the computer and logout.



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hrmloginbytestNG {

	
	
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://opensource-demo.orangehrmlive.com");
	}
	
	
	@Test
	public void operation() throws AWTException, InterruptedException {
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']/b")).click();
		Sleeper.sleepTightInSeconds(3);
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Sleeper.sleepTightInSeconds(3);

		driver.findElement(By.id("firstName")).sendKeys("sujeet");
		driver.findElement(By.id("lastName")).sendKeys("kumar");
		
		
		driver.findElement(By.id("photofile")).click();
		Sleeper.sleepTightInSeconds(3);
		
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_C);
		rb.keyPress(KeyEvent.VK_B);
		rb.keyPress(KeyEvent.VK_PERIOD);
		rb.keyPress(KeyEvent.VK_J);
		rb.keyPress(KeyEvent.VK_P);
		rb.keyPress(KeyEvent.VK_G);

		
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		
	Sleeper.sleepTightInSeconds(3);
	driver.findElement(By.id("btnSave")).click();
	
		
		driver.findElement(By.id("welcome")).click();
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.linkText("Logout")).click();
		}
		@AfterTest
		public void close() {
			driver.close();
		}
		
		
		
		
	}
	
	
	
