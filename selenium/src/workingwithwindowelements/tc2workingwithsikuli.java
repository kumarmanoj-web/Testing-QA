package workingwithwindowelements;

//OPEN BROWSER NAVIGATE TO HDNICEWALLPAPER.COM.
//DOWNLOAD WALLPAPER.



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tigervnc.rfb.screenTypes;

public class tc2workingwithsikuli {
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
	public void download() throws FindFailed {
		driver.findElement(By.xpath("//*[@id=\'DL\']/div")).click();
		Screen sr=new Screen();
		Pattern pt=new Pattern("C:\\Users\\Dell\\Pictures\\Capture.1.PNG");
		sr.click(pt);
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
