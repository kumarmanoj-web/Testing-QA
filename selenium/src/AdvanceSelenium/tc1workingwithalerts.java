package AdvanceSelenium;

//open browser navigate to tsrtc page.
//click on cheak avilability AND gettext from alerts perform ok operation.





import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc1workingwithalerts {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.tsrtconline.in/oprs-web/guest/home.do?h=1");
	}
	@Test
	public void operation() {
		driver.findElement(By.id("searchBtn")).click();
		String data=driver.switchTo().alert().getText();
		System.out.println(data);
		Sleeper.sleepTightInSeconds(3);
		driver.switchTo().alert().accept();
	}
	public void close() {
		driver.close();
	}

}
