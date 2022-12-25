package policyBazaar_POM;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import policyBazaar_Utility.PB_Utility;

public class PB_TransactionPage
{
@FindBy(xpath = "//p[text()='Seems like you haven’t made any payments yet.']") private WebElement text;

public PB_TransactionPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//public void handleWindowPopUp(WebDriver driver)
//{
//	PB_Utility.waiting(driver, 1000);
//	Set<String> idOfAllPages = driver.getWindowHandles();
//	//System.out.println(idOfAllPages);
//	Reporter.log("Switching to Transaction Page", true);
//	Iterator<String>it=idOfAllPages.iterator();
//	String idOfMainPage = it.next();
//	String idOfTransactionPage = it.next();
//	driver.switchTo().window(idOfTransactionPage);
//}

public void gettingMyPayment(WebDriver driver) throws IOException
{PB_Utility.waiting(driver, 1000);
Set<String> idOfAllPages = driver.getWindowHandles();
//System.out.println(idOfAllPages);
Reporter.log("Switching to Transaction Page", true);
Iterator<String>it=idOfAllPages.iterator();
String idOfMainPage = it.next();
String idOfTransactionPage = it.next();
driver.switchTo().window(idOfTransactionPage);
	
	PB_Utility.waiting(driver, 1000);
	String myText = text.getText();
	Reporter.log("Amount is "+myText, true);
	PB_Utility.takingScreenshot(driver, myText);
	PB_Utility.waiting(driver, 1000);
	Reporter.log("Switching to main page", true);
	driver.switchTo().window(idOfMainPage);
}


}
