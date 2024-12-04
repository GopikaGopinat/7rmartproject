package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ManageInfoPage {
	WebDriver driver;
	public ManageInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver , this);
			
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news']")private WebElement manage;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']")private WebElement new1;
	@FindBy(xpath="//textarea[@id='news']")private WebElement text;
	@FindBy(css="button[class='btn btn-danger']")private WebElement save;
	@FindBy(css="div[class='alert alert-success alert-dismissible']")private WebElement alert;
public void manageClick()
{
	manage.click();
}
public void newButton()
{
	new1.click();
}
public void enterNews(String news)
{
	text.sendKeys(news);
}
public void saveButton()
{
	save.click();
}
public boolean isAlertDisplayed()
{
	return alert.isDisplayed();
}
}











