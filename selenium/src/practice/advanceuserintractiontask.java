package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class advanceuserintractiontask {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open() {
		pr=new  ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.flipkart.com/");
	}
	@Test
	public void frame() {
		
		WebElement men=driver.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/ul/li[3]/span"));
		Actions actoin=new Actions(driver);
		actoin.moveToElement(men).build().perform();
	}
	@Test
	public void slider() {
	WebElement shoe=driver.findElement(By.linkText("Formal Shoes"));
	Sleeper.sleepTightInSeconds(5);
	Actions action1=new Actions(driver);
	action1.doubleClick(shoe).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
