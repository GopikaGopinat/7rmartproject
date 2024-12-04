package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;

public class AdminUsersTest extends Base {
	@Test(description="Verify that the user is able to add new user")
	public void Addusers()
	{
		String username="admin";
		String password="admin";
		String adminusername="gopikag";
		String adminpass="g@123";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.signIn();
		AdminUsersPage adminuserspage=new AdminUsersPage(driver);
		adminuserspage.clickAdminUsers();
		adminuserspage.newButton();
		adminuserspage.enterUsername(adminusername);
		adminuserspage.enterPassword(adminpass);
		adminuserspage.enterUserType();
		adminuserspage.saveButton();
		boolean alertmsg=adminuserspage.isAlertDisplayed();
		Assert.assertTrue(alertmsg,"Alert message is not displayed when save button is clicked");
		
	}

}
