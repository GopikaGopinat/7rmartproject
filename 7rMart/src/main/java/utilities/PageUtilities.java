package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtilities  {
	
	public void javaSriptClick(WebDriver  driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
	public void scrollBy(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	public void selectByValue(WebElement element,String value) {
		Select select =new Select(element);
		select.selectByValue(value);	
	}
	public void selectByVisibleText(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	public void selectbyindex(WebElement element,int value)
	{
		Select select=new Select(element);
		select.selectByValue(null);
	}
	public void simpleAlert(WebDriver driver) {
		//String alerttext=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}
	public void confirmationAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void promptAlert(WebDriver driver)
	{
		driver.switchTo().alert().sendKeys("");
		driver.switchTo().alert().accept();
	}
	
	
}
