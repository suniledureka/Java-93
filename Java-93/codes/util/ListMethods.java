package co.edureka.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		System.out.println(names + "| size= "+names.size());
		
		names.add("Sunil");
		names.add("Jeremy");
		names.add("Afra");
		names.add("Sunil");
		names.add("Aishwarya");
		names.add("Bindu");
		names.add("Sunil");
		
		System.out.println(names + "| size= "+names.size());
		names.add(1, "Anil Singh");
		
		System.out.println(names + "| size= "+names.size());
		names.set(2, "JEREMY");
		
		System.out.println(names + "| size= "+names.size());
		
		System.out.println("is \"Sunil\" in list = " + names.contains("Sunil"));
		System.out.println("is \"Ajay\" in list = " + names.contains("Ajay"));
		System.out.println();
		
		System.out.println("index of \"Sunil\" = " + names.indexOf("Sunil"));
		System.out.println("index of \"Sunil\" from last = " + names.lastIndexOf("Sunil"));
		System.out.println("index of \"Ajay\" = " + names.indexOf("Ajay")); //-1
		System.out.println();
		
		System.out.println("person @ index 3 = " + names.get(3));
		//System.out.println("person @ index 10 = " + names.get(10)); //java.lang.IndexOutOfBoundsException
		
		System.out.println("remove(object) ---> " + names.remove("Sunil")); //true
		System.out.println("remove(0) ---> " + names.remove(0)); //Anil Singh
		
		System.out.println(names + "| size= "+names.size());
	}

}
