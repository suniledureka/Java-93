package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		/*
		//--- deleting an entity - approach: 1 ---
		Student st = new Student(102, "Afra R Rahman", "afra@edureka.co");
		session.delete(st);
		*/
		
		//--- delete an entity - approach: 2 ---
		Student st = session.get(Student.class, 112);	
		
		if(st != null) {
			System.out.println(st);	
			session.delete(st);
		}
		else {
			System.out.println("$$$--- No Matching Student found!!! ---$$$");
		}		
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();

	}

}
