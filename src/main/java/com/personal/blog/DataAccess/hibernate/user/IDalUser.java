package com.personal.blog.DataAccess.hibernate.user;

import java.util.List;
import java.util.UUID;

import com.personal.blog.Entities.User;


public interface IDalUser {

	
	void create(User user);
	List<User> readAll();
	void update(User user);
	void delete(User user);
	User getById(UUID id);
}
