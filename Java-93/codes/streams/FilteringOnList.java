package co.edureka.util.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteringOnList {

	public static void main(String[] args) {
		List<String> courseNames = Arrays.asList("Java", "Python", "Oracle", "MySQL", "Java Script", "SQL Server", "Android"); 
		
		/* ---- requirement -- to get all the course names starts with "Ja" ----*/
		//-- traditional approach
		for(String cname : courseNames) {
			if(cname.startsWith("Ja")) {
				System.out.print(cname + "     ");
			}
		}
		System.out.println("\n");
		
		// using filter on Stream API - stream.filter(java.util.function.Predicate)
		Stream<String> courseNamesStream = courseNames.stream();
		Stream<String> filteredCourseNamesStream = courseNamesStream.filter(cname -> cname.startsWith("Ja"));
		filteredCourseNamesStream.forEach(cname -> System.out.print(cname + "     "));
		
		System.out.println("\n");
		
		courseNames.stream().filter(cname -> cname.startsWith("Ja")).forEach(cname -> System.out.print(cname + "     "));
		
		System.out.println("\n");
		
		List<String> courseNamesStartsWithJa = courseNames.stream().filter(cname -> cname.startsWith("Ja")).collect(Collectors.toList());
		System.out.println(courseNamesStartsWithJa);
		
		System.out.println("\n");
		
		System.out.println("no of courses starts with \"Ja\" = " + courseNames.stream().filter(t -> t.startsWith("Ja")).count());
		System.out.println("\n");
		
		List<Integer> nums = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		List<Integer> evenNums = nums.stream().filter(num -> num%2==0).collect(Collectors.toList());
		System.out.println(evenNums);
	}

}
