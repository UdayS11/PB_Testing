package policyBazaar_Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import policyBazaar_Utility.PB_Utility;

public class PB_Base 
{
protected WebDriver driver;

public void launchingChromeBrowser() throws IOException
{
System.setProperty("webdriver.chrome.driver","D:\\Important\\chromedriver.exe");
driver = new ChromeDriver();
driver.get(PB_Utility.readDataFromProperties("url"));
driver.manage().window().maximize();

}
	
}
