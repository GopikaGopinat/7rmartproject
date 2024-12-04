package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterPage {
	WebDriver driver;
	public ManageFooterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext']")private WebElement footer;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")private WebElement edit;
	@FindBy(xpath="//textarea[@id='content']")private WebElement address;
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='phone']")private WebElement phone;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")private WebElement button;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;
	public void footerText()
	{
		footer.click();
	}
	public void editButton()
	{
		edit.click();
	}
	public void enterAddress(String footeraddress)
	{
		address.sendKeys(footeraddress);
	}
	public void enterEmail(String footeremail)
	{
		email.sendKeys(footeremail);
	}
	public void enterPhone(String footerphone)
	{
		phone.sendKeys(footerphone);
	}
	public void updateButton()
	{
		button.click();
	}
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
	}

}
