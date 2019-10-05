package AdvanceSelenium;

//open browser navigate to world clock.
//getdata from all rows and all coloumns of dynamic webtable.




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc9 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.timeanddate.com/worldclock/");
	}
		@Test
		public void table() {
			WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
			List<WebElement>nrows=driver.findElements(By.tagName("tr"));
			for(int i=0;i<nrows.size();i++) {
				List<WebElement>ncoloumns=nrows.get(i).findElements(By.tagName("td"));
				for(int n=0;n<ncoloumns.size();n++) {
					System.out.print(ncoloumns.get(n).getText()+"       ");
					System.out.println();
					
				}
			}
			
			
			
		}
		@AfterTest
		public void close() {
			driver.close();
		}
	

}
