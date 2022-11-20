package co.edureka.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		//-- initialize MySQL JDBC Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//-- connect to db_edureka MySQL database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "root");
		
		//-- create an object for passing SQL query 
		Statement st = con.createStatement();
		
		//-- pass the SQL query to create a DB table
		String sql = "create table emp(empno int(5), ename varchar(30), sal float(10,2), primary key(empno))";
		try {
			st.execute(sql);
			System.out.println("Database Table Created!!");
		}catch(Exception ex) {
			System.out.println("Error in Creating Table ---> " + ex.toString());
		}
		
		//-- close the connection with db_edureka MySQL database
		st.close();
		con.close();
	}

}
