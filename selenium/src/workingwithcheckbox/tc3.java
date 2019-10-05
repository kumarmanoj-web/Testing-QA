package workingwithcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc3 {

	public static void main(String[] args) {
		//open browser naviget to spicejet.com
		
		ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("manoj");
	FirefoxDriver driver=new FirefoxDriver(fp);
	driver.get("http://spicejet.com/");
	
	//click on student
	
	WebElement student=driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
	student.click();
	
	//whether it is active or not
	
	if(student.isSelected()){
		System.out.println("working succesfully");
		
	}
	else {
		System.out.println("fail");
	}

	}

}
//ok