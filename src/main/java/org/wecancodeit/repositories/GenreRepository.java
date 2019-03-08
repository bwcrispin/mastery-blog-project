package org.wecancodeit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.models.Genre;

public interface GenreRepository extends CrudRepository<Genre, Long>{

}
