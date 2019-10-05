package workingwithdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc2 {

	public static void main(String[] args) {
		//open browser navigate to page
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MK");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.mercurytravels.co.in/");
		//count no of dropdown
		List<WebElement>dropdown=driver.findElements(By.tagName("select"));
		System.out.println("no of dropdown are "+" "+dropdown.size());
		//getname of dropdown
		for(int i=0;i<dropdown.size();i++){
			System.out.println(dropdown.get(i).getAttribute("name"));
		}

	}

}
//OK