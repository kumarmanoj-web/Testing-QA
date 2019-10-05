package workingwithjavascriptexecutor;

//OPEN BROWSER NAVIGATE TO JQUERYUI.COM.
//DATEPICKER PAGE (WITH OUT JAVA SCRIPT EXECUTOR.



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datepicker {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/datepicker/");
		Sleeper.sleepTightInSeconds(5);
	}
	@Test
	public void data() {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\'datepicker\']")).sendKeys("09/29/2019");
		//driver.findElement(By.id("datepicker")).sendKeys("09/29/2019");
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}
		

}
