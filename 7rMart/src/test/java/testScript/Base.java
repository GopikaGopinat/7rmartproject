package testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {
	public WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void initilizeBrowser(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver =new ChromeDriver();	
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver =new EdgeDriver();	
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver =new FirefoxDriver();
		}
		else
		{
			throw new Exception("browser is not correct");
		}

		driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void DriverQuitAndClose()
	{
		driver.quit();
		//driver.close();
	}

}
