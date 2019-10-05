package workingwithwindowelements;

//open browser navigate to cutebaby.com.
//download wallpaper



import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class tc1workingwithrobot {
	ProfilesIni pr;
	FirefoxProfile fp;
	JavascriptExecutor js;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("http://www.hdnicewallpapers.com/Wallpaper/Cute-Baby/Cute-Sleeping-Baby-Wallpaper/1280x800");
	}
	@Test
	public void operation() throws AWTException, InterruptedException {
		
		
		driver.findElement(By.xpath("//a[2]//img[1]")).click();
		Robot rb=new Robot();
		Thread.sleep(3000);
		rb.keyRelease(java.awt.event.KeyEvent.VK_DOWN);
		rb.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	}
	

}
