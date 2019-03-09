package org.wecancodeit.masteryblogproject.repositories;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.annotation.Resource;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.masteryblogproject.models.Author;
import org.wecancodeit.masteryblogproject.models.Genre;
import org.wecancodeit.masteryblogproject.models.Post;
import org.wecancodeit.masteryblogproject.models.Tag;


@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class PostTest {
	@Resource
	private TestEntityManager entityManager;
	 
	@Resource 
	private PostRepository postRepo;

	@Test
	public void shouldSaveAndLoadPost() {
		Genre genre = new Genre("genre");
	    Post post = postRepo.save(new Post("title", "body", LocalDateTime.now(), new Author("authors"), genre,
				new Tag("tags")));
	 
	    entityManager.persist(post);
	    entityManager.persist(genre);
	    entityManager.flush(); 
	    entityManager.clear();
	    
	    Post postFromDatabase = postRepo.findByTitle("title");
	 
	    assertThat(postFromDatabase.getTitle(), is("title"));
	}

}
