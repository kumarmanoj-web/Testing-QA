package workingwithdropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class tc1 {

	public static void main(String[] args) {
		//open browser navigate to page
				ProfilesIni pr=new ProfilesIni();
				FirefoxProfile fp=pr.getProfile("MK");
				FirefoxDriver driver=new FirefoxDriver(fp);
				driver.get("https://www.mercurytravels.co.in/");
				driver.findElement(By.id("themes")).sendKeys("family");
	WebElement	dropdown=driver.findElement(By.id("themes"));
  Select st=new Select(dropdown);
  st.selectByIndex(5);
  Sleeper.sleepTightInSeconds(3);
  st.selectByVisibleText("Nature");
  
				
				

	}

}
//OK
