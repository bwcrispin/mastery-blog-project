package org.wecancodeit.masteryblogproject.repositories;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.masteryblogproject.models.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

//	Collection<Post> findByTagId(String tagId);
}
