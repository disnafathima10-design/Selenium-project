package Base;


import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Page.cartpage;
import Page.checkoutpage;
import Page.homepage;
import Page.loginpage;
import Page.overviewpage;

public class baseclass {
	public static WebDriver driver;
	
	public static ExtentSparkReporter repoter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	public loginpage lt;
	public homepage home;
	public cartpage cart;
	public checkoutpage check;
	public overviewpage over;
	@BeforeTest
	public  void open() {
		repoter=new ExtentSparkReporter("./Reports/myreport1.html");
		repoter.config().setDocumentTitle("Autpmationreport");
		repoter.config().setReportName("functional test");
		repoter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("testername", "disna");
		extent.setSystemInfo("browsername", "chrome");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--incognito");
		driver=new ChromeDriver(option);
		driver.get("https://www.saucedemo.com/");
	}
@BeforeMethod
public void test(Method mthd) {
    lt=new loginpage(driver);
	home=new homepage(driver);
	cart=new cartpage(driver);
    check=new checkoutpage(driver);
    over=new overviewpage(driver);
    test=extent.createTest(mthd.getName());
}
@AfterTest
public void teardown() {
	extent.flush();
}
@AfterMethod
public void browserclose(ITestResult result) throws Exception {
	if(result.getStatus()==ITestResult.FAILURE) {
	
	test.log(Status.FAIL,"test case failed is"+result.getName());
	test.log(Status.FAIL,"test case failed is"+result.getThrowable());
	String screenshortpath=screenshortmethod(driver,result.getName());
	test.addScreenCaptureFromPath(screenshortpath);
	
	
}  else if(result.getStatus()==ITestResult.SKIP) {
	test.log(Status.SKIP,"test case skipped is"+result.getName());
	
}else if(result.getStatus()==ITestResult.SUCCESS) {
	test.log(Status.PASS,"test case success is"+result.getName());
}
}
public static String screenshortmethod(WebDriver driver,String screenshotname) throws IOException {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	String destination="./screenshot/"+screenshotname +".jpeg";
	FileHandler.copy(src,new File(destination));
	return destination;
			
	
}

}
