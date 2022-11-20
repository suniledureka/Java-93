package co.edureka.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		
		System.out.println(names.add("Sanjay")); //true
		System.out.println(names.add("Sanjay")); //false
		names.add("Praveen");
		names.add("Arun");
		names.add("Bhargav");
		names.add("Mark");
		
		System.out.println(names);
		
		names.add(null); //java.lang.NullPointerException
		System.out.println(names);		
	}
}
