package restAPIS;

import static io.restassured.RestAssured.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationN 
{
	public static  RequestSpecification requestSpec;

	@BeforeClass
	public void setup()
	{
		requestSpec=
				RestAssured
				.given()
				.baseUri("https://api.example.com")
				.header("Content-Type", "application/json");
	}
	public static void main(String[] args) 
	{
//		Response response=
//		given()
//		.spec(requestSpec)
//		.header("","")
//		.when()
//		.get("");

		WebDriverManager.safaridriver().setup();
		WebDriver driver=new SafariDriver();

	}


}
