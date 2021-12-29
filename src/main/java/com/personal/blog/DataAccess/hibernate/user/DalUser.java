package com.personal.blog.DataAccess.hibernate.user;

import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.personal.blog.Entities.User;

@Repository
public class DalUser implements IDalUser {
	
	private EntityManager entityManager;

	public DalUser() {
		super();
	}
	@Autowired
	public DalUser(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void create(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.save(user);		
	}

	@Override
	@Transactional
	public List<User> readAll() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from User",User.class).getResultList();
	}

	@Override
	@Transactional
	public void update(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.update(user);
	}

	@Override
	@Transactional
	public void delete(User user) {
		Session session = entityManager.unwrap(Session.class);
		User res = session.get(User.class, user.getId()); 
		session.delete(res);
	}

	@Override
	@Transactional
	public User getById(UUID id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(User.class, id);
	}

}
