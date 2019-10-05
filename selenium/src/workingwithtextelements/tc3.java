package workingwithtextelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc3 {

	public static void main(String[] args) {
		//openbrowser navigate to newtours.demoout.com
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MK");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.newtours.demoaut.com/");
	WebElement text=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[1]/td/font/b"));
	String tname=text.getTagName();
	if((tname.equals("b"))){
			System.out.println("text bold");
			
		}
		else{
			System.out.println("text not bold");
		}
		

	}

}
//ok