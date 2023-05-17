package org.vitu.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity(name = "User")
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "User [id=" + id + ", nom=" + nom + ", age=" + age + "]";
	}
	
}
