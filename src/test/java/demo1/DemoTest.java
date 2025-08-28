package demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

		driver.get("https://www.google.com");
	}

	@Test(dependsOnMethods="fun1",priority=2)
	public void fun2()
	{
		driver.manage().window().maximize();
	}

	@Test(priority=3)
	public void fun3()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("ajit",Keys.ENTER);

	}


	  @AfterClass
	  public void tearDown()
	  {
		  driver.quit();
		  
	 }













}
