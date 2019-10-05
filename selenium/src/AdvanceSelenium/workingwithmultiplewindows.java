package AdvanceSelenium;
//OPEN THE BROWSER NAVIGATE TO CITIBANK.COM.
//CLICK ON APPLY FOR CREDIT CARDS,
//IN NEXTPAGE CLICK ON BEGIN YOUR APPLICATION.
//LIST NO. OF LINKS.



import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingwithmultiplewindows {

	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		pr=new  ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.online.citibank.co.in/");
	}
	
	@Test
	public void data() {
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		
		String parent=driver.getWindowHandle();
		Set<String>child=driver.getWindowHandles();
		Iterator<String>it=child.iterator();
		while(it.hasNext()) {
		String pop=it.next().toString();
		if(!pop.contains(parent)) {
			driver.switchTo().window(pop);
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.xpath("//*[@id=\"tabs-wrapper\"]/div[2]/div[2]/a")).click();
			Sleeper.sleepTightInSeconds(3);
			List<WebElement>links=driver.findElements(By.tagName("a"));
			
			System.out.println("no of links are"+"   "+links.size());
			
			
		}
		}
		}
		
	
@AfterTest
public void close() {
	driver.close();
}


}

