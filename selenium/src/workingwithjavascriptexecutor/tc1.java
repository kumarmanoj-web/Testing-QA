package workingwithjavascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc1 {
	ProfilesIni pr;
	FirefoxProfile fp;
	JavascriptExecutor js;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.facebook.com/");

}
	@Test
	public void data() {
		 js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='ksujeet568@gmail.com'");
		js.executeScript("document.getElementById('pass').value='Sujeet@12345'");
		js.executeScript("document.getElementById('u_0_b').click()");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
