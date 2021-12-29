package com.personal.blog.Apis.dto;

import java.sql.Date;
import java.util.UUID;


import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponse {
	
	@JsonProperty("id")
	private UUID id;
	
	@JsonProperty("role_id")
	private int roleId;
	
	@JsonProperty("full_name")
	private String fullName;
	
	@JsonProperty("nick")
	private String nick;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("dob")
	private Date dob;
	
	@JsonProperty("location")
	private String location;

	public UserResponse() {
		super();
	}

	public UserResponse(UUID id, int roleId, String fullName, String nick, String email, Date dob, String location) {
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
