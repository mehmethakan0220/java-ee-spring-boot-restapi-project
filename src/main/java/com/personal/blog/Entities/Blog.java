package com.personal.blog.Entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="blog")
public class Blog {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private int blogId;
	
	@Column(name="blog_user_id")
	private UUID blogUserId;
	
	@Column(name="blog_title", unique = true)
	private String blogTitle;
	
	@Column(name="blog_category")
	private String blogCategory;
	
	@Column(name="blog_content")
	private Byte[] blogContent;
	
	@Column(name="blog_description")
	private String blogDescription;

	public Blog() {
		super();
	}

	public Blog(int blogId, UUID blogUserId, String blogTitle, String blogCategory, Byte[] blogContent,
			String blogDescription) {
		super();
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
