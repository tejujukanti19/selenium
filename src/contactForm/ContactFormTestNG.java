package contactForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ContactFormTestNG 
{
	WebDriver driver;
	
 
  @BeforeTest
  public void beforeMethod()
  {
	 // WebDriver driver;
	  driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        
  }
  
  @Test
  public void businessForm()
  {
	  System.out.println("test");
	  driver.get("https://www.mycontactform.com/samples.php");
	  driver.findElement(By.xpath("html/body/div[3]/div[1]/div[1]/ul/li/a")).click();
  }

  @AfterTest
  public void afterMethod() {
	  
	  driver.close();
  } 
}