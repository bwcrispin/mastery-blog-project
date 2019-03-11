package org.wecancodeit.masteryblogproject.controllers;

import java.time.LocalDateTime;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.masteryblogproject.models.Author;
import org.wecancodeit.masteryblogproject.models.Genre;
import org.wecancodeit.masteryblogproject.models.Post;
import org.wecancodeit.masteryblogproject.models.Tag;
import org.wecancodeit.masteryblogproject.repositories.AuthorRepository;
import org.wecancodeit.masteryblogproject.repositories.GenreRepository;
import org.wecancodeit.masteryblogproject.repositories.PostRepository;
import org.wecancodeit.masteryblogproject.repositories.TagRepository;

@Controller
//@RequestMapping("/posts")
public class PostController {

	@Resource
	AuthorRepository authorRepo;
	
	@Resource
	TagRepository tagRepo;
	
	@Resource
	GenreRepository genreRepo;
	
	@Resource
	PostRepository postRepo;
	
	@GetMapping("/posts/posts-all")
	public String getPostsAll(String post, Model model) {
		model.addAttribute("posts", postRepo.findAll());
		return "/posts/posts-all";
	}
	
	@GetMapping("/posts/{id}")
	public String getSinglePost(@PathVariable Long postId, Model model) {
		model.addAttribute("post", postRepo.findById(postId).get());
		return "/posts/post-single";
	}
	
	@PostMapping("/posts/posts-all")
	public String addPost(String title, String body, LocalDateTime date, String name, Genre genre,
			Tag  ...tags) {
		Author author = authorRepo.findAuthorByName(name);
		postRepo.save(new Post(title, body, date, author, genre, tags));
		return "redirect:/posts/posts-all";
	}
	
}
