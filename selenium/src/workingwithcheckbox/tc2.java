package workingwithcheckbox;

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
				driver.get("http:spicejet.com");
				
			List<WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println("no of checkbox are"+" "+checkbox.size());
			for(int i=0;i<checkbox.size();i++){
				String cname=checkbox.get(i).getAttribute("name");
				if(checkbox.get(i).isSelected()){
					System.out.println(cname+" "+"active");
					
				}
				else {
					System.out.println(cname+" "+"inactive");
				}
			}

	}

}
//ok