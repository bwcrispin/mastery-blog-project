package org.wecancodeit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
