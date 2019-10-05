package workingwithtextelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc2 {

	public static void main(String[] args) {
		//openbrowser navigate to newtours.demoout.com
				ProfilesIni pr=new ProfilesIni();
				FirefoxProfile fp=pr.getProfile("MK");
				FirefoxDriver driver=new FirefoxDriver(fp);
				driver.get("http://www.newtours.demoaut.com/");
				List<WebElement>text=driver.findElements(By.tagName("p"));
				for(int i=0;i<text.size();i++){
					System.out.println(text.get(i).getText());
				}
		

	}

}
