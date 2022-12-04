package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		//-- initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		System.out.println("------------------------------------------------------------\n");
		
		User user1 = (User) context.getBean("usr1");
		System.out.println(user1);
		System.out.println("------------------------------------------------------------\n");
		
		User user2 = (User) context.getBean("usr1");
		System.out.println(user2);
		System.out.println("------------------------------------------------------------\n");
		
		User user3 = context.getBean("usr1", User.class);
		System.out.println(user3);
		System.out.println("------------------------------------------------------------\n");	
		
		User user4 = (User) context.getBean("usr2");
		System.out.println(user4);				
	}

}
