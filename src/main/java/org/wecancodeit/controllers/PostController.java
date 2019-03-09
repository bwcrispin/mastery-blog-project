package org.wecancodeit.controllers;

import java.time.LocalDateTime;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.models.Author;
import org.wecancodeit.models.Genre;
import org.wecancodeit.models.Post;
import org.wecancodeit.models.Tag;
import org.wecancodeit.repositories.AuthorRepository;
import org.wecancodeit.repositories.GenreRepository;
import org.wecancodeit.repositories.PostRepository;
import org.wecancodeit.repositories.TagRepository;

@Controller
@RequestMapping("/posts")
public class PostController {

	@Resource
	AuthorRepository authorRepo;
	
	@Resource
	TagRepository tagRepo;
	
	@Resource
	GenreRepository genreRepo;
	
	@Resource
	PostRepository postRepo;
	
	@GetMapping("/all")
	public String getPostsAll(String post, Model model) {
		model.addAttribute("posts", postRepo.findAll());
		return "/posts-all";
	}
	
	@GetMapping("/post/{id}")
	public String getSinglePost(@PathVariable Long id, Model model) {
		model.addAttribute("post", postRepo.findById(id).get());
		return "post-single";
	}
	
	@PostMapping("all/")
	public String addPost(String title, String body, LocalDateTime date, Author authors, Genre genre,
			Tag  ...tags) {
		postRepo.save(new Post(title, body, date, authors, genre, tags));
		return "redirect:/posts-all";
	}
	
}
