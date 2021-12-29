package com.personal.blog.Apis.controllers;

import java.util.List;
import java.util.UUID;

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

import com.personal.blog.Apis.dto.UserRequest;
import com.personal.blog.Apis.dto.UserResponse;
import com.personal.blog.Business.userManager.IUserManager;

@RestController
@RequestMapping("api/users")
public class UserController {

	private IUserManager iUserManager;

	public UserController() {
		super();
	}
	
	@Autowired
	public UserController(IUserManager iUserManager) {
		super();
		this.iUserManager = iUserManager;
	}
	
	@GetMapping("/users")
	@ResponseStatus(code=HttpStatus.FOUND)
	public List<UserResponse> getAll(){
		return iUserManager.readAll();
	}
	
	@PostMapping("/create")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(@RequestBody UserRequest req) {
		iUserManager.create(req);
	}
	
	
	@PutMapping("/update")
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public void update(@RequestBody UserResponse req) {
		iUserManager.update(req);
	}
	
	@DeleteMapping("/delete")
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public void delete(@RequestBody UserResponse req) {
		iUserManager.delete(req);
	}
	
	@GetMapping("/user/{id}")
	@ResponseStatus(code=HttpStatus.FOUND)
	public UserResponse getById(@PathVariable UUID id) {
		return iUserManager.getById(id);
	}
	
}
