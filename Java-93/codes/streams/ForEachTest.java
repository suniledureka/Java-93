//performing iteration on a collection
package co.edureka.util.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachTest {

	public static void main(String[] args) {
		List<String> courseNames = Arrays.asList("Java", "Python", "Oracle", "MySQL", "SQL Server", "Android"); 
		
		//--- traditional approach for iteration (for, for each loop, Iterator, ListIterator, Enumeration)
		for(String courseName : courseNames) {
			System.out.print(courseName + "      ");
		}
		System.out.println("\n");
		
		//-- iteration using Stream API
		Stream<String> courseNamesStream = courseNames.stream();
		/*
		courseNamesStream.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.print(t + "      ");				
			}			
		});
		*/
		
		courseNamesStream.forEach(courseName -> System.out.print(courseName + "      "));
		System.out.println("\n");
		
		//System.out.println("no of courses in list ---> " + courseNamesStream.count()); // java.lang.IllegalStateException: stream has already been operated upon or closed
		
		System.out.println("no of courses in list ---> " + courseNames.stream().count());
		
		courseNames.stream().forEach(cname ->  System.out.print(cname + "      "));
	}
}
