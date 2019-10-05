package AdvanceSelenium;

//open browser navigate to mirror.co.uk.
//count no.cookies.



import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import okhttp3.Cookie;

public class tc1workingwithcookies {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	@BeforeTest
	public void open() {
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://www.mirror.co.uk/");
	}
	@Test
	public void operation() {
	Set<org.openqa.selenium.Cookie>cook=driver.manage().getCookies();
	System.out.println("no of cookies are"+"   "+ cook.size());
	}

}
