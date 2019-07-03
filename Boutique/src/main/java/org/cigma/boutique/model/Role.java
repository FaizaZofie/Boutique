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
	 @Column(name = "role_id")
	private Long id;
	@Column(name = "nameRole")
	private String nameRole;


	 

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




}
