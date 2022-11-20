package co.edureka.util;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new TreeMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 25000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //25000.0
		System.out.println(bank.put("Anil", 25000f)); //null
		bank.put("Mark", 27500f);
		bank.put("Sanjay", 15000f);
		bank.put("Chris", 12000.5f);
		
		System.out.println(bank);
		
		bank.put("Arjun", null);
		System.out.println(bank);
		
		bank.put(null, 25000f); //java.lang.NullPointerException
		System.out.println(bank);		
	}

}
