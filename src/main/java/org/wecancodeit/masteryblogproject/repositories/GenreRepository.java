package org.wecancodeit.masteryblogproject.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.masteryblogproject.models.Genre;
import org.wecancodeit.masteryblogproject.models.Post;
import org.wecancodeit.masteryblogproject.models.Tag;

public interface GenreRepository extends CrudRepository<Genre, Long>{
	//Genre findGenreByName(String genreName);

	
}
