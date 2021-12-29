package com.personal.blog.DataAccess.hibernate.blog;

import java.util.List;

import com.personal.blog.Entities.Blog;


public interface IDalBlog {
	
	void create(Blog blog);
	List<Blog> readAll();
	void update(Blog blog);
	void delete(Blog blog);
	Blog getById(int id);

}
