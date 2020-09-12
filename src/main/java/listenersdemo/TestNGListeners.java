package listenersdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("test case started and details are "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test case sucessed and details are "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("test case filed and details are "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("test case skipped and details are "+result.getName());
	}

//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//	}
//
//	@Override
//	public void onFinish(ITestContext context) {
//	}

}
