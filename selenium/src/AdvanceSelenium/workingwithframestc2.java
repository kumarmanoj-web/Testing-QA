package AdvanceSelenium;

//open browser navigate to world wrost website.
//click on i hata frames element which is present under the frames.


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithframestc2 {
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
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
	}
	
		
		@AfterTest
		public void close() {
			driver.close();
		
		
		
		
		
		
	}

		}
