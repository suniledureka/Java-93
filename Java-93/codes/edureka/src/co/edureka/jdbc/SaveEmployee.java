package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception{
		/*
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "root");
		*/
		
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(101, 'Sunil', 2500.5)";
		String sql = "insert into emp(empno,ename,sal) values(102, 'Sujith', 2500.5), (103, 'Praveen', 4275.5),"
				+ "(104, 'Chris', 7500), (105,'Mark', 7657.75), (106, 'Abraham', 2500)";
		
		try {
			int employeesSaved = st.executeUpdate(sql);
			System.out.println("Employees Saved --> " + employeesSaved);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		
		st.close();
		con.close();
	}

}
