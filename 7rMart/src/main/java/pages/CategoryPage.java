package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class CategoryPage {
	WebDriver driver;
	public CategoryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")private WebElement manageinfo;
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/category/delete?del=199&page_ad=1']")private WebElement delete;
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement alert;
public void clickCategory()
{
	manageinfo.click();
}
public void deleteCategory()
{
	delete.click();
	driver.switchTo().alert().accept();
}
public boolean isAlertDisplayed()
{
	return alert.isDisplayed();
}
}
