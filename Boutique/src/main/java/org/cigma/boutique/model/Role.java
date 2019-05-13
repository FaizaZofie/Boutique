package org.cigma.boutique.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="Role")
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
	
	 @Column(nullable = false, unique = true)
	  
private String nameRole;


	 @ManyToMany
	 private List<User> user;


	 

/* Getters & Setters ***************************************************************/
public Long getIdRole() {
	return id;
}

public void setId(Long idRole) {
	this.id = idRole;
}

public String getNameRole() {
	return nameRole;
}

public void setNameRole(String nameRole) {
	this.nameRole = nameRole;
}

public List<User> getUser() {
 	return user;
 }
 public void setUser(List<User> user) {
		this.user = user;
	}


}
