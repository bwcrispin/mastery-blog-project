package org.wecancodeit.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Collection<Post> posts;
	
	public Tag() {}
	
	public Tag(String name, Collection<Post> posts) {
		this.name = name;
		this.posts = posts;
	}

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
		return "Tag [id=" + id + ", name=" + name + ", posts=" + posts + "]";
	}
	
	
}
