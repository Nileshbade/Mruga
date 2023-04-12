package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Model.SignUpPopUp;
import Page.ForgatePasswordPage;
import Page.LoginPage;

public class Test 
{
	public static void main(String[] args) throws InterruptedException
	{
		System .setProperty("webdriver.chrome.driver","C:\\Users\\Nilesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions ops =new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.sendUserName();
		loginPage.sendPassword();
		loginPage.ClickOnLoginButton();
		loginPage.ClickOnAccount();
		Thread.sleep(2000);
		loginPage.ClickOnLogout();
		
		
		ForgatePasswordPage forgatePasswordPage = new ForgatePasswordPage(driver);
		forgatePasswordPage.getTextMassage();
		forgatePasswordPage.sendEmailOrPhoneno();
		forgatePasswordPage.ClickOnCancleButton();
		forgatePasswordPage.ClickOnSearchButton();
		
		SignUpPopUp signUpPopUp = new SignUpPopUp(driver);
		signUpPopUp.sendFirstName();
		signUpPopUp.sendLastName();
		signUpPopUp.sendMobilenoOrEmailAddrName();
		signUpPopUp.sendNewPassword();
		signUpPopUp.sendDay();
		signUpPopUp.sendMonth();
		signUpPopUp.sendYear();
		signUpPopUp.clickType();
		signUpPopUp.clickSignIn();
	}

}
