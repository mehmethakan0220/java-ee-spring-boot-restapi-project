package com.personal.blog.DataAccess.hibernate.role;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.personal.blog.Entities.Role;


@Repository
public class DalRole implements IDalRole{
	
	private EntityManager entityManager;

	
	
	public DalRole() {
		super();
	}
	@Autowired
	public DalRole(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void create(Role role) {
		Session session = entityManager.unwrap(Session.class);
		session.save(role);		
	}

	@Override
	@Transactional
	public List<Role> readAll() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Role",Role.class).getResultList();
	}

	@Override
	@Transactional
	public void update(Role role) {
		Session session = entityManager.unwrap(Session.class);
		session.update(role);
	}

	@Override
	@Transactional
	public void delete(Role role) {
		Session session = entityManager.unwrap(Session.class);
		Role r = session.get(Role.class, role.getId());
		session.delete(r);
	}

	@Override
	@Transactional
	public Role getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(Role.class, id);
	}

}
