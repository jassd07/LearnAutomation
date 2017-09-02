package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG {
	
	public WebDriver driver;
	
	
  @Test
  public void main() 
  {
	  driver.findElement(By.name("UserName")).sendKeys("admin");
	  System.out.println("Username Entered");
	  driver.findElement(By.name("Password")).sendKeys("admin");
	  System.out.println("Password Entered");
	driver.findElement(By.name("Login")).click();
	System.out.println("Loggedin");
	
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  driver = new FirefoxDriver();
	  driver.get("http://executeautomation.com/demosite/login.html");
  }

  @AfterMethod
  public void afterMethod() 
  {	  
	  driver.close();
  }

}
