package coverfox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxhealthplan
{

	//variable
	
	@FindBy(xpath = "//div[text()='You']") private WebElement you;
	
	@FindBy(xpath = "//div[text()='Husband']") private WebElement spouse;
	
	@FindBy(className = "next-btn") private WebElement next;
	
	//constructor
	
	public CoverFoxhealthplan(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void clickonspousebutton()
	{
		Reporter.log("click on spouse button", true);
		spouse.click();
	}

	public void clickonnextbutton()
	{
		next.click();
	}
}

