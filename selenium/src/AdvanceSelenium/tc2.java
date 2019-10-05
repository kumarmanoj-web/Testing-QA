package AdvanceSelenium;

//open browser navigate to world clock page
//count no of tables 


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class tc2 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		pr=new  ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.timeanddate.com/worldclock/");
	}
	
	@Test
	public void table(){
		List<WebElement>wtable=driver.findElements(By.tagName("table"));
		System.out.println("no of webtable"+"  "+ wtable.size());
	}
	
	@AfterTest
	public void close(){
		driver.close();
	}

}
