package com.personal.blog.Entities;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "id", columnDefinition = "uuid", unique = true)
	private UUID id;
	
	@Column(name="role_id")
	private int roleId;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="nick", unique = true)
	private String nick;
	
	@Column(name="email", unique = true)
	private String email;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="location")
	private String location;

	public User() {
		super();
	}

	public User(UUID id, int roleId, String fullName, String nick, String email, Date dob, String location) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.fullName = fullName;
		this.nick = nick;
		this.email = email;
		this.dob = dob;
		this.location = location;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	

}
