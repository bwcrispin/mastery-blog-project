package org.wecancodeit.masteryblogproject.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Author {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	@ManyToMany(mappedBy="authors")
	private Collection<Post> posts;
	
	
	public Author(String name) {
		this.name = name;
	}
	
	public Author() {}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Post> getPosts() {
		return posts;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", posts=" + posts + "]";
	}
	
	
	

}
