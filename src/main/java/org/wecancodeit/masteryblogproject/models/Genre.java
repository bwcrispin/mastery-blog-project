package org.wecancodeit.masteryblogproject.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	@Id
	@GeneratedValue
	private Long genreId;
	private String genreName;
	
	@OneToMany(mappedBy="genre")
	private Collection<Post> posts;
	
	
	public Genre() {}
	
	public Genre(String genreName) {
		this.genreName = genreName;
	}

	public Long getGenreId() {
		return genreId;
	}

	public String getGenreName() {
		return genreName;
	}

	public Collection<Post> getPosts() {
		return posts;
	}

	@Override
	public String toString() {
		return "Genre [genreId=" + genreId + ", genreName=" + genreName + "]";
	}



}
