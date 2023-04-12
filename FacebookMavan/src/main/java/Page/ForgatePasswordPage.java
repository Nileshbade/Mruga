package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgatePasswordPage
{
	//variable Declaration
	@FindBy (xpath = "//table//div")
	private WebElement textMassage;

	@FindBy (xpath = "(//input[@name='email'])[2]")
	private WebElement emailOrPhoneno;
	
	@FindBy (xpath = "//a[text()='Cancel']")
	private WebElement cancleButton;
	
	@FindBy (xpath = "//button[text()='Search']")
	private WebElement SearchButton;
	

	//Variable Initialization
	public ForgatePasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//variable use
	public String getTextMassage()
	{
		String text = textMassage.getText();
		//get drop down option
	  return text;
	}
	public void sendEmailOrPhoneno()
	{
		emailOrPhoneno.sendKeys("nileshbade19@gmail.com");
	}
	public void ClickOnCancleButton()
	{
		cancleButton.click();
		//click mouse Action
	}
	public void ClickOnSearchButton()
	{
		SearchButton.click();
	}
}
