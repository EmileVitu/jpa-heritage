package org.vitu.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PlayWithInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	}

}
