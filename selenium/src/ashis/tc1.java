package ashis;

//OPEN BROWSER NAVIGATE TO FLIPKART.COM.
//MOUSE MOVE TO MAN, SELECT FORMAL SHOES.
//PERFORM DRAG OPERATION ON SLIDER ELEMENT.




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tc1 {
	ChromeDriver driver;
	Actions action;
	@BeforeMethod
	public void open() {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	@Test
	public void test() {
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("ashis.ashis3@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("ashis@12345");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span")).click();
		Sleeper.sleepTightInSeconds(5);
		WebElement move=driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/ul/li[3]/span")); 
		 action=new Actions(driver);
		action.moveToElement(move).build().perform();
		
		driver.findElement(By.linkText("Formal Shoes")).click();
		
		Sleeper.sleepTightInSeconds(3);
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/section[2]/div[3]/div[1]"));
		 action=new Actions(driver);
		int loc=drag.getLocation().x;
	
		action.dragAndDropBy(drag, 20, loc).build().perform();
		Sleeper.sleepTightInSeconds(10);
		
	}

	@AfterTest
	public void close()
	{
		driver.close();
	}
	
}
