package workingwithwindowelements;

//open browser navigate to photobox.com.
//upload image from computer BY USING AUTOIT.
//with recorder



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class tc6workingwithautoitupload {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	ATUTestRecorder record;
	@BeforeTest
	public void open() throws ATUTestRecorderException {
		record=new ATUTestRecorder("C:\\Users\\Dell\\Desktop\\video","upload1",false);
		record.start();
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
		driver.get("https://upload.photobox.com/en/#");
	}
	@Test
	public void upload() throws IOException {
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("computer_icone_name")).click();
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.id("button_desktop")).click();
		Sleeper.sleepTightInSeconds(5);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\pho.exe");
		Sleeper.sleepTightInSeconds(5);
	
	}
	@AfterTest
	public void close() throws ATUTestRecorderException {
		driver.close();
		record.stop();
	}

}
