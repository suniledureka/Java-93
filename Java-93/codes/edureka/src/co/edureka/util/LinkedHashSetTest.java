package co.edureka.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>();
		
		System.out.println(names.add("Sanjay")); //true
		System.out.println(names.add("Sanjay")); //false
		names.add("Praveen");
		names.add("Arun");
		names.add("Bhargav");
		names.add("Mark");
		
		System.out.println(names);

	}

}
