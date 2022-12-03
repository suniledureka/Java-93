package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class FirstLevelCacheTest {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		Student st1 = session.get(Student.class, 101);
		
		if(st1 != null)
			System.out.println(st1);
		else
			System.out.println("$$$--- No Matching Student found!!! ---$$$");
		
		System.out.println("-----------------------------------------------------------------\n");
		Thread.sleep(5000);
		
		Student st2 = session.get(Student.class, 101);
		
		if(st2 != null)
			System.out.println(st2);
		else
			System.out.println("$$$--- No Matching Student found!!! ---$$$");
		
		session.close();
		sfactory.close();

	}

}
