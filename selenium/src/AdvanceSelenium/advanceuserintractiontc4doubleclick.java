package AdvanceSelenium;

//open browser navigate to google.com.
//doubleclick operation on i am feeling.


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class advanceuserintractiontc4doubleclick {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.google.com/");
	}
	@Test
	public void operation() {
	WebElement google=driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div[1]/div[3]/center/input[2]"));
	Actions action=new Actions(driver);
	action.doubleClick(google).build().perform();
	}
   @AfterTest
   public void close() {
	   driver.close();
   }
}
