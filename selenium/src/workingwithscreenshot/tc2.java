package workingwithscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc2 {

	public static void main(String[] args) throws IOException {
		//open broswer navigate to googlepage
				ProfilesIni pr=new ProfilesIni();
				FirefoxProfile fp=pr.getProfile("MK");
				FirefoxDriver driver=new FirefoxDriver(fp);
				driver.get("http://google.com/");
				String title1=driver.getTitle();
				File scrfile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrfile1,new File("C:\\Users\\Dell\\Desktop\\Manoj k b\\ title1.png"));
				String title2=driver.getTitle();
				File scrfile2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrfile2, new File("C:\\Users\\Dell\\Desktop\\Manoj k b\\title2.png"));
				
				
				
				
				
				
				
				

	}

}
