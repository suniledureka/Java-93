package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Types;
import java.sql.CallableStatement;

public class ProcedureCall {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection(); 
		CallableStatement cst = con.prepareCall("{call hike_employee_salary(?,?,?)}");
		
		int eno = 101;
		int hike = 10;
		
		cst.setInt(1, eno);
		cst.setInt(2, hike);
		cst.registerOutParameter(3, Types.FLOAT);
		
		cst.execute();
		
		System.out.println("updated salary of empno: "+eno + " = " + cst.getFloat(3));
		
		cst.close();
		con.close();
	}

}
