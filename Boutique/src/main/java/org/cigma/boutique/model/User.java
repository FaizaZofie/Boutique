package org.cigma.boutique.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

@Column(name="Username")
 private String username;

@Column(name="lastname")
 private String lastname;


@Column(name="email")
private String email;

@Column(name="address")
private String address;

@Column(name="pays")
private String pays;

@Column(name="ville")
private String ville;

@Column(name="CIN")
private String cin;


@Column(name="password")
private String password;

@Column(name = "active")
private int active;

public int getActive() {
	return active;
}






public void setActive(int active) {
	this.active = active;
}






public Set<Role> getRoles() {
	return roles;
}






public void setRoles(Set<Role> roles) {
	this.roles = roles;
}


@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
private Set<Role> roles;





//####################################################################################






/*Getters & Setters=================================================================================*/
public Long getId() {
	return id;
}






public void setId(Long id) {
	this.id = id;
}


public String getUsername() {
	return username;
}


public void setUsername(String username) {
	this.username = username;
}


public String getLastname() {
	return lastname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getPays() {
	return pays;
}


public void setPays(String pays) {
	this.pays = pays;
}


public String getVille() {
	return ville;
}


public void setVille(String ville) {
	this.ville = ville;
}


public String getCin() {
	return cin;
}


public void setCin(String cin) {
	this.cin = cin;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}



//###################################################################################################

/*Constructors========================================================*/


	


public User() {
	super();
	// TODO Auto-generated constructor stub
}


public User(String username, String lastname, String email, String address, String pays, String ville, String cin,
		String password) {
	super();
	this.username = username;
	this.lastname = lastname;
	this.email = email;
	this.address = address;
	this.pays = pays;
	this.ville = ville;
	this.cin = cin;
	this.password = password;
}


//#########################################################################################################



/*ToString*/
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", lastname=" + lastname + ", email=" + email + ", address="
			+ address + ", pays=" + pays + ", ville=" + ville + ", cin=" + cin + ", password=" + password + "]";
}



}

