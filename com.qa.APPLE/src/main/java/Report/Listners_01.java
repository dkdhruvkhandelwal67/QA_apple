package Report;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.TESTBASE_;


public class Listners_01 implements ITestListener{

	WebDriver driver=null;
	String filePath = "C:\\Users\\dhruv.khandelwal\\Downloads\\com.qa.APPLE\\com.qa.APPLE\\TEST_RESULTS\\Screenshots";
    @Override
    public void onTestFailure(ITestResult result) {
    	System.out.println("***** Error "+result.getName()+" test has failed *****");
    	String methodName=result.getName().toString().trim();
    	takeScreenShot(methodName);
    }
    
    public void takeScreenShot(String methodName) {
    	//get the driver
    	driver=TESTBASE_.driver;
    	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         //The below method will save the screen shot in d drive with test method name 
            try {
				FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
				System.out.println("***Placed screen shot in "+filePath+" ***");
			} catch (IOException e) {
				e.printStackTrace();
			}
    }
	
 
	public void onFinish(ITestContext arg0) {	

	}

	public void onStart(ITestContext arg0) {
			
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	public void onTestSkipped(ITestResult arg0) {
	
	}

	public void onTestStart(ITestResult arg0) {
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
	}

}
