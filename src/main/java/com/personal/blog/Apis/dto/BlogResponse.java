package com.personal.blog.Apis.dto;


import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlogResponse {

	
	@JsonProperty("blog_id")
	private int blogId;
	
	@JsonProperty("blog_user_id")
	private UUID blogUserId;
	
	@JsonProperty("blog_title")
	private String blogTitle;
	
	@JsonProperty("blog_category")
	private String blogCategory;
	
	@JsonProperty("blog_content")
	private Byte[] blogContent;
	
	@JsonProperty("blog_description")
	private String blogDescription;

	public BlogResponse() {
		super();
	}

	public BlogResponse(int blogId, UUID blogUserId, String blogTitle, String blogCategory, Byte[] blogContent,
			String blogDescription) {
		this.blogId = blogId;
		this.blogUserId = blogUserId;
		this.blogTitle = blogTitle;
		this.blogCategory = blogCategory;
		this.blogContent = blogContent;
		this.blogDescription = blogDescription;
	}

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public UUID getBlogUserId() {
		return blogUserId;
	}

	public void setBlogUserId(UUID blogUserId) {
		this.blogUserId = blogUserId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogCategory() {
		return blogCategory;
	}

	public void setBlogCategory(String blogCategory) {
		this.blogCategory = blogCategory;
	}

	public Byte[] getBlogContent() {
		return blogContent;
	}

	public void setBlogContent(Byte[] blogContent) {
		this.blogContent = blogContent;
	}

	public String getBlogDescription() {
		return blogDescription;
	}

	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}
	
	
	
}
