package coverfox_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Coverfox_insurance {

	public static void main(String[] args) throws InterruptedException 
	{

		ChromeOptions op = new ChromeOptions();
		op.addArguments("-disable-notifications");
		
		
		WebDriver driver = new ChromeDriver(op);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.coverfox.com/");
		
	     Thread.sleep(5000);
		
		Termcoverfoxpage termcover = new Termcoverfoxpage(driver);
		termcover.insurancedropdown(driver);

		
	}

}
