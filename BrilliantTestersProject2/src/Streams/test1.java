package Streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {

	//COunt the number of names starting with alphabet A in list
	@Test
	public void regular()
	{
	ArrayList<String> names=new ArrayList<String>();
	names.add("Abhijeet");
	names.add("Don");
	names.add("Alekhya");
	names.add("Adam");
	names.add("Ram");
	int count=0;
	
	for(int i=0;i<names.size();i++)
	{
		String actual=names.get(i);
		if(actual.startsWith("A"))
		{
			count++;
		}
	}

	System.out.println(count);	
		
		
	}

	@Test
	public void streamExample1()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		//data type for count() is Long
	Long count	=names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(count);
	}
	@Test
	public void streamExample2()
	{
		Long d=Stream.of("naresh","Parita","vedant","dvira").filter(s ->
		{
			return s.startsWith("j");
		}).count();
		System.out.println(d);
	}
	@Test
	public void streamExample3()
	{
		Stream.of("naresh","Parita","vedant","dvira").filter(s ->s.length()>5).forEach(s -> System.out.println(s));

	}
	@Test
	public void streamExample4()
	{
		//Stream.of("naresh","Parita","vedant","dvira").filter(s ->s.length()>3).forEach(s -> System.out.println(s));
		Stream.of("naresh","Parita","vedant","dvi").filter(s ->s.length()>4).limit(3).forEach(s -> System.out.println(s));

	}
	@Test
	public void streamMap()
	{

		//print names which have last letter a and with Upercase
		Stream.of("naresh","Parita","vedant","dvi").filter(s ->s.endsWith("h")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

	}
	@Test
	public void arraysToList()
	{
		//convert arrays to list then we can perform stream operations on it
	List<String> countryNmaes	=Arrays.asList("India","China","England","Idndor","Indonesia");
	// names start with I and sorted in alphabatical oreder and in upercase
		countryNmaes.stream().filter(s -> s.startsWith("I")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));


	}
	@Test
	public void mergeTwoArrayListThenStreamOperation()
	{
		//convert arrays to list then we can perform stream operations on it
		List<String> countryNmaes	=Arrays.asList("India","China","England","Idndor","Indonesia");
		List<String> countryNmaes1	=Arrays.asList("pak","uk","usa","france","spain","India");
           //convert list into stream
		Stream<String> str1=countryNmaes.stream();
		Stream<String> str2=countryNmaes1.stream();
		//add to stream into one stream
		Stream<String> finalStream=Stream.concat(str1,str2);
		//to print all memmbers from stream
		//finalStream.forEach(s -> System.out.println(s));
		//to print in sorted oredr
		//finalStream.sorted().forEach(s -> System.out.println(s));
		finalStream.distinct().sorted().forEach(s -> System.out.println(s));
	}
	@Test
	public void matchAnyMemberInList()
	{
		//to check that particular elment is present in given in arrylist--boolean
		List<String> countryNmaes	=Arrays.asList("India","China","England","Idndor","Indonesia");
	boolean flag=countryNmaes.stream().anyMatch(s -> s.equalsIgnoreCase("India"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}
	@Test
	public void collectInList()
	{
		//do manipulation using stream on list then collect result in list and use wherever required
		List<String> countryNmaes	=Arrays.asList("India","China","England","Idndor","Indonesia");
		List<String> desiredNames=countryNmaes.stream().filter(s -> s.length()>3).map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(desiredNames);
		System.out.println(desiredNames.size());
		System.out.println(desiredNames.get(1));

	}
	@Test
	public void printDistict()
	{
		//print unique number from arraylist and print 3rd index
		List<Integer> values	=Arrays.asList(1,7,8,9,2,7,8,123,45,35,78,98);
		//arrange in discnding/assending oredr
		List<Integer> myValues=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(myValues);
		System.out.println(myValues.get(2));
		//reverseor
		List<Integer> reversList
				=values.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversList);


	}

}

