package testScript;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageInfoPage;
public class ManageInfoTest extends Base {

	@Test(description="Verify that the user is able to add new News")
	public void addNewNews()
	{
		String username="admin";
		String password="admin";
		String news="haiiii";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.signIn();
		ManageInfoPage manageinfopage=new ManageInfoPage(driver);
		manageinfopage.manageClick();
		manageinfopage.newButton();
		manageinfopage.enterNews(news);
		manageinfopage.saveButton();
		boolean alertmsg=manageinfopage.isAlertDisplayed();
		Assert.assertTrue(alertmsg,"Alert message is not displayed when user click on save  button");	
	}
}
