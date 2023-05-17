package org.vitu.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.vitu.jpa.model.Customer;
import org.vitu.jpa.model.User;
import org.vitu.jpa.model.Users;

public class PlayWithInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp-jpa-create");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		User bigFella = new User("BigFella", 70);
		Customer moussa = new Customer("Moussa", 35, "M35");
		
		entityManager.getTransaction().begin();
		entityManager.persist(moussa);
		entityManager.getTransaction().commit();
		
		entityManager.getTransaction().begin();
		entityManager.persist(bigFella);
		entityManager.getTransaction().commit();
		
		entityManager.getTransaction().begin();
		Users users = new Users();
		users.addUser(moussa);
		users.addUser(bigFella);
		entityManager.persist(users);
		entityManager.getTransaction().commit();
		
		System.out.println("Moussa = " + moussa);
		System.out.println("BigFella = " + bigFella);
	}
}
