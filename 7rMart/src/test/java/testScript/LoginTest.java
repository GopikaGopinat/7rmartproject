package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base{
	@Test(description="Verify that the user is able to login into the page with valid credentials")
	public void verifyTheUserWithValidCredentials()
	{
		String username="admin";
		String password="admin";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.signIn();
		boolean dashboard= loginpage.isHomePageLoaded();
		Assert.assertTrue(dashboard,"Homepage not loaded when user enters valid credentials");
	}
	
	@Test(description="Verify that the user is able to login into the page with invalid credentials")
	public void correctUsernameAndIncorrectPasssword()
	{
		String username="admin";
		String password="Ad@123";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.signIn();
		boolean alertmsg=loginpage.isHomePageNotLoaded();
		Assert.assertTrue(alertmsg,"Homepage loaded when user enters invalid credentials");
	}
	@Test(description="Verify that the user is able to login into the page with ivalid credentials")
	public void incorrectUsernameAndCorrectPassword()
	{
		String username="Adminhello";
		String password="admin";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.signIn();
		boolean alertmsg=loginpage.isHomePageNotLoaded();
		Assert.assertTrue(alertmsg,"Homepage loaded when user enters invalid credentials");	
	}
	@Test(description="Verify that the user is able to login into the page with invalid credentials")
	public void IncorrectUsernameAndInCorrectPassword()
	{
		String username="Admin1";
		String password="Ad@123";
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.signIn();
		boolean alertmsg=loginpage.isHomePageNotLoaded();
		Assert.assertTrue(alertmsg,"Homepage loaded when user enters invalid credentials");	
	}
	
}
