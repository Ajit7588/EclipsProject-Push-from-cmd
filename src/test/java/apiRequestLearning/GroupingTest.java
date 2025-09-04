package apiRequestLearning;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GroupingTest 
{
	@Test(priority=1,groups= {"sanity"})
	public void test1() throws JsonProcessingException 
	{
		System.out.println("========= test 1 ==========");
		InnerBody inner=new InnerBody("1234","Ajit");
		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(inner);

		System.out.println(requestBody);
	}
	@Test(priority=2,groups= {"regression"})
	public void test2() throws JsonProcessingException 
	{
		System.out.println("========= test 2 ==========");
		InnerBody inner1=new InnerBody("1234","Ajit");
		//InnerBody inner2=new InnerBody("1235","Kumar");
		Map<String, Object> map=new LinkedHashMap<>();
		map.put("profile",inner1);
	
		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
		System.out.println(requestBody);
	}
	@Test(priority=3,groups= {"sanity"})
	public void test3() throws JsonProcessingException 
	{
		System.out.println("========= test 3 ==========");
		InnerBody inner1=new InnerBody("1234","Ajit");
		List<Object> list=new ArrayList<>();
		list.add(inner1);
	
		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		System.out.println(requestBody);
	}
	@Test(priority=4,groups= {"regression"})
	public void test4() throws JsonProcessingException 
	{
		System.out.println("========= test 4 ==========");
		InnerBody inner1=new InnerBody("1234","Ajit");
		Map<String,Object> map=new LinkedHashMap<>();
		map.put("profile",inner1);
	
		List<Object> list=new ArrayList<>();
		list.add(map);
		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		System.out.println(requestBody);
	}
	@Test(priority=5,groups= {"sanity"})
	public void test5() throws JsonProcessingException 
	{
		System.out.println("========= test 5 ==========");
		InnerBody inner1=new InnerBody("1234","Ajit");	
		List<Object> list=new ArrayList<>();
		list.add(inner1);
		
		Map<String,Object> map=new LinkedHashMap<>();
		map.put("profile",list);
		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
		System.out.println(requestBody);
	}
	@Test(priority=6,groups= {"regression"})
	public void test6() throws JsonProcessingException 
	{
		System.out.println("========= test 6 ==========");
		InnerBody inner1=new InnerBody("1234","Ajit");	
		List<Object> list=new ArrayList<>();
		list.add(inner1);
		
		List<Object> list1=new ArrayList<>();
		list1.add(list);

		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list1);
		System.out.println(requestBody);
	}
	@Test(priority=7,groups= {"sanity"})
	public void test7() throws JsonProcessingException 
	{
		System.out.println("========= test 7 ==========");
		InnerBody inner1=new InnerBody("1234","Ajit");	
		InnerAddressClass address1=new InnerAddressClass("line 1","line 2","411014");
		
		Map<String,Object> map=new LinkedHashMap<>();
		map.put("profile",inner1);
		map.put("address",address1);

		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
		System.out.println(requestBody);
	}
	@Test(priority=8,groups= {"regression"})
	public void test8() throws JsonProcessingException 
	{
		System.out.println("========= test 8 ==========");
		InnerBody inner1=new InnerBody("1234","Ajit");	
		InnerAddressClass address1=new InnerAddressClass("line 1","line 2","411014");
		List<Object> list=new ArrayList<>();
		list.add(address1);
		
		Map<String,Object> map=new LinkedHashMap<>();
		map.put("profile",inner1);
		map.put("address",list);

		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
		System.out.println(requestBody);
	}
	@Test(priority=9,groups= {"regression"})
	public void test9() throws JsonProcessingException 
	{
		System.out.println("========= test 9 ==========");
		InnerBody inner1=new InnerBody("1234","Ajit");	
		InnerAddressClass address1=new InnerAddressClass("line 1","line 2","411014");
		List<Object> list1=new ArrayList<>();
		List<Object> list2=new ArrayList<>();
		list1.add(address1);
		list2.add(inner1);
		
		Map<String,Object> map=new LinkedHashMap<>();
		map.put("profile",list1);
		map.put("address",list2);

		ObjectMapper mapper=new ObjectMapper();
		String requestBody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
		System.out.println(requestBody);
	}
}
