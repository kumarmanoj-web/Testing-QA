package workingwithwindowelements;

//open the browser navigate to cutebabywallpaper page.
//download wallpaper by using autoit.




import java.io.IOException;

import org.apache.commons.exec.launcher.Java13CommandLauncher;
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

public class tc4workingwithautoit {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver();
		driver.get("http://www.hdnicewallpapers.com/Wallpaper-Download/Cute-Baby/Cute-Sleeping-Baby-Wallpaper");
	}
	@Test
	public void download() throws IOException {
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath("//*[@id=\"DL\"]/div")).click();
		Sleeper.sleepTightInSeconds(3);
	java.lang.Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\PROG1.exe");
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

	

}
