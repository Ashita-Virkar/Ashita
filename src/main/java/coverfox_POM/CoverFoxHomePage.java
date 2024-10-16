package coverfox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxHomePage {
	
	//variable declaration
	@FindBy(xpath = "//div[text()='Female']") private WebElement gender;
	
	//constructor
	
	public CoverFoxHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonbutton()
	{
		Reporter.log("click on gender button", true);
		gender.click();
	}
	
}
