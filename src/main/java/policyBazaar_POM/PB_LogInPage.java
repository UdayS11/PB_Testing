package policyBazaar_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import policyBazaar_Utility.PB_Utility;

public class PB_LogInPage 
{
@FindBy(xpath = "//a[@class='sign-in']")  private WebElement signIn;
@FindBy(xpath = "(//input[@id='central-login-module-sign-mobile'])[2]" ) private WebElement mobNumber;
@FindBy(xpath = "(//a[@id='central-loggin-with-pwd'])[2]") private WebElement pwdButton;
@FindBy(xpath = "//input[@type='password']") private WebElement password;
@FindBy(id = "login-in-with-password") private WebElement submit;

public PB_LogInPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickOnSignInButton(WebDriver driver)
{
	PB_Utility.waiting(driver, 1000);
	Reporter.log("Clicking On SignIn Button", true);
	signIn.click();
}
public void sendMobNumber(WebDriver driver,String mobNumb)
{
	PB_Utility.waiting(driver, 1000);
    Reporter.log("Sending Mobile Number", true);
	mobNumber.sendKeys(mobNumb);
}
public void clickOnSubmitButton(WebDriver driver)
{
	PB_Utility.waiting(driver, 1000);
	Reporter.log("Clicking  on Password Button", true);
	pwdButton.click();
}
public void sendPaswword(WebDriver driver,String pwd)
{
	PB_Utility.waiting(driver, 1000);
	Reporter.log("Sending Password", true);
	password.sendKeys(pwd);
}
public void clickOnPasswordSubmit(WebDriver driver)
{
	PB_Utility.waiting(driver, 1000);
	Reporter.log("Clicking on Submit Button", true);
	submit.click();
}
}
