package com.greenfox.akmajoros.reddit;

import com.greenfox.akmajoros.reddit.model.Post;
import com.greenfox.akmajoros.reddit.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApp implements CommandLineRunner {

	@Autowired
	PostRepository mainAppPostRepository;

	public static void main(String[] args) {
		SpringApplication.run(RedditApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Post post = new Post();
		post.setTitle("9gag");
		post.setScore(13);
		post.setHref("9gag.com");
		mainAppPostRepository.save(post);
	}
}
