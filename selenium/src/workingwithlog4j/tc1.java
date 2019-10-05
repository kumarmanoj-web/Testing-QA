package workingwithlog4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc1 {
private static Logger log=Logger.getLogger(tc1.class);
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		DOMConfigurator.configure("log4j.xml");
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		log.info("start");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.seleniumhq.org/download/");
		log.info("open");
	}
	@Test
	public void download() throws FindFailed {
		driver.findElement(By.linkText("3.141.59")).click();
		log.info("click");
		Sleeper.sleepTightInSeconds(3);
		Screen sr=new Screen();
		Pattern pt=new Pattern("C:\\Users\\Dell\\Desktop\\Capture.PNG");
		sr.click(pt);
		log.info("complete");
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	

}
