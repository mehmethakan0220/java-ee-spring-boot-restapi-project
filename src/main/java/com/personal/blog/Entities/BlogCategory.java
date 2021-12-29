package com.personal.blog.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="blog_category")
public class BlogCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private int blogCategoryId;
	
	@Column(name="title", unique = true)
	private String blogCategoryTitle;

	public BlogCategory() {
		super();
	}

	public BlogCategory(int blogCategoryId, String blogCategoryTitle) {
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
