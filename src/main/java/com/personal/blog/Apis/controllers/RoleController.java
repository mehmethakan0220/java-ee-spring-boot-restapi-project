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

import com.personal.blog.Apis.dto.RoleRequest;
import com.personal.blog.Apis.dto.RoleResponse;
import com.personal.blog.Business.roleManager.IRoleManager;

@RestController
@RequestMapping("api/role")
public class RoleController {

	private IRoleManager iRoleManager;

	public RoleController() {
		super();
	}

	@Autowired
	public RoleController(IRoleManager iRoleManager) {
		super();
		this.iRoleManager = iRoleManager;
	}
	
	@GetMapping("/roles")
	@ResponseStatus(code=HttpStatus.FOUND)
	public List<RoleResponse> getAll(){
		return iRoleManager.readAll();
	}
	
	@PostMapping("/create")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void create(@RequestBody RoleRequest req) {
		iRoleManager.create(req);
	}
	
	@PutMapping("/update")
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public void update(@RequestBody RoleResponse req) {
		iRoleManager.update(req);
	}
	
	@DeleteMapping("/delete")
	@ResponseStatus(code=HttpStatus.ACCEPTED)
	public void delete(@RequestBody RoleResponse req) {
		iRoleManager.delete(req);
	}
	
	@GetMapping("/role/{id}")
	@ResponseStatus(code=HttpStatus.FOUND)
	public RoleResponse getById(@PathVariable int id) {
		return iRoleManager.getById(id);
	}
	
}
