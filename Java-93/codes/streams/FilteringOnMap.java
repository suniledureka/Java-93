package co.edureka.util.streams;

import java.util.HashMap;
import java.util.Map;

public class FilteringOnMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "ONE");
		map.put(2, "TWO");
		map.put(3, "THREE");
		map.put(4, "FOUR");
		map.put(5, "FIVE");	
		
		//requirement -- get all the entries with even number keys 
		map.entrySet().stream().filter(entry -> entry.getKey()%2 == 0).forEach(entry -> System.out.println(entry));
	}

}
