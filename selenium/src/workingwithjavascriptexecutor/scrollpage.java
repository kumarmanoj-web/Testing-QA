package workingwithjavascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrollpage {

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
			driver.get("https://www.redbus.in/");

	}
@Test
public void scroll() {
	js=(JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0,5000)");
    //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");	
	
	js.executeScript("document.getElementById('stats_div').scrollIntoView()");
	
	
}
	
	
	
	
}
}