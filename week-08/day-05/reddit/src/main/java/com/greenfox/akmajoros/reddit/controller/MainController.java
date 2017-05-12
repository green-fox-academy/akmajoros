package com.greenfox.akmajoros.reddit.controller;

import com.greenfox.akmajoros.reddit.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

  @Autowired
  PostRepository postRepository;
}
