package org.vitu.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity(name = "User")
@Inheritance(strategy = InheritanceType.JOINED)
public class User extends AbstractPersistentObject {

	@Column(length = 40)
	private String nom;
	private int age;
	
	@ManyToOne
	private Users users;
	
	public User() {
	}
	
	public User(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "User [nom=" + nom + ", age=" + age + ", toString()=" + super.toString() + "]";
	}
}
