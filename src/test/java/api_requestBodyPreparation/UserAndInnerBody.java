package api_requestBodyPreparation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserAndInnerBody {

	public static void main(String[] args) throws JsonProcessingException 
	{
		InnerClass users=new InnerClass("1","ajit");
		UsersWrapper wrap=new UsersWrapper(users);
		
		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(wrap);
		System.out.println(requestBody);

	}

}
