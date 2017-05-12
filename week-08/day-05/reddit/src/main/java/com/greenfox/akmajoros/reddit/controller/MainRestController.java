package com.greenfox.akmajoros.reddit.controller;

import com.greenfox.akmajoros.reddit.model.Post;
import com.greenfox.akmajoros.reddit.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class MainRestController {

  @Autowired
  PostRepository postRepository;

  @RequestMapping(value = "/post")
  public Iterable<Post> postFunction() {
    return postRepository.findAll();
  }

  @PostMapping(value = "/post")
  public Post addPost(@RequestBody Post post) {
    post.setTimestamp(new Timestamp(System.currentTimeMillis()));
    return postRepository.save(post);
  }

  @PutMapping (value = "/post/{id}/upvote")
  public Post upVotePost(@PathVariable(value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.upVote();
    postRepository.save(post);

    return post;
  }

  @PutMapping (value = "/post/{id}/downvote")
  public Post downVotePost(@PathVariable(value = "id") long id) {
    Post post = postRepository.findOne(id);
    post.downVote();
    postRepository.save(post);

    return post;
  }
}
