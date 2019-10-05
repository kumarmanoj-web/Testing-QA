package ashis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc2 {
	ChromeDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
	
	
	Sleeper.sleepTightInSeconds(1);
	}
@Test
public void radio() {
	
	
	//driver.findElement(By.linkText("View All")).click();
	
	
	List<WebElement>total=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(total.size());

	//System.out.println(total.get(1).getText());
	for(int i=0;i<total.size();i++)
{
	System.out.println(total.get(i).getAttribute("aria-label"));
		
	}
	
	
	
	
	
	
	
	
}
}
