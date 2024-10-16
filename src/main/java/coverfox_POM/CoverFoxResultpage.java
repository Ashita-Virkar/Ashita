package coverfox_POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxResultpage
{
	
	//variable
	
	@FindBy(xpath = "//div[contains(text(),'Health Insurance Plans')]") private WebElement header;
	
	@FindBy(css = "div.pcc-main") private List<WebElement> planlist;
	
	//constructor
	
	public CoverFoxResultpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	
	public int getcounttext()
	{
		Reporter.log("get policy count for text", true);
		
	    String resultint = header.getText().substring(0, 2);
	    
	    int resultno = Integer.parseInt(resultint);
	
	    return resultno;
	
	   
	}	

	public int getcountfrombanner()
	{
		Reporter.log("get policy count from banner display", true);
		int countfrombanner = planlist.size();
		
		return countfrombanner;
	}
}
