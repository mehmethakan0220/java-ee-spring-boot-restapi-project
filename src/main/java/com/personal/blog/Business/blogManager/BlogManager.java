package com.personal.blog.Business.blogManager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.blog.Apis.dto.BlogRequest;
import com.personal.blog.Apis.dto.BlogResponse;
import com.personal.blog.DataAccess.hibernate.blog.IDalBlog;
import com.personal.blog.Entities.Blog;


@Service
public class BlogManager implements IBlogManager {
	
	private IDalBlog iDalBlog;

	public BlogManager() {
		super();
	}

	@Autowired
	public BlogManager(IDalBlog iDalBlog) {
		this.iDalBlog = iDalBlog;
	}

	@Override
	public void create(BlogRequest req) {
		Blog blog = new Blog(0, req.getBlogUserId(), req.getBlogTitle(), req.getBlogCategory(), req.getBlogContent(), req.getBlogDescription());
		iDalBlog.create(blog);
	}

	@Override
	public List<BlogResponse> readAll() {
		List<Blog> blogs = iDalBlog.readAll();
		List<BlogResponse> res = new ArrayList<BlogResponse>();
		blogs.forEach(e->{
			res.add(new BlogResponse(e.getBlogId(), e.getBlogUserId(), e.getBlogTitle(), e.getBlogCategory(), e.getBlogContent(), e.getBlogDescription()));
		});
		return res;
	}

	@Override
	public void update(BlogResponse req) {
		Blog blog = new Blog(req.getBlogId(), req.getBlogUserId(), req.getBlogTitle(), req.getBlogCategory(), req.getBlogContent(), req.getBlogDescription());
		iDalBlog.update(blog);
	}

	@Override
	public void delete(BlogResponse req) {
		Blog blog = new Blog(req.getBlogId(), req.getBlogUserId(), req.getBlogTitle(), req.getBlogCategory(), req.getBlogContent(), req.getBlogDescription());
		iDalBlog.delete(blog);
	}

	@Override
	public BlogResponse getById(int id) {
		Blog blog = iDalBlog.getById(id);
		return new BlogResponse(blog.getBlogId(), blog.getBlogUserId(), blog.getBlogTitle(), blog.getBlogCategory(), blog.getBlogContent(), blog.getBlogDescription());
	}
	
	
	

}
