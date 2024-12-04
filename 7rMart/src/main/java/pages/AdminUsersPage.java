package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utilities.PageUtilities;

public class AdminUsersPage {
	WebDriver driver;
	public AdminUsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']")private WebElement manage;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement new1;
	@FindBy(xpath="//input[@id='username']")private WebElement name;
	@FindBy(css="input#password")private WebElement pass;
	@FindBy(xpath="//select[@id='user_type']")private WebElement user;
	@FindBy(xpath="//button[@name='Create']")private WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;
	public void clickAdminUsers ()
	{
		PageUtilities pageutilities=new PageUtilities();
		pageutilities.javaSriptClick(driver, manage);
	}
	public void newButton()
	{
		new1.click();
	}
	public void enterUsername(String username)
	{
		name.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		pass.sendKeys(password);
	}
	public void enterUserType()
	{
		Select select=new Select(user);
		select.selectByVisibleText("Staff");
		
	}
	public void saveButton()
	{
		PageUtilities pageutilities=new PageUtilities();
		pageutilities.javaSriptClick(driver, save);
	}
	public boolean isAlertDisplayed()
	{
	  return alert.isDisplayed();
	
	}
}
