package com.personal.blog.Apis.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class BlogCategoryRequest {
	
	@JsonProperty("title")
	private String blogCategoryTitle;

	public BlogCategoryRequest() {
		super();
	}

	public BlogCategoryRequest(String blogCategoryTitle) {
		this.blogCategoryTitle = blogCategoryTitle;
	}

	public String getBlogCategoryTitle() {
		return blogCategoryTitle;
	}

	public void setBlogCategoryTitle(String blogCategoryTitle) {
		this.blogCategoryTitle = blogCategoryTitle;
	}
}
