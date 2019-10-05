package DOUBTS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class jsdatepickeryatra {
	
public class jsyatra {

		
		ProfilesIni pr;
		FirefoxProfile fp;
		FirefoxDriver driver;
		JavascriptExecutor js;
		@BeforeTest
		public void open() {
			pr=new ProfilesIni();
			fp=pr.getProfile("MK");
			driver=new FirefoxDriver();
			driver.get("https://www.yatra.com/trains");
			
			Sleeper.sleepTightInSeconds(5);
		}
		
		
		@Test
		public void date() {
			
			
		js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('BE_train_depart_date').value='12 Oct'19'");
			//driver.findElement(By.id("BE_train_depart_date")).click();
			//Sleeper.sleepTightInSeconds(3);
			//driver.findElement(By.id("01/10/2019")).click();
		}
		
		
		
}

}
