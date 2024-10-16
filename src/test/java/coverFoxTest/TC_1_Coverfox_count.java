package coverFoxTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import coverFoxBase.Base;
import coverfox_POM.CoverFoxHomeTest;
import coverfoxutitlity.utility;
//import pract.CoverAddressdetails;
//import pract.CoverFoxHomePage;
//import pract.CoverFoxMemberdetails;
//import pract.CoverFoxResultpage;
//import pract.CoverFoxhealthplan;

public class TC_1_Coverfox_count extends Base
{
	
	
	coverfox_POM.CoverFoxHomePage homepage;
	coverfox_POM.CoverFoxhealthplan healthplan;
	coverfox_POM.CoverFoxMemberdetails memberdetail;
	coverfox_POM.CoverAddressdetails addressdatails;
	coverfox_POM.CoverFoxResultpage resultpage;
	 String excelpath =System.getProperty("user.dir")+"\\Datasheet\\Data.xlsx";
	 String sheetName="sheet1";
	 
	 @BeforeClass
	 public void openApplication() throws IOException {
		 launchBrowser();
	 }
	
	 @BeforeMethod
	 public void enterdetails() throws EncryptedDocumentException, IOException, InterruptedException
	 {
		 homepage = new coverfox_POM.CoverFoxHomePage(driver);
		 healthplan = new coverfox_POM.CoverFoxhealthplan(driver);
		 memberdetail = new coverfox_POM.CoverFoxMemberdetails(driver);
		 addressdatails = new coverfox_POM.CoverAddressdetails(driver);
		 resultpage = new coverfox_POM.CoverFoxResultpage(driver);
		 homepage.clickonbutton();
		 Thread.sleep(2000);
		 healthplan.clickonnextbutton();
		 Thread.sleep(2000);
		 memberdetail.youage();
		// memberdetail.spouseage(utility.readDataFromExcel(excelpath, sheetName, 0, 1));
		 memberdetail.clickonnextbutton();
		 Thread.sleep(2000);
		 addressdatails.pincode();
		 addressdatails.mobileno();
		 addressdatails.continuebutton();
		 Thread.sleep(2000);
		 
		 }
	 
	 @Test
	 public void validatePolicyCount()
	 {
		 int textCount = resultpage.getcounttext();
		 int bannercount = resultpage.getcountfrombanner();
		 
		 Assert.assertEquals(textCount, bannercount,"text count not matching with bannner count,TC failed");
	
		 Assert.fail();
	 }
	 
	 @AfterClass
	 public void closeApplication()
	 {
		 closeBrowser();
	 }
	 
}
