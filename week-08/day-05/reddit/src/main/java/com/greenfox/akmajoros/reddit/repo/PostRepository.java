package com.greenfox.akmajoros.reddit.repo;

import com.greenfox.akmajoros.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long> {
}
