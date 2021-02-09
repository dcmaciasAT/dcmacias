package com.atsistemas.dcmacias.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;


@Entity
@Table(name = "USERS")
public class User {
	
	public User() {	
	}

	public User(Long phone, String username, String userlastname) {
		this.phone = phone;
		this.username = username;
		this.userlastname = userlastname;		
	}

	@Id
	@ApiModelProperty(notes = "The database user ID")
	@Column(name = "PHONE", nullable = false, unique = true)
	private Long phone;
	
	@ApiModelProperty(notes = "The user first name")
	@Column(name = "NAME", nullable = false, unique = false)
	private String username;

	@ApiModelProperty(notes = "The user last name")
	@Column(name = "LASTNAME", nullable = false, unique = false)
	private String userlastname;

	@ApiModelProperty(notes = "The contacts of the user")
	@JoinTable(name = "USERS_CONTACTS", joinColumns = @JoinColumn(name = "FK_USER", nullable = false), inverseJoinColumns = @JoinColumn(name = "FK_CONTACT", nullable = false))
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Contact> contacts;

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserlastname() {
		return userlastname;
	}

	public void setUserlastname(String userlastname) {
		this.userlastname = userlastname;
	}

	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}
	
	public void addContact (Contact contact) {
		if (this.contacts == null) {
			this.contacts = new HashSet<Contact>();
		}

		this.contacts.add(contact);
	}

	@Override
	public String toString() {
		return "User [phone=" + phone + ", username=" + username + ", userlastname=" + userlastname + ", contacts="
				+ contacts + "]";
	}
	
	


}