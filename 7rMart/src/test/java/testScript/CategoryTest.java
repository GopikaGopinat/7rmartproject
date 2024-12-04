package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CategoryPage;
import pages.LoginPage;

public class CategoryTest extends Base {
	@Test(description="Verify that the user is able to delete a category from the list")
	public void deleteCategory()
	{
		String username="admin";
		String password="admin";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.signIn();
		CategoryPage categorypage=new CategoryPage(driver);
		categorypage.clickCategory();
		categorypage.deleteCategory();
		boolean alertmsg=categorypage.isAlertDisplayed();
		Assert.assertTrue(alertmsg,"Alert message is not displayed when the user click ok button");
		
		
	}
	
}
