package org.vitu.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.persistence.internal.sessions.cdi.EntityListenerInjectionManagerImpl;
import org.vitu.jpa.model.User;

public class PlayWithRefresh {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp-jpa-validate");
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		
		System.out.println("EM 1 = " + entityManager1);
		System.out.println("EM 2 = " + entityManager2);
		
		User user1 = entityManager1.find(User.class, 1);
		User user2 = entityManager2.find(User.class, 1);
		
		System.out.println("uA = u2 ? " + (user1 == user2));
		
		System.out.println("u1 = " + user1);
		System.out.println("u2 = " + user2);
		
		entityManager2.detach(user2);
		
		entityManager1.getTransaction().begin();
		System.out.println("U1 à 25");
		user1.setAge(25);
		entityManager1.getTransaction().commit();
		
//		entityManager2.refresh(user2);
		
		System.out.println("u1 = " + user1);
		System.out.println("u2 = " + user2);
		
		entityManager2.merge(user2);
		
		entityManager2.getTransaction().begin();
		System.out.println("U2 à 40");
		user2.setAge(40);
		entityManager2.getTransaction().commit();
		
//		entityManager1.refresh(user1);
		
		System.out.println("u1 = " + user1);
		System.out.println("u2 = " + user2);
	}
}
