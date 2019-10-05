package AdvanceSelenium;

//open browser navigate to jquery.com.
//perform drag and drop operation on slider.


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class advanceuserintractiontc3slider {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://jqueryui.com/slider/");
	}
	@Test
	public void operation() {
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.id("slider"));
		Actions action=new Actions(driver);
		int loc=slider.getLocation().x;
		Sleeper.sleepTightInSeconds(3);
		action.dragAndDropBy(slider, 80, loc).build().perform();
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
