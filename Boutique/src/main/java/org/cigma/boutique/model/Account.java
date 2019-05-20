package org.cigma.boutique.model;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Account {
	private Long idAccount;
	private String username;
	private String lastname;
	private String email;
	private String address;
	
	@OneToOne
	@JoinColumn(name="idUser")
	private User user;

}
