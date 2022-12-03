package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName='Shamim'";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName like 'S%'";
		String hql = "from co.edureka.hibernate.entity.Student where studentId IN (102,105,18,120,106)";
		
		Query<Student> q = session.createQuery(hql, Student.class);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?0 and ?1"; //positional parameters
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter(0, 101);
		q.setParameter(1, 106);
		*/
		
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; //named parameters
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter("minsid", 106);
		q.setParameter("maxsid", 125);	
		
		List<Student> students = q.getResultList();
		for(Student st : students) {
			System.out.println(st);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
		
		Transaction tx = session.beginTransaction();
		
		hql = "update co.edureka.hibernate.entity.Student set studentName='Dileep Kumar' , studentEmail='dileep@hotmail.com' where studentId=106";
		Query query = session.createQuery(hql);
		int rowsAffected = query.executeUpdate();
		System.out.println("no of students affected = " + rowsAffected);
		
		tx.commit();
		session.close();
		sfactory.close();
	}
}
