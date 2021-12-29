package com.personal.blog.Business.blogCategoryManager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.blog.Apis.dto.BlogCategoryRequest;
import com.personal.blog.Apis.dto.BlogCategoryResponse;
import com.personal.blog.DataAccess.hibernate.blogCategory.IDalBlogCategory;
import com.personal.blog.Entities.BlogCategory;

@Service
public class BlogCategoryManager implements IBlogCategoryManager  {
	
	private IDalBlogCategory idaBlogCategory;
	
	public BlogCategoryManager() {
		super();
	}
	
	@Autowired
	public BlogCategoryManager(IDalBlogCategory idaBlogCategory) {
		this.idaBlogCategory = idaBlogCategory;
	}


	@Override
	public void create(BlogCategoryRequest req) {
		BlogCategory category = new BlogCategory(0, req.getBlogCategoryTitle());
		idaBlogCategory.create(category);		
	}

	@Override
	public List<BlogCategoryResponse> readAll() {
		List<BlogCategory> categories = idaBlogCategory.readAll();
		List<BlogCategoryResponse> res = new ArrayList<BlogCategoryResponse>();
		categories.forEach(e->{
			res.add(new BlogCategoryResponse(e.getBlogCategoryId(), e.getBlogCategoryTitle()));
		});
		return res; 
	}

	@Override
	public void update(BlogCategoryResponse req) {
		BlogCategory category = new BlogCategory(req.getBlogCategoryId(), req.getBlogCategoryTitle());
		idaBlogCategory.update(category);		
	}

	@Override
	public void delete(BlogCategoryResponse req) {
		BlogCategory category = new BlogCategory(req.getBlogCategoryId(), req.getBlogCategoryTitle());
		idaBlogCategory.delete(category);		
	}

	@Override
	public BlogCategoryResponse getById(int id) {
		BlogCategory res = idaBlogCategory.getById(id);
		return new BlogCategoryResponse(res.getBlogCategoryId(), res.getBlogCategoryTitle());
	}

}
