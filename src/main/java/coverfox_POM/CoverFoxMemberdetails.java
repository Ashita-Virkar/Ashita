package coverfox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CoverFoxMemberdetails 
{

	//variable
	
	@FindBy(id = "Age-You") private WebElement youage;
	
	@FindBy(id ="Age-Spouse") private WebElement spouseage;
	
	@FindBy(className = "next-btn") private WebElement nextbutton;
	
	//constructor
	
	public CoverFoxMemberdetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//method
	
	
	public void youage()
	{
		Reporter.log("click on youage dropdown", true);
		Select s = new Select(youage);
	
		s.selectByVisibleText(" 30 years ");
		
	}

	public void spouseage(String sage)
	{
		Reporter.log("click on spouseage dropdown", true);

		Select s1 =new Select(spouseage);
		
		s1.selectByVisibleText(sage);
	}


	public void clickonnextbutton()
	{
		Reporter.log("Click on next button", true);
		nextbutton.click();
	}


	


	


}
