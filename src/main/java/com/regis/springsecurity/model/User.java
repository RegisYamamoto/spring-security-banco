package com.regis.springsecurity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.dom4j.tree.AbstractEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User extends AbstractEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	@NotEmpty
	@Column(unique = true)
	private String username;

	@NotEmpty
	@JsonIgnore
	private String password;

	@NotEmpty
	private String name;

	@NotEmpty
	private boolean admin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

}