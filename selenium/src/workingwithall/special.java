package workingwithall;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class special {

	public static void main(String[] args) {
		//open browser navigate to page
				ProfilesIni pr=new ProfilesIni();
				FirefoxProfile fp=pr.getProfile("MK");
				FirefoxDriver driver=new FirefoxDriver(fp);
				driver.get("https://www.mercurytravels.co.in/");
				//count no of links,images,radios,checkbox, and dropdown
				List<WebElement>elements=driver.findElements(By.tagName("a"));
				System.out.println("no of links are"+" "+ elements.size());
				
				elements=driver.findElements(By.tagName("img"));
				System.out.println("no of images are"+" "+ elements.size());
				
				elements=driver.findElements(By.xpath("//input[@type='radios']"));
				System.out.println("no of radios are"+" "+ elements.size());
				
				elements=driver.findElements(By.xpath("//input[@type='checkbox']"));
				System.out.println("no of checkbox are"+" "+ elements.size());
				
				elements=driver.findElements(By.tagName("select"));
				System.out.println("no of dropdowns are"+" "+ elements.size());
	}

}
// succesful