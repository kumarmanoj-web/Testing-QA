package workingwithcheckbox;

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
		driver.get("http:spicejet.com");
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("no of checkbox are "+" "+ checkboxes.size());
		
		//getname
		
		for(int i=0;i<checkboxes.size();i++){
			System.out.println(checkboxes.get(i).getAttribute("name"));
			
			
			
			
		
			
		}

	
	}
}
//not ok