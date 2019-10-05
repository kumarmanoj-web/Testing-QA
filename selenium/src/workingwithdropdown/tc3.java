package workingwithdropdown;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc3 {

	public static void main(String[] args) {
		//open browser navigate to page
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MK");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.mercurytravels.co.in/");
		
		//type of holiday dropdown
		WebElement holiday=driver.findElement(By.id("themes"));
		List<WebElement>values=holiday.findElements(By.tagName("option"));
		for(int i=0;i<values.size();i++){
			String Vname=values.get(i).getText();
		
		
			values.get(i).click();
		
		
		
			if(values.get(i).isDisplayed()){
				System.out.println(Vname+ " "+"active");
				
				
		}
		
		
			else {
				
				System.out.println(Vname+" "+ "inactive");
			
				
			}
		}	
	}	
}			
				
	

//OK

