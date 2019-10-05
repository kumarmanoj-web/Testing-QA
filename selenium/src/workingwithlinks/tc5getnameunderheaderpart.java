package workingwithlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc5getnameunderheaderpart {

	public static void main(String[] args) {
		//open browser navigate to bing page
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MK");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.bing.com/");
		//count no of links in headerpart
		WebElement	header=driver.findElement(By.id("sc_hdu"));
		List<WebElement>links=header.findElements(By.tagName("a"));
		System.out.println("no of links are"+" "+links.size()) ;
		

for(int i=0;i<links.size();i++){
	System.out.println(links.get(i).getText());
}
	}

}
//OK
