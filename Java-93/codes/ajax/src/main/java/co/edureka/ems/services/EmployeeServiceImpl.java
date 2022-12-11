package co.edureka.ems.services;

import org.springframework.beans.factory.annotation.Autowired;
import co.edureka.ems.dao.EmployeeDAO;
import co.edureka.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	public Employee searchEmployeeByNo(int eno) {
		return dao.findEmployeeByNo(eno);
	}
}
