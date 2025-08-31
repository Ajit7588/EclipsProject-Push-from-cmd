package rest_api;

import static io.restassured.RestAssured.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Request1User 
{
	public static void main(String[] args) throws JsonProcessingException 
	{
		InnerUser user=new InnerUser("1","Ajit");
		UserWrapperClass mainUser=new UserWrapperClass(user);
		
		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mainUser);
		System.out.println(requestBody);
	}

}
