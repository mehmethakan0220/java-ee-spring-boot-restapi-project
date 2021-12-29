package com.personal.blog.Business.blogCategoryManager;

import java.util.List;

import com.personal.blog.Apis.dto.BlogCategoryRequest;
import com.personal.blog.Apis.dto.BlogCategoryResponse;


public interface IBlogCategoryManager {
	void create(BlogCategoryRequest category);
	List<BlogCategoryResponse> readAll();
	void update(BlogCategoryResponse category);
	void delete(BlogCategoryResponse category);
	BlogCategoryResponse getById(int id);
}
