package Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPopUp 
{
	//Variable Declaration
    @FindBy(xpath="//input[@name='firstname']")
     private WebElement firstName;

    @FindBy(xpath="//input[@name='lastname']")
    private WebElement lastName;
    
    @FindBy(xpath="(//input[@type='text'])[4]")
    private WebElement mobilenoOrEmailAddr;
    
    @FindBy(xpath="(//input[@type='password'])[2]")
    private WebElement newPassword;
    
    @FindBy(xpath="//select[@aria-label='Day']")
    private WebElement day;
    
    @FindBy(xpath="//select[@aria-label='Month']")
    private WebElement month;
    
    @FindBy(xpath="//select[@aria-label='Year']")
    private WebElement year;

    @FindBy(xpath="(//input[@name='sex'])[2]")
    private WebElement type;
    
    @FindBy(xpath="(//button[text()='Sign Up'])[1]")
    private WebElement signin;
    
    public SignUpPopUp(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	//Variable Initialization
    public void SignUpPopUp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
    //Variable Use
    public void sendFirstName()
	{
		firstName.sendKeys("Nilesh");
	}
    public void sendLastName()
	{
		lastName.sendKeys("Bade");
	}
    public void sendMobilenoOrEmailAddrName()
	{
    	mobilenoOrEmailAddr.sendKeys("nileshbade12@gmail.com");
	}
    public void sendNewPassword()
	{
    	newPassword.sendKeys("nilesh12");
	}
    public void sendDay()
	{
		day.sendKeys("10");
	}
    public void sendMonth()
	{
		month.sendKeys("Mar");
	}
    public void sendYear()
	{
		year.sendKeys("2023");
	}
    public void clickType()
   	{
   		type.click();
   	}
    public void clickSignIn()
   	{
   		signin.click();
   	}
}
