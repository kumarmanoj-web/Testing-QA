package ashis;

import org.bridj.cpp.std.list;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc5 {
	ChromeDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void check() throws InterruptedException {
		//WebElement room=driver.findElement(By.xpath("/html/body/div[3]/div[1]/section/div[1]/div[2]/button[1]"));
		//room.click();
		Thread.sleep(5000);
		String k;
		k=driver.findElement(By.xpath("/html/body/div[3]/div[1]/section/div[1]/div[2]/div[4]/div/div/ul/li[4]/button/div")).getText();
		System.out.println(k);
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/section/div[1]/div[2]/div[4]/div/div/ul")).getText();
	}

}
