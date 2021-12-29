package com.personal.blog.DataAccess.hibernate.role;

import java.util.List;

import com.personal.blog.Entities.Role;

public interface IDalRole {
	
	void create(Role role);
	List<Role> readAll();
	void update(Role role);
	void delete(Role role);
	Role getById(int id);

}
