import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc5 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MK");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.bing.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		 int count=0;
		 for(int i=0;i<links.size();i++){
			 if(links.get(i).isDisplayed()){
			 count++;
		 }
		 }
	System.out.println("no of links are "+" "+ links.size());
	System.out.println("no of visible "+" "+count);
	System.out.println("no of hidden "+" "+(links.size()-count));
			}
		}

	


