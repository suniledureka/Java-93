package co.edureka.util.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingOnList {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(78,96,80,45,62,71,83,60,90,25,67);
		System.out.println(nums);
		
		/*
		//-- traditional approach of Sorting
		Collections.sort(nums);
		//Collections.reverse(nums);
		System.out.println(nums);		
		*/

		//-- sorting java.lang.Comparable objects
		Stream<Integer> sortedStream = nums.stream().sorted();
		List<Integer> sortedList = sortedStream.collect(Collectors.toList());
		System.out.println(sortedList);
		
		System.out.println("-----------------------------------------------------------");
		nums.stream().sorted().forEach(num -> System.out.print(num +", "));
		System.out.println("\n-----------------------------------------------------------");
		
		//-- sorting non Comparable objects
		List<Employee> emps = EmployeeDAO.getEmployees();
		emps.stream().forEach(emp -> System.out.println(emp));
		
		System.out.println("\n---------------------- LISTING EMPLOYEES IN ORDER OF SALARY ASC -------------------------------------");
		emps.stream().sorted((o1, o2) -> (int)(o1.getEmployeeSal() - o2.getEmployeeSal())).forEach(emp -> System.out.println(emp));
	}

}
