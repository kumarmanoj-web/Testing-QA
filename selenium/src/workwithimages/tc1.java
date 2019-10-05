package workwithimages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc1 {

	public static void main(String[] args) {
		//open browser navigate to page
				ProfilesIni pr=new ProfilesIni();
				FirefoxProfile fp=pr.getProfile("MK");
				FirefoxDriver driver=new FirefoxDriver(fp);
				driver.get("http://www.flipkart.com/");
				List<WebElement>images=driver.findElements(By.tagName("img"));
				System.out.println("no of images are"+" "+ images.size());

	}

}
