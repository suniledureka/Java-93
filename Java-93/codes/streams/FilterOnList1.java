package co.edureka.util.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterOnList1 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10,18,2,15,9,7,62,27,8,11,28);
		
		//requirement -> get all numbers greater than 15 using Stream
		Stream<Integer> sourceStream = nums.stream();
		Stream<Integer> filteredStream = sourceStream.filter(num -> num>15);
		
		System.out.println("Original Collection ---> " + nums);
		System.out.println("Filtered Collections with value > 15 ");
		filteredStream.forEach(num -> System.out.print(num+"   "));
	}
}