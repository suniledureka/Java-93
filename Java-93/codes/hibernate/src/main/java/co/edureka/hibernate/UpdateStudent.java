package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		/*
		//--- updating an entity - approach: 1 ---
		Student st = new Student(102, "Afra R Rahman", "afra@edureka.co");
		session.update(st);
		*/
		
		//--- updating an entity - approach: 2 ---
		Student st = session.get(Student.class, 101);	
		
		if(st != null) {
			System.out.println(st);
			st.setStudentName("Sunil Joseph"); //dirty object
		}
		else {
			System.out.println("$$$--- No Matching Student found!!! ---$$$");
		}		
		
		tx.commit();
		session.close();
		sfactory.close();
	}

}
