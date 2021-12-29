package com.personal.blog.DataAccess.hibernate.blog;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.personal.blog.Entities.Blog;



@Repository
public class DalBlog implements IDalBlog{

	
	private EntityManager entityManager;
	
	public DalBlog() {
		super();
	}
	@Autowired
	public DalBlog(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void create(Blog blog) {
		Session session = entityManager.unwrap(Session.class);
		session.save(blog);
	}

	@Override
	@Transactional
	public List<Blog> readAll() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Blog",Blog.class).getResultList();
	}

	@Override
	@Transactional
	public void update(Blog blog) {
		Session session = entityManager.unwrap(Session.class);
		session.update(blog);
	}

	@Override
	@Transactional
	public void delete(Blog blog) {
		Session session = entityManager.unwrap(Session.class);
		Blog res = session.get(Blog.class, blog.getBlogId());
		session.delete(res);
	}

	@Override
	@Transactional
	public Blog getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(Blog.class, id);
	}

}
