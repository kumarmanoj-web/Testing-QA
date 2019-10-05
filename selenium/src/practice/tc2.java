package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc2 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MK");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		String expected="Gmail";
		String actual=driver.getTitle();
		System.out.println("actual");
		if(actual.contains(expected)){
			System.out.println("pass");
			
		}
 else {
	System.out.println("fail");
}
	}

}
