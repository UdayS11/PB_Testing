package policyBazaar_Utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class PB_Utility 
{
public static void takingScreenshot(WebDriver driver,String name) throws IOException
{
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File destination= new File("D:\\Soft Testing\\Screenshots\\Policy Bazaar\\"+name+".png");
    FileHandler.copy(src, destination);
    Reporter.log("Taking Screenshot", true);
}

public static String readDataFromProperties(String key) throws IOException
{
	Properties prop=new Properties();
	FileInputStream myfile=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\PolicyBazaar\\PolicyBazaar_Data.properties");
	prop.load(myfile);
	String value = prop.getProperty(key);
	Reporter.log("Reading "+key+" From Properties File ", true);
	return value;
}
public static void waiting(WebDriver driver, int waitTime)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	

}
}