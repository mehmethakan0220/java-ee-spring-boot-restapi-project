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

import com.personal.blog.Apis.dto.*;
import com.personal.blog.Business.blogManager.IBlogManager;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {
	
	private IBlogManager iBlogManager;

	
	public BlogController() {
		super();
	}

	
	@Autowired
	public BlogController(IBlogManager iBlogManager) {
		this.iBlogManager = iBlogManager;
	}

	@GetMapping("/blogs")
	@ResponseStatus(code = HttpStatus.FOUND)
	public List<BlogResponse> getAll(){
		return iBlogManager.readAll();
	}
	
	@PostMapping("/create")	
	@ResponseStatus(code = HttpStatus.CREATED)
	public void create(@RequestBody BlogRequest req) {
		 iBlogManager.create(req);
	}
	
	@PutMapping("/update")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void update(@RequestBody BlogResponse req) {
		iBlogManager.update(req);
	}
	
	@DeleteMapping("/delete")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void delete(@RequestBody BlogResponse req) {
		iBlogManager.delete(req);
	}
	
	@GetMapping("/blog/{id}")
	@ResponseStatus(code = HttpStatus.FOUND)
	public BlogResponse getById(@PathVariable int id) {
		return iBlogManager.getById(id);
	}
	
	
	
	
	
}
