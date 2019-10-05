package AdvanceSelenium;

//open browser navigate to google.com.
//perform rightclick operation on Gmail element.




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class advanceuserintarctionstc1rightclick {
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
		WebElement Gmail=driver.findElement(By.linkText("Gmail"));
		Actions action=new Actions(driver);
		action.contextClick(Gmail).build().perform();
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
