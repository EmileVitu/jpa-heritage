package org.vitu.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.vitu.jpa.model.Users;

import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion.User;

public class FunWithInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp-jpa-create");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		User user = entityManager.find(User.class, 1);
		System.out.println("User = " + user);		
		
		User user2 = entityManager.find(User.class, 2);
		System.out.println("User = " + user2);
		
		Users users = entityManager.find(Users.class, 1);
		System.out.println("Users = " + users);
	}

}