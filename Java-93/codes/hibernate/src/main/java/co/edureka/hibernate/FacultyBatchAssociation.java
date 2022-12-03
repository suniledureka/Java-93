package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Batch;
import co.edureka.hibernate.entity.Faculty;
import co.edureka.hibernate.utils.HibernateUtils;

public class FacultyBatchAssociation {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory(); 
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();

		Faculty faculty = new Faculty(101, "Sunil Joseph");
		
		Batch batch1 = new Batch("Java Certification", faculty);
		Batch batch2 = new Batch("Spring Certification", faculty);
		Batch batch3 = new Batch("Python Certification", faculty);
		
		session.save(faculty);
		session.save(batch1);
		session.save(batch2);
		session.save(batch3);
		
		tx.commit();		
		session.close();
		sfactory.close();		
	}

}
