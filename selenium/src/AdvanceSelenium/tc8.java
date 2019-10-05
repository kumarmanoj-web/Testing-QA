package AdvanceSelenium;

//get data from all rows and all colomns;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc8 {
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
    	String part2="]/td[";
    	String part3="]";
    	for(int i=1;i<37;i++)
    		for(int n=1;n<8;n++){
    	String data=driver.findElement(By.xpath(part1+i+part2+n+part3)).getText();
    	{
    	System.out.print(data+ "   ");}
    	{
    	System.out.println();}
    	
    		}
    	}
    
	
	@AfterTest
	public void close(){
		driver.close();
	}
	
	
	
	
}
