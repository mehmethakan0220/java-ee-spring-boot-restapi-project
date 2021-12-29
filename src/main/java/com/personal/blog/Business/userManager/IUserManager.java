package com.personal.blog.Business.userManager;

import java.util.List;
import java.util.UUID;

import com.personal.blog.Apis.dto.UserRequest;
import com.personal.blog.Apis.dto.UserResponse;

public interface IUserManager {

	
	void create(UserRequest user);
	List<UserResponse> readAll();
	void update(UserResponse user);
	void delete(UserResponse user);
	UserResponse getById(UUID id);
}
