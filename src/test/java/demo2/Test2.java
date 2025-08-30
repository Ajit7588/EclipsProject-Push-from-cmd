package demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 
{
	public static WebDriver driver;
	@Test(priority=1)
	public void fun() 
	{
		//	  WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver","../GitHubPushCode/configureDriver/chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@AfterClass
	public void tearDown()
	{
		System.out.println("Hello ajit its working");
		driver.quit();
	}

}
