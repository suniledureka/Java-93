package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		Map<String, Float> bank = new HashMap<String, Float>();
		
		System.out.println(bank.put("Sunil", 25000f)); //null
		System.out.println(bank.put("Sunil", 11500.5f)); //25000.0
		System.out.println(bank.put("Anil", 25000f)); //null
		bank.put("Mark", 27500f);
		bank.put("Sanjay", 15000f);
		bank.put("Chris", 12000.5f);
		
		System.out.println(bank);
		System.out.println();
		
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of \"Sunil\" = " + bal);
		bal = bal + 1150.5f;
		bank.put("Sunil",bal);
		System.out.println(bank);
		System.out.println();
		
		System.out.print("A/C Holders ----> ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name + "   |   ");
		}
		System.out.println("\n");
		
		Set<Map.Entry<String, Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String, Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Float> entry = it.next();
			String name = entry.getKey();
			float balance = entry.getValue();
			//System.out.println(name +" --> " + balance);
			String details = String.format("%-8s ---> %.2f", name, balance);
			System.out.println(details);
			Thread.sleep(2000);
		}
		System.out.println();
		
		bank.put(null, null);
		System.out.println(bank);
	}
}
