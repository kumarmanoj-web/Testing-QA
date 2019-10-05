package AdvanceSelenium;

//open browser navigate to world wrost website.
//without know frame no how to find i hate frame element





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithframestc3 {
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
		for(int i=0;i<nframes.size();i++) {
			driver.switchTo().frame(i);
			try {
				driver.findElement(By.xpath("/html/body/p[5]/b/a/font")).click();
				break;
				
			} catch (Exception x) {
				driver.switchTo().defaultContent();
			}
		}
	}
    @AfterTest
    public void close() {
    	driver.close();
    }
}
