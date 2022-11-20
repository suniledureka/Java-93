package co.edureka.util;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		
		System.out.println(names.add("Sanjay")); //true
		System.out.println(names.add("Sanjay")); //false
		names.add("Praveen");
		names.add("Arun");
		names.add("Bhargav");
		names.add("Mark");
		
		System.out.println(names);
		
		names.add(null);
		System.out.println(names);
	}

}
