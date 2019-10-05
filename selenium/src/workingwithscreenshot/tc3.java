package workingwithscreenshot;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class tc3 {

	public static void main(String[] args) throws IOException {
		//open broswer navigate to googlepage
				ProfilesIni pr=new ProfilesIni();
				FirefoxProfile fp=pr.getProfile("MK");
				FirefoxDriver driver=new FirefoxDriver(fp);
				driver.get("http://google.com/");
				
			
				File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			
	FileUtils.copyFile(srcfile, new File("C:\\Users\\Dell\\Desktop\\Manoj k b\\google.png"));
	
	driver.findElement(By.linkText("Gmail")).click();
	
		

	File img=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			
FileUtils.copyFile(img, new File("C:\\Users\\Dell\\Desktop\\Manoj k b\\gmail.png"));
Sleeper.sleepTightInSeconds(5);
driver.navigate().back();
driver.findElement(By.linkText("Images")).click();

File asa=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			
FileUtils.copyFile(asa, new File("C:\\Users\\Dell\\Desktop\\Manoj k b\\images.png"));
Sleeper.sleepTightInSeconds(5);
driver.navigate().back();
Sleeper.sleepTightInSeconds(5);
driver.close();




	}

}
