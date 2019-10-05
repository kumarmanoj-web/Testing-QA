package workingwithjavascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datepickerwithjavascriptexecutor {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	JavascriptExecutor js;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		Sleeper.sleepTightInSeconds(5);
	}
	@Test
	public void data() {
		
		
		js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('ctl00_mainContent_view_date1').click();");
		//js.executeScript("document.getElementById('ctl00_mainContent_view_date2').value='05/10/2019'");
		
		
	}

}
