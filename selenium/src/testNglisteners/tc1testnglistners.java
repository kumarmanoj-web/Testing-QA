package testNglisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class tc1testnglistners implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Tc onFinish "+" " + result.getName());
		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("Tc onStart"+"   "+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Tc onTestFailedButWithinSuccessPercentage are"+"   "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Tc onTestFailure are "+"    "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Tc onTestSkipped  "+"   "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Tc onTestStart are "+"  "+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Tc  onTestSuccess are "+"  "+result.getName());
		
	}
	
	
	

}
