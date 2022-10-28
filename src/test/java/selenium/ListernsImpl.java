package selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernsImpl implements ITestListener{

	public void onTestFailedWithTimeout(ITestResult result) {
	System.out.println("*****test has been started******"+result.getName());
		
	
			
	}

	public void onStart(ITestContext context) {
		
		
	System.out.println("****test has been failed*****"+context.getName());
		
		
		
		
	}
	
	
	


	
	
	
	
	
	
	
	
	

}
