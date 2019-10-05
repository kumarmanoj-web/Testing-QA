package workingwithradiobuttons;

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
				driver.get("http://skyscanner.co.in/");
				//no of radiobuttons
				List<WebElement>radiobuttons=driver.findElements(By.xpath("//Input[@type='radio']"));
				System.out.println("no of radiobuttons"+" "+ radiobuttons.size());
				//getnames
				for(int i=0;i<radiobuttons.size();i++){
					String rname=radiobuttons.get(i).getAttribute("value");
				
		if(radiobuttons.get(i).isSelected()){
        System.out.println(rname+ " "+"active");
				}
				
	
		else
			
		System.out.println(rname+" "+"inactive");
        
			
        }
	}}
        
//ok

