package contactForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class businessForm {
	@Test
	public static void form()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.mycontactform.com/samples.php");
		
		driver.findElement(By.xpath("html/body/div[3]/div[1]/div[1]/ul/li/a")).click();

	}

}
