package AdvanceSelenium;

//OPEN BROWSER NAVIGATE TO POP-UP TEST.COM
//CLICK ON MULTI POP-UP TEST LINK
//CLOSE ALL POP-UP ACCEPT THE PARRENT.




import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class workingWithPopups {
	
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		pr=new  ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("http://popuptest.com/");
	}
	
	@Test
	public void data() {
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.linkText("Multi-PopUp Test")).click();
		
		String parent=driver.getWindowHandle();
		Set<String>child=driver.getWindowHandles();
		Iterator<String>it=child.iterator();
		while(it.hasNext()) {
		String pop=it.next().toString();
		if(!pop.contains(parent)) {
			driver.switchTo().window(pop);
			Sleeper.sleepTightInSeconds(3);
			driver.close();
		}
		}
	
}
	
@AfterTest
public void close() {
	driver.close();
}


}
