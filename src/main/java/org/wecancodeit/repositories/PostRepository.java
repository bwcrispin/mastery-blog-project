package org.wecancodeit.repositories;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.models.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

	Collection<Post> findByTagId(String tagId);
}
