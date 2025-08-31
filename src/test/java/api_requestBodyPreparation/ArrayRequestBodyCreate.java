package api_requestBodyPreparation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ArrayRequestBodyCreate {
  @Test
  public void f() throws JsonProcessingException
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
}
