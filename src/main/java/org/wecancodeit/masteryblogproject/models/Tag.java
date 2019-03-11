package org.wecancodeit.masteryblogproject.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	@Id
	@GeneratedValue
	private Long tagId;
	private String tagName;
	
	@ManyToMany(mappedBy="tags")
	private Collection<Post> posts;
	
	public Tag() {}
	
	public Tag(String tagName) {
		this.tagName = tagName;
	}

	public Long getTagId() {
		return tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public Collection<Post> getPosts() {
		return posts;
	}

	@Override
	public String toString() {
		return "Tag [tagId=" + tagId + ", tagName=" + tagName + "]";
	}
	
	
}
