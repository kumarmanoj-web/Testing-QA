package workingwithwindowelements;

//download selenium webdriver jar by using sikuli.



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

public class tc1workingwithsikuli {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.seleniumhq.org/download/");
	}
	@Test
	public void download() throws FindFailed {
		driver.findElement(By.linkText("3.141.59")).click();
		Sleeper.sleepTightInSeconds(3);
		Screen sr=new Screen();
		Pattern pt=new Pattern("C:\\Users\\Dell\\Desktop\\Capture.PNG");
		sr.click(pt);
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	

}
