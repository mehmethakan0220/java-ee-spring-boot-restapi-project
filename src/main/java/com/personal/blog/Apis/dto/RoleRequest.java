package com.personal.blog.Apis.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoleRequest {
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("mean")
	private String mean;

	public RoleRequest() {
		super();
	}

	public RoleRequest(String title, String mean) {
		this.title = title;
		this.mean = mean;
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
