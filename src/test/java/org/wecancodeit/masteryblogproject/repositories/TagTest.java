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
import org.wecancodeit.masteryblogproject.models.Tag;
import org.wecancodeit.masteryblogproject.repositories.TagRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class TagTest {
	
	@Resource
	private TestEntityManager entityManager;
	 
	@Resource 
	private TagRepository tagRepo;

	@Test
	public void shouldSaveAndLoadTag() {
	    Tag tag = tagRepo.save(new Tag("FakeNews"));
	 
	    entityManager.persist(tag);
	    entityManager.flush(); 
	    entityManager.clear();
	    
	    Tag tagFromDatabase = tagRepo.findByName("FakeNews");
	 
	    assertThat(tagFromDatabase.getTagName(), is("FakeNews"));
	}
}