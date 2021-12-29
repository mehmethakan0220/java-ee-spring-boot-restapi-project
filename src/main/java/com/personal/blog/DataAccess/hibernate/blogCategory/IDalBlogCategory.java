package com.personal.blog.DataAccess.hibernate.blogCategory;

import java.util.List;

import com.personal.blog.Entities.BlogCategory;


public interface IDalBlogCategory {
	
	void create(BlogCategory category);
	List<BlogCategory> readAll();
	void update(BlogCategory category);
	void delete(BlogCategory category);
	BlogCategory getById(int id);

}
