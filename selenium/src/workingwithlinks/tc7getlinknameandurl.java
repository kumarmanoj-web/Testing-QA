package workingwithlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class tc7getlinknameandurl {

	public static void main(String[] args) {
		//open browser navigate to page
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MK");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://bing.com/");
		
		//count no of links
		
    List<WebElement>links=driver.findElements(By.tagName("a"));
    System.out.println("no of links are"+ " "+links.size());
    
    //get linkname
    
    for(int i=0;i<links.size();i++){
    	if(links.get(i).isDisplayed()){
    		String lname=links.get(i).getText();
    		links.get(i).click();
    		Sleeper.sleepTightInSeconds(3);
    		//url
    		String lurl=driver.getCurrentUrl();
    		System.out.println(lname +" "+lurl);
    		driver.navigate().back();
    		links=driver.findElements(By.tagName("a"));
    		
    	}
    }

	}

}
//OK