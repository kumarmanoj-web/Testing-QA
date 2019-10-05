package workingwithwindowelements;

//OPEN BROWSER NAVIGATE TO SELENIUM.ORG.
//DOWNLOAD WEBDRIVER JAR..




import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc5workingwithautoit {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
	}
	@Test
	public void download() throws IOException {
		driver.findElement(By.linkText("3.141.59")).click();
		Sleeper.sleepTightInSeconds(5);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\PR1.exe");
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
