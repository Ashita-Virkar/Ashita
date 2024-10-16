package coverFoxBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import coverfoxutitlity.utility;



public class Base 

{
	protected static WebDriver driver;
	public void launchBrowser() throws IOException
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(utility.readDataFromPropertyFile("url"));
		Reporter.log("lauching browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Reporter.log("waiting", true);
	}

	public void closeBrowser()
	{
		Reporter.log("closing browser", true);
		driver.quit();
	}
}
