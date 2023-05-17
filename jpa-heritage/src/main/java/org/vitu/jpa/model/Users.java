package org.vitu.jpa.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Users extends AbstractPersistentObject {

	@OneToMany(mappedBy = "users")
	private Set<User> users = new HashSet<>();
	
	public Set<User> getUsers() {
		return new HashSet<User>();
	}
	
	public boolean addUser(User user) {
		boolean added = this.users.add(user);
		if (added) {
			user.setUsers(this);
		}
		return added; 
	}

	@Override
	public String toString() {
		return "Users [users=" + users + ", toString()=" + super.toString() + "]";
	}
}