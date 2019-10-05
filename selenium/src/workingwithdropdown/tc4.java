package workingwithdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc4 {

	public static void main(String[] args) {
		//open browser navigate to page
				ProfilesIni pr=new ProfilesIni();
				FirefoxProfile fp=pr.getProfile("MK");
				FirefoxDriver driver=new FirefoxDriver(fp);
				driver.get("https://www.mercurytravels.co.in/");
				WebElement holiday=driver.findElement(By.id("themes"));
				List<WebElement>dropdown=holiday.findElements(By.tagName("option"));
				System.out.println("no of dropdown"+" "+dropdown.size());
				for(int i=0;i<dropdown.size();i++){
					System.out.println(dropdown.get(i).getText());
				}

	}

}
//OK