package com.personal.blog.DataAccess.hibernate.blogCategory;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.personal.blog.Entities.BlogCategory;


	
@Repository
public class DalBlogCategory implements IDalBlogCategory {
	
	private EntityManager entityManager;

	public DalBlogCategory() {
		super();
	}
	
	@Autowired
	public DalBlogCategory(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


	@Override
	@Transactional
	public void create(BlogCategory category) {
		Session session = entityManager.unwrap(Session.class);
		session.save(category);
	}

	@Override
	@Transactional
	public List<BlogCategory> readAll() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from BlogCategory",BlogCategory.class).getResultList();
	}

	@Override
	@Transactional
	public void update(BlogCategory category) {
		Session session = entityManager.unwrap(Session.class);
		BlogCategory res = session.get(BlogCategory.class, category.getBlogCategoryId());
		res.setBlogCategoryTitle(category.getBlogCategoryTitle());
		System.out.println(res.getBlogCategoryId());
		System.out.println(res.getBlogCategoryTitle());
		session.update(res);
	}

	@Override
	@Transactional
	public void delete(BlogCategory category) {
		Session session = entityManager.unwrap(Session.class);
		BlogCategory bc = session.get(BlogCategory.class, category.getBlogCategoryId());
		session.delete(bc);
	}

	@Override
	@Transactional
	public BlogCategory getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(BlogCategory.class, id);
	}
	

}
