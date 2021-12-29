package com.personal.blog.Apis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.personal.blog.Apis.dto.BlogCategoryRequest;
import com.personal.blog.Apis.dto.BlogCategoryResponse;
import com.personal.blog.Business.blogCategoryManager.IBlogCategoryManager;

@RestController
@RequestMapping("/api/blogcategories")
public class BlogCategoryController {
	
	private IBlogCategoryManager blogCategoryManager;

	
	public BlogCategoryController() {
		super();
	}
	@Autowired
	public BlogCategoryController(IBlogCategoryManager blogCategoryManager) {
		super();
		this.blogCategoryManager = blogCategoryManager;
	}
	
	@GetMapping("/categories")
	@ResponseStatus(code = HttpStatus.FOUND)
	public List<BlogCategoryResponse> getAll(){
		return blogCategoryManager.readAll();
	}
	
	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void create(@RequestBody BlogCategoryRequest category) {
		blogCategoryManager.create(category);
	}
	
	@DeleteMapping("/delete")
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public void delete(@RequestBody BlogCategoryResponse category) {
		blogCategoryManager.delete(category);
	}
	
	@PutMapping("/update")
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public void update(@RequestBody BlogCategoryResponse category) {
		blogCategoryManager.update(category);
	}
	
	@GetMapping("/category/{id}")
	@ResponseStatus(code=HttpStatus.FOUND)
	public BlogCategoryResponse getById(@PathVariable int id) {
		return blogCategoryManager.getById(id);
	}

}
