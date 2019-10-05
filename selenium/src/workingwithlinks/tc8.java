package workingwithlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc8 {

	public static void main(String[] args) {
		//open browser navigate to page
				ProfilesIni pr=new ProfilesIni();
				FirefoxProfile fp=pr.getProfile("MK");
				FirefoxDriver driver=new FirefoxDriver(fp);
				driver.get("https://www.flipkart.com");
				//count no of links
				   List<WebElement>links=driver.findElements(By.tagName("a"));
				   System.out.println("no of links are"+ " "+links.size());
				   //getnames
				   for(int i=0;i<links.size();i++){
					   System.out.println(links.get(i).getText());
					   
				   }

	}

}
//OK
