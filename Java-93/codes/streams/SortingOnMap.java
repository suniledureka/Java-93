package co.edureka.util.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class SortingOnMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(7, "seven");
		map.put(9, "nine");
		map.put(2, "two");
		map.put(5, "five");
		map.put(1, "one");
		
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		
		List<Map.Entry<Integer, String>> entriesList = new ArrayList<>(entries);
		
		/*
		//traditional approach -using anonymous class
		Collections.sort(entriesList, new Comparator<Map.Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getKey()- (o2.getKey());
			}
		});
		
		for(Map.Entry<Integer, String> entry : entriesList) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		*/
		
		/*
		//traditional approach -using lambda expression
		Collections.sort(entriesList, (Entry<Integer, String> o1, Entry<Integer, String> o2) -> o1.getKey()- (o2.getKey()));
		for(Map.Entry<Integer, String> entry : entriesList) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
		*/
		
		
		//-- sorting using Stream API on Map 
		Stream<Map.Entry<Integer, String>> sortedEntries = map.entrySet().stream().sorted(Map.Entry.comparingByKey());
		sortedEntries.forEach(entry -> System.out.println(entry.getKey() + " --> " + entry.getValue()));
		System.out.println();
		
		Map<Employee, Integer> employeeMap = new HashMap<>();
		employeeMap.put(new Employee(203, "Sunil", "DEV", 600000f), 1);
		employeeMap.put(new Employee(343, "Anil", "QA", 400000f), 2);
		employeeMap.put(new Employee(625, "Praveen", "DEV", 500000f), 3);
		employeeMap.put(new Employee(274, "Charles", "QA", 700000f), 4);
		employeeMap.put(new Employee(106, "Chris", "HR", 650000f), 5);
		
		/*
		Stream<Map.Entry<Employee, Integer>> sortedEmployeeEntries = employeeMap.entrySet().stream()
				  .sorted((o1, o2) -> o1.getKey().getEmployeeName().compareTo(o2.getKey().getEmployeeName()));
		*/
		
		/*
		//-- getting employee details in the ascending order of employeeName
		Stream<Map.Entry<Employee, Integer>> sortedEmployeeEntries = employeeMap.entrySet().stream()
							  .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmployeeName)));				
		*/
		
		//-- getting employee details in the descending order of employeeName
		Stream<Map.Entry<Employee, Integer>> sortedEmployeeEntries = employeeMap.entrySet().stream()
							  .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmployeeName).reversed()));
		
		sortedEmployeeEntries.forEach(entry -> System.out.println(entry.getKey() + " --> " + entry.getValue()));
	}
}
