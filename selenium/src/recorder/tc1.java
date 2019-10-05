package recorder;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;


public class tc1 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	ATUTestRecorder recorder;
	
	
	@BeforeTest
	public void open() throws ATUTestRecorderException{
		
	recorder=new ATUTestRecorder("C:\\Users\\Dell\\Desktop\\video","man",false);
		
	
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		recorder.start();
	}
@Test
public void login(){
	driver.findElement(By.id("txtUsername")).clear();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Sleeper.sleepTightInSeconds(3);
	
}
@Test
public void loginstatus(){
	String expected="Welcome Admin";
	String actual=driver.findElement(By.linkText("Welcome Admin")).getText();
	Assert.assertEquals(expected, actual);
	

	driver.findElement(By.linkText("Welcome Admin")).click();
	driver.findElement(By.linkText("Logout")).click();
}
@AfterTest
public void close() throws ATUTestRecorderException{
	driver.close();
	recorder.stop();

}
}