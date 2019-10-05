package workingwithlinks;

import java.util.List;

import org.openqa.jetty.html.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc9 {

	public static void main(String[] args) {
		//open browser navigate to page
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MK");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.flipkart.com");
		List<WebElement>links=driver.findElements(By.tagName("a"))	;
		
		int count=0;
		for(int i=0;i<links.size();i++){
			
			if(links.get(i).isDisplayed()){
				count++;
				
			}
		}
		System.out.println("no of links are"+"   "+links.size());
		System.out.println("no of visible links are"+"  "+count);
		System.out.println("no of hiddens are "+"   "+(links.size()-count));
		
		
	}

}
//OK