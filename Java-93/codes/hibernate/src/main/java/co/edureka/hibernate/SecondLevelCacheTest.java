package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class SecondLevelCacheTest {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session1 = sfactory.openSession();
		Session session2 = sfactory.openSession();
		
		Student st1 = session1.get(Student.class, 101);
		
		if(st1 != null)
			System.out.println(st1);
		else
			System.out.println("$$$--- No Matching Student found!!! ---$$$");
		
		System.out.println("-----------------------------------------------------------------\n");
		Thread.sleep(5000);
		
		Student st2 = session2.get(Student.class, 101);
		
		if(st2 != null)
			System.out.println(st2);
		else
			System.out.println("$$$--- No Matching Student found!!! ---$$$");
		
		session1.close();
		session2.close();
		sfactory.close();

	}

}
