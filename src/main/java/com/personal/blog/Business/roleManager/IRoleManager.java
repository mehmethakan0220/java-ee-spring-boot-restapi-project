package com.personal.blog.Business.roleManager;

import java.util.List;

import com.personal.blog.Apis.dto.RoleRequest;
import com.personal.blog.Apis.dto.RoleResponse;


public interface IRoleManager {
	
	void create(RoleRequest role);
	List<RoleResponse> readAll();
	void update(RoleResponse role);
	void delete(RoleResponse role);
	RoleResponse getById(int id);

}
