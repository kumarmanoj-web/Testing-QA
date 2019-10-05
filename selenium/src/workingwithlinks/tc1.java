package workingwithlinks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc1 {

	public static void main(String[] args) {
		//open browser navigate to page
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MK");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://www.google.com/");
		
		//click on gmail
		driver.findElement(By.linkText("Gmail")).click();
		//verify title
		String expected="Gmail";
		String actual=driver.getTitle();
		System.out.println("Actual");
		if(actual.contains(expected)){
			System.out.println("PASS");
		
		}
		else
		{
System.out.println("FAIL");
		}
}
}
//OK