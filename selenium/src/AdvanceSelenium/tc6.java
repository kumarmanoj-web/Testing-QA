package AdvanceSelenium;

//open browser navigate to worldclock page in first colomns all rows verify Bangkok name
 // present or not.if it is present then tc pass else tc fail.




import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc6 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver(fp);
			driver.get("https://www.timeanddate.com/worldclock/");
		}
	
	
	@Test
	public void tables(){
		String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2="]/td[1]";
		for(int i=1;i<37;i++){
			String actual=driver.findElement(By.xpath(part1+i+part2)).getText();
			System.out.println(actual);
			String expected="Bangkok";
			if(expected.equals(actual)){
				System.out.println("Bangkok present");
			}
		}
	}
	@AfterTest
	public void close(){
		driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

		
	}


