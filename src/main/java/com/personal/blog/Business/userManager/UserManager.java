package com.personal.blog.Business.userManager;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.blog.Apis.dto.UserRequest;
import com.personal.blog.Apis.dto.UserResponse;
import com.personal.blog.DataAccess.hibernate.user.IDalUser;
import com.personal.blog.Entities.User;


@Service
public class UserManager implements IUserManager{

	private IDalUser iDalUser;
	
	public UserManager() {
		super();
	}
	
	@Autowired
	public UserManager(IDalUser iDalUser) {
		this.iDalUser = iDalUser;
	}

	@Override
	public void create(UserRequest req) {
		User user = new User(null, req.getRoleId(), req.getFullName(), req.getNick(), req.getEmail(), req.getDob(), req.getLocation());
		iDalUser.create(user);
	}

	@Override
	public List<UserResponse> readAll() {
		List<User> users = iDalUser.readAll();
		List<UserResponse> responselist = new ArrayList<UserResponse>();
		users.forEach((e)->{
			responselist.add(new UserResponse(e.getId(), e.getRoleId(), e.getFullName(), e.getNick(), e.getEmail(), e.getDob(), e.getLocation()));
		});
		return responselist;
	}

	@Override
	public void update(UserResponse req) {
		User user = new User(req.getId(), req.getRoleId(), req.getFullName(), req.getNick(), req.getEmail(), req.getDob(), req.getLocation());
		iDalUser.update(user);
	}

	@Override
	public void delete(UserResponse req) {
		User user = new User(req.getId(), req.getRoleId(), req.getFullName(), req.getNick(), req.getEmail(), req.getDob(), req.getLocation());
		iDalUser.delete(user);		
	}

	@Override
	public UserResponse getById(UUID id) {
		User user = iDalUser.getById(id);
		UserResponse userResponse = new UserResponse(user.getId(), user.getRoleId(), user.getFullName(), user.getNick(), user.getEmail(), user.getDob(), user.getLocation());
		return userResponse;
	}
	
}
