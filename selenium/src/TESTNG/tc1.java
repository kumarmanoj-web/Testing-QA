package TESTNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testNglisteners.tc1testnglistners.class)
public class tc1 {

	@BeforeTest
	public void openbroswer(){
		System.out.println("open browser navigate to page");
	}
	@Test
	public void register(){
		System.out.println("register for new account");
	}
	@Test
	public void login(){
		System.out.println("login for next operation");
	}
	@Test
	public void logout(){
		System.out.println("logout from application");
	}
	@AfterTest
	public void close(){
		System.out.println("close browser");
		
		
	}

	
	
	
}
