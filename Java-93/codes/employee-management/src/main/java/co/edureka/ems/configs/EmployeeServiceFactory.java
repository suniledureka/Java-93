package co.edureka.ems.configs;

import co.edureka.ems.services.EmployeeService;
import co.edureka.ems.services.EmployeeServiceImpl;

public class EmployeeServiceFactory {
	private static EmployeeService empService = null;
	
	public static EmployeeService getEmployeeService() throws Exception{
		if(empService == null) {
			empService = new EmployeeServiceImpl();
		}
		return empService;
	}
}
