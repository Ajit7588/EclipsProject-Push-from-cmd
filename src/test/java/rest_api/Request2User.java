package rest_api;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Request2User {

	public static void main(String[] args) throws JsonProcessingException
	{
		InnerUser user1=new InnerUser("1","Ajit");
		InnerUser user2=new InnerUser("2","Kumar");
		List<InnerUser> users= Arrays.asList(user1,user2);
		
		
		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);
		System.out.println(requestBody);

	}

}
