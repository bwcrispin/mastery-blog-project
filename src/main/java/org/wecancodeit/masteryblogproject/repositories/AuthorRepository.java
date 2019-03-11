package org.wecancodeit.masteryblogproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.masteryblogproject.models.Author;
import org.wecancodeit.masteryblogproject.models.Tag;

public interface AuthorRepository extends CrudRepository<Author, Long>{
	//Author findAuthorByName(String name);
}
