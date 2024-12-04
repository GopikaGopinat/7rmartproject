package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
			
	}
	@FindBy(css="input[name='username']")private WebElement user;
	@FindBy(css="input[name='password']")private WebElement pass;
	@FindBy(xpath="//button[text()='Sign In']")private WebElement button;
	@FindBy(xpath="//p[text()='Dashboard']")private WebElement dash;
	@FindBy(css="div[class='alert alert-danger alert-dismissible']")private WebElement alert;
	

public void enterUsername(String username)
{
	user.sendKeys(username);
}

public void enterPassword(String password)
{
	pass.sendKeys(password);
}
public void signIn()
{
	button.click();
}
public boolean  isHomePageLoaded()
{
	return dash.isDisplayed();
}
public boolean isHomePageNotLoaded()
{
	return alert.isDisplayed();
}
}

