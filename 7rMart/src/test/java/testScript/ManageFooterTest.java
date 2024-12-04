package testScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterPage;

public class ManageFooterTest extends Base{
	@Test(description="Verify that the user is able to update footertext")
	public void editfooterText()
	{
		String username="admin";
		String password="admin";
		String footeraddress="kollam,kerala";
		String footeremail="gopu@123.com";
		String footerphone="9074832523";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.signIn();
		ManageFooterPage managefooterpage=new ManageFooterPage(driver);
		managefooterpage.footerText();
		managefooterpage.editButton();
		managefooterpage.enterAddress(footeraddress);
		managefooterpage.enterEmail(footeremail);
		managefooterpage.enterPhone(footerphone);
		managefooterpage.updateButton();
		boolean alertmsg=managefooterpage.isAlertDisplayed();
		Assert.assertTrue(alertmsg,"Alert message is not displayed when the update button is clicked");
		
	}
	
}
