package org.wecancodeit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.models.Post;

public interface PostRepository extends CrudRepository<Post, Long>{

}
