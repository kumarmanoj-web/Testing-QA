package AdvanceSelenium;

//open browser navigate to world wrost websites.
//count no of frames





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithframetc1 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	@Test
	public void frames() {
		List<WebElement>nframes=driver.findElements(By.tagName("frame"));
		System.out.println("no of frames are "+" "+ nframes.size());
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	
	
	
	
	
	
	

}
