package org.vitu.jpa;

import org.vitu.jpa.model.User;
import org.vitu.jpa.model.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FunWithInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp-jpa-validate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		User user1 = entityManager.find(User.class, 1);
		System.out.println("User = " + user1);		
		
		User user2 = entityManager.find(User.class, 2);
		System.out.println("User = " + user2);
		
		Users users = entityManager.find(Users.class, 1);
		System.out.println("Users = " + users);
	}

}