package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Account;
import co.edureka.hibernate.utils.HibernateUtils;

public class SaveAccount {

	public static void main(String[] args) {		
		SessionFactory sfactory = HibernateUtils.getSessionFactory(); 
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Account acc = new Account();
		acc.setAccountNo(50143588745L);
		acc.setName("Sunil Joseph");
		acc.setBalance(25000.5f);
		
		session.save(acc);
		
		tx.commit();		
		session.close();
		sfactory.close();
	}
}
