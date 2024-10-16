package coverfox_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Termcoverfoxpage
{

	//variable 
	
	@FindBy(xpath = "//span[text()='Insurance']") private WebElement insurance;
	
	@FindBy(id = "term-to-product") private WebElement term;
	
	@FindBy(xpath = "(//a[text()='Term Insurance'])[1]") private WebElement terminsurance;
	
	//constructor
	
	public Termcoverfoxpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	
	public void insurancedropdown(WebDriver driver)
	{
		Actions act = new Actions(driver);
	
	act.moveToElement(insurance).click().perform();

		
	
	}
}
