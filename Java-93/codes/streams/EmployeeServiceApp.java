package co.edureka.util.streams;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeServiceApp {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeDAO.getEmployees();

		System.out.println("--------------------- ALL EMPLOYEES ---------------------");
		employees.stream().forEach(emp -> System.out.println(emp));
		System.out.println();
		
		System.out.println("--------------------- ALL EMPLOYEES IN DEPT -> DEV ---------------------");		
		employees.stream().filter(emp -> emp.getEmployeeDept().equalsIgnoreCase("dev")).forEach(emp -> System.out.println(emp));
		
		System.out.println();
		
		System.out.println("--------------------- ALL EMPLOYEES IN DEPT -> HR & SALARY >= 500000 ---------------------");		
		employees.stream().filter(emp -> emp.getEmployeeDept().equalsIgnoreCase("hr") && emp.getEmployeeSal()>=500000).forEach(emp -> System.out.println(emp));
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter salary threshold : ");
		float sal = sc.nextFloat();
		
		List<Employee> filteredEmployees = findEmployeesWithSalaryWithARange(employees, sal);
		
		System.out.println("----------------- EMPLOYEES WITH SALARY >= "+sal+" -------------------");
		filteredEmployees.forEach(emp -> System.out.println(emp));
		
		sc.close();
	}

	private static List<Employee> findEmployeesWithSalaryWithARange(List<Employee> emps , float sal) {
		return emps.stream().filter(emp -> emp.getEmployeeSal() >= sal).collect(Collectors.toList());
	}
}
