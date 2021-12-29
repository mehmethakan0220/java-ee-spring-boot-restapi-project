package com.personal.blog.Apis.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RoleResponse {
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("mean")
	private String mean;

	public RoleResponse() {
		super();
	}

	public RoleResponse(int id, String title, String mean) {
		this.id = id;
		this.title = title;
		this.mean = mean;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}
	
	

}
