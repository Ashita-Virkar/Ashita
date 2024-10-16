package coverfox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverAddressdetails 
{

	//variable
	
	@FindBy(className = "mp-input-text") private WebElement pincode;
	
	@FindBy(id = "want-expert") private WebElement mobileno;
	
	@FindBy(className = "next-btn") private WebElement continuebutton;
	
	//constructor
	
	public CoverAddressdetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	
	public void pincode ()
	{
		Reporter.log("Enter pincode no", true);
		pincode.sendKeys("400075");	
	}
	
	public void mobileno()
	{
		Reporter.log("Enter mobile no", true);
		
		mobileno.sendKeys("9874563214");
	}

	public void continuebutton()
	{
		Reporter.log("click on continue button", true);
		continuebutton.click();
	}

	
}
