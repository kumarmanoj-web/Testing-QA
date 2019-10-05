package AdvanceSelenium;

//open browser navigate to orangeHRM page
//verify login
//login status
//logout
//close

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc1 {
	
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://opensource-demo.orangehrmlive.com/");
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
	
}
@Test
public void logout(){
	driver.findElement(By.linkText("Welcome Admin")).click();
	driver.findElement(By.linkText("Logout")).click();
}
@AfterTest
public void close(){
	driver.close();
}
}









