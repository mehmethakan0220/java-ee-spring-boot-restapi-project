package com.personal.blog.Business.blogManager;

import java.util.List;

import com.personal.blog.Apis.dto.BlogRequest;
import com.personal.blog.Apis.dto.BlogResponse;


public interface IBlogManager {

	void create(BlogRequest blog);
	List<BlogResponse> readAll();
	void update(BlogResponse blog);
	void delete(BlogResponse blog);
	BlogResponse getById(int id);
}
