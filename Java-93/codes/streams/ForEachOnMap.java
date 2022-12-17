package co.edureka.util.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ForEachOnMap {

	public static void main(String[] args) {
		streamOnMap();
	}

	private static void streamOnMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "ONE");
		map.put(2, "TWO");
		map.put(3, "THREE");
		map.put(4, "FOUR");
		map.put(5, "FIVE");	
		
		//-- iteration using map.forEach(java.util.function.BiConsumer)
		/*
		map.forEach(new BiConsumer<Integer, String>() {
			@Override
			public void accept(Integer t, String u) {
				System.out.println(String.format("%2d ---> %-8s", t, u));
			}			
		});
		*/
		map.forEach((t, u) -> System.out.println(String.format("%-2d ---> %-8s", t, u)));
		
		System.out.println("\n-------------------------------------------------------------------");
		
		//-- iteration using Stream API stream.forEach(java.util.function.Consumer)
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		entries.stream().forEach(entry -> System.out.println(entry));
		
		System.out.println("\n-------------------------------------------------------------------");
		
		//-- iteration using Stream API
		entries.stream().forEach(entry -> {
					Integer key = entry.getKey();
					String value = entry.getValue();
					System.out.println(String.format("%-2d ---> %-8s", key, value));
				}
		);		
	}

	
}
