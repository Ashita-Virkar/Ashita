package coverfox_POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	
		driver.findElement(By.xpath("//span[text()=\"Prime\"]")).click();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.id("multiasins-img-link")).click();
	}

}
