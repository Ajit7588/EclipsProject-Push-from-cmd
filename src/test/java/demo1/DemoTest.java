package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest 
{
	public static WebDriver driver;
  @Test(priority=1)
  public void fun1() 
  {
	  WebDriverManager.chromedriver().browserVersion("139").setup();
	  driver=new ChromeDriver();
	  
	  driver.get("https://www.google.com");
  }
  
  @Test(dependsOnMethods="fun1",priority=2)
  public void fin2()
  {
	  driver.manage().window().maximize();
  }
  
  
  @AfterClass
  public void tearDown()
  {
	  driver.quit();
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
}
