package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(109,'Sujith',2500)");
		st.addBatch("insert into emp values(110,'Abijith',3500)");
		//st.addBatch("insert into emp values(109,'Sanjay',4000)");
		st.addBatch("insert into emp values(111,'Sanjay',4000)");
		st.addBatch("update emp set sal = 2750 where empno > 107");
		
		try {
			int[] rowsAffected = st.executeBatch();
			con.commit();
			for(int n : rowsAffected) {
				System.out.println("----------> " + n);
			}
		}
		catch(Exception ex) {
			System.out.println("ERROR --> " + ex.toString());
			con.rollback();
		}
		
		st.close();
		con.close();
	}
}
