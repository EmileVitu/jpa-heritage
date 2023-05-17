package org.vitu.jpa;

import org.vitu.jpa.model.User;
import org.vitu.jpa.model.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FunWithInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp-jpa-validate");
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
	
		User user1 = entityManager1.find(User.class, 1);
		System.out.println("User = " + user1);
		
		entityManager2.getTransaction().begin();
		User user3 = entityManager2.merge(user1);
		user3.setAge(1000);
		entityManager2.getTransaction().commit();
		
//		User user2 = entityManager.find(User.class, 2);
//		System.out.println("User = " + user2);
		
//		Users users = entityManager.find(Users.class, 1);
//		System.out.println("Users = " + users);
	}
}