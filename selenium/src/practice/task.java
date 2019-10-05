package practice;

//OPEN BROWSER NAVIGATE TO WORLD WORST WEBSITE.
//CLICK ON INTERNATIONAL I HATE FRAMES.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class task {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
		
	}
	@Test
	public void data() {
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/p[7]/b/a/font")).click();
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no of links are"+"    "+links.size());
		for(int i=0;i<links.size();i++) {
			System.out.println(links.get(i).getText());
		}
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	

}
