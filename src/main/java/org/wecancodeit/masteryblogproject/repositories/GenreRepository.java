package org.wecancodeit.masteryblogproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.masteryblogproject.models.Genre;
import org.wecancodeit.masteryblogproject.models.Tag;

public interface GenreRepository extends CrudRepository<Genre, Long>{
	Genre findByName(String name);

	
}
