package com.personal.blog.Entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="role")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true)
	private int id;
	
	@Column(name="title", unique = true)
	private String title;
	
	@Column(name="mean", unique = true)
	private String mean;

	public Role() {
		super();
	}

	public Role(int id, String title, String mean) {
		super();
		this.id = id;
		this.title = title;
		this.mean = mean;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}
	
	
	

}
