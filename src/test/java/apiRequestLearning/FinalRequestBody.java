package apiRequestLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FinalRequestBody 
{
	public static void main(String[] args) throws JsonProcessingException 
	{
//		InnerBody body=new InnerBody("12345","Ajit");
//		InnerBody xxx=new InnerBody("12345","Ajit");
//		InnerAddressClass add=new InnerAddressClass("line1","line2","411014");
//		List<InnerBody> body1=new ArrayList<>();
//		body1.add(body);
//	//	body1.add(xxx);
//
//		Map<String,Object> body2=new HashMap<>();
//		body2.put("profile",body1);
//		body2.put("address",add);
//		
//		ObjectMapper mapper=new ObjectMapper();
//		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(body2);
//
//		System.out.println(requestBody);
//		List<InnerBody> body1=new ArrayList<>();
//		InnerBody body=new InnerBody("12345","Ajit");
//		Map<String,Object> map=new HashMap<>();
		//map.put("profile", body);
//		InnerBody body=new InnerBody("12345","Ajit");
//		List<InnerBody> inner=new ArrayList<>();
//		inner.add(body);
		
		
//		InnerBody body=new InnerBody("12345","Ajit");
//		Map<String,Object> map=new HashMap<>();
//		map.put("profile", body);
//		List<Object> body1=new ArrayList<>();
//		body1.add(map);
//		
//		InnerBody body1=new InnerBody("12345","Ajit");
//		InnerBody body2=new InnerBody("12346","Kumar");
//		List<Object> list=new ArrayList<>();
//		list.add(body1);
//	//	list.add(body2);
//		
//		Map<String,Object> map=new HashMap<>();
//		map.put("profile", list);
		
		InnerBody inner=new InnerBody("12345","Ajit");
		InnerAddressClass address=new InnerAddressClass("line 1","lin2 2","411014");
		List<InnerAddressClass> list=new ArrayList<>();
		list.add(address);
		Map<String,Object> map=new LinkedHashMap<>();
		map.put("profile", inner);
		map.put("address", list);
		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

		System.out.println(requestBody);

				
	}

}
