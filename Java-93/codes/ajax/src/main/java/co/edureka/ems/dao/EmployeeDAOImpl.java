package co.edureka.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import co.edureka.ems.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public Employee findEmployeeByNo(final int eno) {
		String sql = "select ename, sal from emp where empno="+eno;
		try {
		 Employee emp = jt.queryForObject(sql, new RowMapper<Employee>() {
				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
					Employee emp = new Employee();
					emp.setEmployeeNo(eno);
					emp.setEmployeeName(rs.getString(1));
					emp.setEmployeeSal(rs.getFloat(2));
					
					return emp;
			}			
		 });
		return emp;
		}catch(Exception ex) {
			return null;
		}
	}
}
