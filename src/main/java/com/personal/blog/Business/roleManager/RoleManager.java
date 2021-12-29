package com.personal.blog.Business.roleManager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.blog.Apis.dto.RoleRequest;
import com.personal.blog.Apis.dto.RoleResponse;
import com.personal.blog.DataAccess.hibernate.role.IDalRole;
import com.personal.blog.Entities.Role;


@Service
public class RoleManager implements IRoleManager {
	
	private IDalRole iDalRole;

	public RoleManager() {
		super();
	}

	@Autowired
	public RoleManager(IDalRole idaDalRole) {
		this.iDalRole = idaDalRole;
	}

	@Override
	public void create(RoleRequest req) {
		Role role = new Role(0, req.getTitle(), req.getMean());
		iDalRole.create(role);		
	}

	@Override
	public List<RoleResponse> readAll() {
		List<Role> roles = iDalRole.readAll();
		List<RoleResponse> responseList = new ArrayList<RoleResponse>();
		roles.forEach((e)->{
			responseList.add(new RoleResponse(e.getId(), e.getTitle(), e.getMean()));
		});
		return responseList;
	}

	@Override
	public void update(RoleResponse req) {
		Role role = new Role(req.getId(), req.getTitle(), req.getMean());
		iDalRole.update(role);
	}

	@Override
	public void delete(RoleResponse req) {
		Role role = new Role(req.getId(), req.getTitle(), req.getMean());
		iDalRole.delete(role);		
	}

	@Override
	public RoleResponse getById(int id) {
		Role role = iDalRole.getById(id);
		RoleResponse res = new RoleResponse(role.getId(), role.getTitle(), role.getMean());
		return res;
	}

}
