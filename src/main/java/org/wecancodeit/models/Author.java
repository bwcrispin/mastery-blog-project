package org.wecancodeit.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Author {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Collection<Post> posts;
	
	public Author(String name, Collection<Post> posts) {
		this.name = name;
		this.posts = posts;
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
