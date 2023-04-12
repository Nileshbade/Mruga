package Test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page.ForgatePasswordPage;
import Page.LoginPage;

public class VerifyLoginPage 
{
	WebDriver driver;
	LoginPage loginPage;
	ForgatePasswordPage forgatePasswordPage;
	
	@Parameters ("browser")
	@BeforeTest
	public void beforeTest(String browserName)
	{
		System.out.println("Before Test");
		
		if(browserName.equals("chrome"))
		{
		   System .setProperty("webdriver.chrome.driver","C:\\Users\\Nilesh\\AppData\\Local\\Temp\\Temp1_chromedriver_win32.zip\\chromedriver.exe");
		   ChromeOptions ops = new ChromeOptions();
		   ops.addArguments("--remote-allow-origins=*");
	       driver = new ChromeDriver(ops);
	    }
	    if(browserName.equals("Firefox"))
	    {
	    	System .setProperty("webdriver.gecko.driver","C:\\Users\\Nilesh\\AppData\\Local\\Temp\\Temp1_geckodriver-v0.32.2-win32.zip\\geckodriver.exe");
	        driver = new FirefoxDriver();
	    }
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class");
		//System .setProperty("webdriver.chrome.driver","C:\\Users\\Nilesh\\AppData\\Local\\Temp\\Temp1_chromedriver_win32.zip\\chromedriver.exe");
		//ChromeOptions ops = new ChromeOptions();
		//ops.addArguments("--remote-allow-origins=*");
	   // driver = new ChromeDriver(ops);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 loginPage = new LoginPage(driver);
		 forgatePasswordPage = new ForgatePasswordPage(driver);
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method");
		driver.get("https://www.facebook.com/");
	   
		loginPage.clickOnForgetPassword();
	    
		
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Test1");
	   //forgatePasswordPage = new ForgatePasswordPage(driver);
		String actualMsg = forgatePasswordPage.getTextMassage();
		String expectedMsg = "Please enter your email address or mobile number to search for your account.";
		if(actualMsg.equals(expectedMsg))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	    //forgatePasswordPage = new ForgatePasswordPage(driver);
		forgatePasswordPage.ClickOnCancleButton();
		String expectedURL = "https://www.facebook.com/login.php";
		String expectedTitle = "Log in to Facebook";
		String actualURL =driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		if(expectedURL.equals(actualURL) && expectedTitle.equals(actualTitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
		loginPage = null;
		forgatePasswordPage = null;
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		driver.quit();
		driver = null;
		System.gc();  //Garbage collector
	}


}
