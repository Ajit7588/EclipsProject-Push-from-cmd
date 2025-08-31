package api_requestBodyPreparation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserAsArrayRequestBody 
{
	public static void main(String[] args) throws JsonProcessingException
	{
		InnerClass user1=new InnerClass("1","ajit");
		InnerClass user2=new InnerClass("2","kumar");
		List<InnerClass> user=new ArrayList<>();
		user.add(user1);
		user.add(user2);
		Map<String,Object> map=new HashMap<>();	
		map.put("user", user);

		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
		System.out.println(requestBody);
		



	}


	//	UsersWrapper wrap=new UsersWrapper(users);
	//	
	//	ObjectMapper mapper=new ObjectMapper();
	//	String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(wrap);
	//	System.out.println(requestBody);

}
