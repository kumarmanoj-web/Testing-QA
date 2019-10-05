package AdvanceSelenium;

//getdata from all colomns firstrows;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc7 {
	ProfilesIni pr;
	FirefoxProfile fp;
	FirefoxDriver driver;
	
	@BeforeTest
	public void open(){
		pr=new ProfilesIni();
		fp=pr.getProfile("MK");
		driver=new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
	}
   @Test
   public void tables(){
	   String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[";
	   String part2="]";
	   for(int i=1;i<=8;i++){
		   String data=driver.findElement(By.xpath(part1+i+part2)).getText();
		   System.out.println(data);
	   }
   }
}
