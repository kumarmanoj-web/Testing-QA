package workingwithtextelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc1 {

	public static void main(String[] args) {
		//openbrowser navigate to newtours.demoout.com
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MK");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://www.newtours.demoaut.com/");
		//count no of normal text and bold text
		List<WebElement>text=driver.findElements(By.tagName("p"));
		System.out.println("no of normal text are"+" "+text.size());
		text=driver.findElements(By.tagName("b"));
		System.out.println("no of bold text"+ " "+ text.size());
		

	}

}
