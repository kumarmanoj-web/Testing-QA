package AdvanceSelenium;

//OPEN BROWSER NAVIGATE TO GOIBIBO.COM.
//PERFORM SIGNIN OPERATION ON BOOTSTRAP ELEMENTS.



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc1workingwithbootstrap {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.goibibo.com/");
	}
	@Test
	public void operation() {
		driver.findElement(By.linkText("Sign In")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Log In")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("authUsername")).sendKeys("kumarmanojbadatiya@gmail.com");
		driver.findElement(By.id("authPassword")).sendKeys("9583073000");
		driver.findElement(By.id("authExistingUserSignInBtn")).click();
	}
	@AfterTest
     public void close() {
		driver.close();
	}
}
