package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		//-- initialize spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		User user1 = (User)context.getBean("usr1");
		System.out.println(user1);
		
		System.out.println("------------------------------------------------------------\n");
		
		//-- closing spring container
		((ConfigurableApplicationContext)context).close();
	}

}
