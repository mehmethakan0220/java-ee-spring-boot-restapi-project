package com.personal.blog.Apis.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class BlogCategoryResponse {
	
	@JsonProperty("id")
	private int blogCategoryId;
	
	@JsonProperty("title")
	private String blogCategoryTitle;

	
	public BlogCategoryResponse() {
		super();
	}
	
	public BlogCategoryResponse(int blogCategoryId, String blogCategoryTitle) {
		this.blogCategoryId = blogCategoryId;
		this.blogCategoryTitle = blogCategoryTitle;
	}

	public int getBlogCategoryId() {
		return blogCategoryId;
	}

	public void setBlogCategoryId(int blogCategoryId) {
		this.blogCategoryId = blogCategoryId;
	}

	public String getBlogCategoryTitle() {
		return blogCategoryTitle;
	}

	public void setBlogCategoryTitle(String blogCategoryTitle) {
		this.blogCategoryTitle = blogCategoryTitle;
	}

}
