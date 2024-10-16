package coverfox_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CoverFoxHomeTest {

	public static void main(String[] args) throws InterruptedException
	{
	ChromeOptions op = new ChromeOptions();
	
	op.addArguments("-disable-notifications");
	
	WebDriver driver = new ChromeDriver(op);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.coverfox.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
//	CoverFoxHomePage coverhomepage = new CoverFoxHomePage(driver);
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
//	coverhomepage.clickonbutton();
//	
//	CoverFoxhealthplan healthplan = new CoverFoxhealthplan(driver);
//	
//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
//	healthplan.clickonspousebutton();
//	healthplan.clickonnextbutton();
//		
//	CoverFoxMemberdetails covermemberdetails= new CoverFoxMemberdetails(driver);
//	covermemberdetails.youage();
//	covermemberdetails.spouseage();
//	covermemberdetails.clickonnextbutton();
//	
//	CoverAddressdetails addressdetails = new CoverAddressdetails(driver);
//	addressdetails.pincode();
//	addressdetails.mobileno();
//	addressdetails.continuebutton();
	
	Termcoverfoxpage resultpage = new Termcoverfoxpage(driver);
	Thread.sleep(2000);

	
	resultpage.insurancedropdown(driver);
	
	
	}

}
