package workingwithfileproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc1 {

	public class tc2 {
		ProfilesIni pr;
		FirefoxProfile fp;
		JavascriptExecutor js;
		FirefoxDriver driver;
		FileInputStream fo;
		Properties pr1;
		@BeforeTest
		public void open() {
			pr=new ProfilesIni();
			fp=pr.getProfile("MK");
			driver=new FirefoxDriver(fp);
			driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	
	@Test
	public void data() throws IOException {
		
		fo=new FileInputStream("C:\\Users\\Dell\\Desktop\\MK\\selenium\\orangehrm.properties");
		pr1=new Properties();
		pr1.load(fo);
		
		driver.findElement(By.id(pr1.getProperty("user"))).clear();
		driver.findElement(By.id(pr1.getProperty("user"))).sendKeys("Admin");
		driver.findElement(By.id(pr1.getProperty("pass"))).clear();
		driver.findElement(By.id(pr1.getProperty("pass"))).sendKeys("admin123");
		driver.findElement(By.id(pr1.getProperty("log"))).click();
		
		
		
		
	}
	
	
	
	
	
	}
}
