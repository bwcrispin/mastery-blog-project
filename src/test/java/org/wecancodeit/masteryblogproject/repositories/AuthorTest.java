package org.wecancodeit.masteryblogproject.repositories;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import javax.annotation.Resource;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.masteryblogproject.models.Author;


@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class AuthorTest {
	@Resource
	private TestEntityManager entityManager;
	 
	@Resource 
	private AuthorRepository authorRepo;

	@Test
	public void shouldSaveAndLoadAuthor() {
	    Author author = authorRepo.save(new Author("author"));
	 
	    entityManager.persist(author);
	    entityManager.flush(); 
	    entityManager.clear();
	    
	    Author authorFromDatabase = authorRepo.findAuthorByName("author");
	 
	    assertThat(authorFromDatabase.getAuthorName(), is("author"));
	}

}
