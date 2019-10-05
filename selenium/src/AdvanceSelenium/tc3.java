package AdvanceSelenium;


//count no of rows

//count no of columns

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc3 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.timeanddate.com/worldclock/");
	}
	@Test
	public void tables(){
		List<WebElement>webtable=driver.findElements(By.tagName("tr"));
		System.out.println("no of rows"+"   "+webtable.size());
		webtable=driver.findElements(By.tagName("td"));
		System.out.println("no of coloumns"+"   "+ webtable.size());
	}
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
	
	
	
	

}
