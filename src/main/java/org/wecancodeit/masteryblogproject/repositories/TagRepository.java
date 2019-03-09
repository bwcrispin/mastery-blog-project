package org.wecancodeit.masteryblogproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.masteryblogproject.models.Tag;

public interface TagRepository extends CrudRepository<Tag, Long>{

	Tag findByName(String name);

}
