package workingwithautoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class upload {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://upload.photobox.com/en/#");
	}
	@Test
	public void upload() throws IOException {
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("computer_icone_name")).click();
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.id("button_desktop")).click();
		Sleeper.sleepTightInSeconds(5);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\pho.exe");
		

}
}