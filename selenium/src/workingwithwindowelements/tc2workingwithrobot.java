package workingwithwindowelements;

//open browser navigate to seleniumhq.org.
//download webdriver jar by using robot


import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class tc2workingwithrobot {
	ProfilesIni pr;
	FirefoxProfile fp;
	JavascriptExecutor js;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.seleniumhq.org/download/");
	}
	@Test
	public void robot() throws AWTException, InterruptedException {
		driver.findElement(By.linkText("3.141.59")).click();
		Robot rb=new Robot();
		Thread.sleep(5000);
		rb.keyPress(java.awt.event.KeyEvent.VK_TAB);
		rb.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		
	}
	@AfterClass
	public void close() {
		driver.close();
	}

}
