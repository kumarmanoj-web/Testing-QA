package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class tc1sikuli {
	
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	ATUTestRecorder record;
	
	@BeforeTest
	public void open() throws ATUTestRecorderException{
		record=new ATUTestRecorder("C:\\Users\\Dell\\Desktop\\video","sikuli",false);
		record.start();
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://filehippo.com/download_skype/");
	}
	
	
	
	
	@Test
	public void data1() throws FindFailed {
		
		
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/section/div[2]/div/div[2]/a")).click();
		Screen sc=new Screen();
		Pattern pt=new Pattern("C:\\Users\\Dell\\Desktop\\ss.PNG");
		sc.click(pt);
	}
	@AfterTest
	public void close() throws ATUTestRecorderException {
		driver.close();
		record.stop();
	}
}
