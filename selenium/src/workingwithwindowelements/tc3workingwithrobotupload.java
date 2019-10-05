package workingwithwindowelements;

//open browser navigate to photobox.com.
//upload photo by using computer option


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc3workingwithrobotupload {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://upload.photobox.com/en/");
	}
	@Test
	public void upload() throws AWTException, InterruptedException {
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("computer_icone_name")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("button_desktop")).click();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_C);
		rb.keyPress(KeyEvent.VK_B);
		Thread.sleep(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}

