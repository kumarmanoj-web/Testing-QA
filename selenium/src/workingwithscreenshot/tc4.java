package workingwithscreenshot;




import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tc4 {

	public static void main(String[] args) throws IOException {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MK");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("https://mbaskool.com/");
		
		
		List<WebElement>links=driver.findElements(By.linkText("BKFS"));
	
	//if(links.size()==0){
	
	
	
	
	
	
		File srcimgfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcimgfile, new File("C:\\Users\\Dell\\Desktop\\Manoj k b\\ASISH.png"));
	
		//links.get(0).click();
	}
	
	}
	


