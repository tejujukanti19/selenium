package contactForm;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class links 
{
	@Test
	public  void link()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.mycontactform.com/samples.php");
		
		driver.findElement(By.linkText("Course Evaluation")).click();
		
		

     }
	
}
