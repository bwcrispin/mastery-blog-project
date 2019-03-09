package org.wecancodeit.models;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	@Lob
	private String body;
	private LocalDateTime date;
	
	@ManyToMany(mappedBy="posts")
	private Collection<Author> authors;
	
	@ManyToOne
	private Genre genre;
	
	@ManyToMany(mappedBy="posts")
	private Collection<Tag> tags;
	
	//LocalDateTime may be autogenerated?
	public Post(String title, String body, LocalDateTime date, Author authors, Genre genre,
			Tag  ...tags) {
		super();
		this.title = title;
		this.body = body;
		this.date = date;
		this.authors = Arrays.asList(authors);
		this.genre = genre;
		this.tags = Arrays.asList(tags);
	}
	
	public Post() {}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getBody() {
		return body;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public Collection<Author> getAuthors() {
		return authors;
	}

	public Genre getGenre() {
		return genre;
	}

	public Collection<Tag> getTags() {
		return tags;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", date=" + date + ", authors=" + authors
				+ ", genre=" + genre + ", tags=" + tags + "]";
	}

	
	
	
}
