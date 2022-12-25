package policyBazaar_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import policyBazaar_Utility.PB_Utility;

public class PB_MainPage 
{

	@FindBy(xpath = "//div[@class='userprofile']") private WebElement myAccount;
	@FindBy(xpath = "//span[text()='My transactions']") private WebElement transaction;
	@FindBy(xpath = "//i[@class='menu-icon-bg signout']")private WebElement logout;
	
	public PB_MainPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMyAccount(WebDriver driver)
	{
		PB_Utility.waiting(driver, 1000);
		Reporter.log("Clicking On My Account", true);
		myAccount.click();
	}
	public void clickOnMyTransaction(WebDriver driver)
	{
		PB_Utility.waiting(driver, 1000);
		Reporter.log("Clicking On My Transaction", true);
		transaction.click();		
	}
	public void clickOnLogoutButton(WebDriver driver)
	{
		PB_Utility.waiting(driver, 1000);
		myAccount.click();
		PB_Utility.waiting(driver, 1000);
		Reporter.log("Logging Out From PB", true);
		logout.click();
		
	}
	
}
