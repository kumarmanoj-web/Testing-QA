package ashis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc3 {

	ChromeDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
//		driver.get("https://www.mercurytravels.co.in/");
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void data()
	{
		driver.findElement(By.linkText("Visa Information")).click();
//		WebElement case1=driver.findElement(By.xpath("//select[@id='themes']"));
//		System.out.println(case1.getText());
//		Select st=new Select(case1);
//		st.selectByVisibleText("Beach");
//		
	}
	@AfterClass
	public void close()
	{
		Sleeper.sleepTightInSeconds(5);
		driver.close();
	}
	
	
	
	
	
	
}
