package org.vitu.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 40)
	private String nom;
	private int age;
	
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

	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", age=" + age + "]";
	}
	
}
