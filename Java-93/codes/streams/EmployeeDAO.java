package co.edureka.util.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	public static List<Employee> getEmployees(){
		List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(203, "Sunil", "DEV", 600000f));
		emps.add(new Employee(343, "Anil", "QA", 400000f));
		emps.add(new Employee(625, "Praveen", "DEV", 500000f));
		emps.add(new Employee(274, "Charles", "QA", 700000f));
		emps.add(new Employee(106, "Chris", "HR", 650000f));
		emps.add(new Employee(621, "Srinivas", "HR", 450000f));
		emps.add(new Employee(628, "Sanjay", "HR", 550000f));
		
		return emps;
	}
}
