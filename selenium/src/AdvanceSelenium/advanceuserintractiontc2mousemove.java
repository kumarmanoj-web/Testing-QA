package AdvanceSelenium;
//OPEN BROWSER NAVIGATE TO MERCURY TRAVELS.
//MOUSE MOVE TO ABOUT US.



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class advanceuserintractiontc2mousemove {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.mercurytravels.co.in/");
	}
	@Test
	public void operation() {
		WebElement aboutus=driver.findElement(By.linkText("About Us"));
		Actions action=new Actions(driver);
		action.moveToElement(aboutus).build().perform();
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
