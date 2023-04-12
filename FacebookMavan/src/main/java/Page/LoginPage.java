package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{    
	//Variable Declaration
	@FindBy(xpath="//input[@name='email']")
	private WebElement userName;
    

	@FindBy(xpath="//input[@name='pass']")
	private WebElement passWord;
    

	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginButton;
    
	@FindBy(xpath="(//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'])[1]")
	private WebElement account;
    
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logout;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement forgatePassword;


	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement creatneACC;
     
	WebDriver driver;
	//Variable Initialization
	public LoginPage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	  this.driver = driver;
	}
	
	//Variable Use
	public void sendUserName()
	{
		userName.sendKeys("9657620670");
	}
	public void sendPassword()
	{
		passWord.sendKeys("nilesh19");
	}
	public void ClickOnLoginButton()
	{
		loginButton.click();
	}
	public void ClickOnAccount()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(account).click().build().perform();
	}
	public void ClickOnLogout()
	{ 
		Actions actions = new Actions(driver);
		actions.moveToElement(logout).click().build().perform();
		//logout.click();
	}
	public void clickOnForgetPassword()
	{
		forgatePassword.click();
	}
	public void ClickONCreatneAcc()
	{
		creatneACC.click();
	}
	//public void loginToAppication
	//{
		//userName.sendKeys("9657620670");
		//passWord.sendKeys("nilesh");
		//loginButton.click();
	//}
}
