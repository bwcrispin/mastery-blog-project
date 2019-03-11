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
	private Long authorId;
	private String authorName;
	
	@ManyToMany(mappedBy="authors")
	private Collection<Post> posts;
	
	
	public Author(String authorName) {
		this.authorName = authorName;
	}
	
	public Author() {}

	public Long getAuthorId() {
		return authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public Collection<Post> getPosts() {
		return posts;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", posts=" + posts + "]";
	}
	
	
	

}
