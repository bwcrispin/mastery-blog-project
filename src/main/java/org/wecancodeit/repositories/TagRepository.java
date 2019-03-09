package org.wecancodeit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.models.Tag;

public interface TagRepository extends CrudRepository<Tag, Long>{

	Tag findByName(String name);

}
