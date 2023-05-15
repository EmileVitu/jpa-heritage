package org.vitu.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.vitu.jpa.model.Customer;
import org.vitu.jpa.model.User;

public class PlayWithInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		User bigFella = new User("BigFella", 70);
		Customer moussa = new Customer("Moussa", 35, "M35");
		
		entityManager.getTransaction().begin();
		entityManager.persist(bigFella);
		entityManager.persist(moussa);
		entityManager.getTransaction().commit();
		
		System.out.println("Moussa = " + moussa);
		System.out.println("BigFella = " + bigFella);
	}

}
