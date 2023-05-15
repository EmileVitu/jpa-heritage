package org.vitu.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.User;

public class FunWithInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		User user = entityManager.find(User.class, 1);
 
		System.out.println("User = " + user);
		
	}

}
