package org.cigma.boutique.model;

import java.util.List;

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
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="User")
public class User {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")
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


@Transient
private String confirmPassword;

@ManyToMany(cascade=CascadeType.MERGE)
@JoinTable(
		name="user_role",
		joinColumns={ @JoinColumn (name="USER_ID" , referencedColumnName="ID")},
				       inverseJoinColumns= {@JoinColumn(name="ROLE_ID" , referencedColumnName="ID")})
		
		
private List<Role> role;



//####################################################################################



public List<Role> getRole() {
	return role;
}


public void setRole(List<Role> role) {
	this.role = role;
}


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


public String getConfirmPassword() {
	return confirmPassword;
}


public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
//###################################################################################################

/*Constructors========================================================*/

public User(String username, String lastname, String email, String address, String pays, String ville, String cin,
		String password, String confirmPassword) {
	super();
	this.username = username;
	this.lastname = lastname;
	this.email = email;
	this.address = address;
	this.pays = pays;
	this.ville = ville;
	this.cin = cin;
	this.password = password;
	this.confirmPassword = confirmPassword;
}


public User() {
	super();
	// TODO Auto-generated constructor stub
}

//#########################################################################################################

/*ToString*/
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", lastname=" + lastname + ", email=" + email + ", address="
			+ address + ", pays=" + pays + ", ville=" + ville + ", cin=" + cin + ", password=" + password
			+ ", confirmPassword=" + confirmPassword + "]";
}
}

