package policyBazaar_Test;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import policyBazaar_Base.PB_Base;
import policyBazaar_POM.PB_LogInPage;
import policyBazaar_POM.PB_MainPage;
import policyBazaar_POM.PB_TransactionPage;
import policyBazaar_Utility.PB_Utility;

public class PB_Test extends PB_Base
{
	PB_LogInPage login;
	PB_MainPage mainPage;
	PB_TransactionPage payment;
  @BeforeClass
  public void launchingBrowser() throws IOException
  {
	launchingChromeBrowser();
	  login=new PB_LogInPage(driver);
	  mainPage = new PB_MainPage(driver);
	  payment =new PB_TransactionPage(driver);
	  
	  
  }

  @BeforeMethod
  public void signIn() throws IOException, InterruptedException
  {
  	  login.clickOnSignInButton(driver);
  	  Thread.sleep(1000);
  	  login.sendMobNumber(driver, PB_Utility.readDataFromProperties("mobNumber"));
  	  Thread.sleep(1000);
  	  login.clickOnSubmitButton(driver);
  	  Thread.sleep(1000);
  	  login.sendPaswword(driver, PB_Utility.readDataFromProperties("password"));
  	  Thread.sleep(1000);
  	  login.clickOnPasswordSubmit(driver);
  	  Thread.sleep(1000);
  	  mainPage.clickOnMyAccount(driver);
  	  Thread.sleep(1000);
  	  mainPage.clickOnMyTransaction(driver);
  	  Thread.sleep(1000);
  	 // payment.handleWindowPopUp(driver);
	  //Thread.sleep(2000);
  }
  @Test
  public void gettingMypayment() throws IOException, InterruptedException 
  {
	  payment.gettingMyPayment(driver);
	  //comment added at master in test
  }
	
	@AfterMethod
	public void logOut() throws InterruptedException
	{	
		Thread.sleep(1000);
	    mainPage.clickOnLogoutButton(driver);
	}
	@AfterClass
	public void closingBrowser()
	{
		Reporter.log("Closing Browser", true);
		driver.quit();
	}
}
