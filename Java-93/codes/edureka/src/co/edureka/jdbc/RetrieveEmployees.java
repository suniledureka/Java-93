package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		String sql = "select * from emp";
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int eno = rs.getInt(1);
			String name = rs.getString(2);
			float sal = rs.getFloat(3); //rs.getFloat("sal");
			
			//System.out.println(eno + " | " + name + " | " + sal);
			String employee = String.format("%3d | %-8s | %.2f", eno, name, sal);
			System.out.println(employee);
			
			Thread.sleep(1000);
		}
		
		//to get column names and its properties
		System.out.println("Column Names :: ");
		
		ResultSetMetaData rsmd = rs.getMetaData();
		for(int i=1; i<=rsmd.getColumnCount(); i++) {
			System.out.println("\t ----> " + rsmd.getColumnName(i).toUpperCase());
		}
		
		rs.close();
		st.close();
		con.close();
	}
}
