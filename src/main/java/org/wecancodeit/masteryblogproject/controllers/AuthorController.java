package org.wecancodeit.masteryblogproject.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.masteryblogproject.models.Author;
import org.wecancodeit.masteryblogproject.repositories.AuthorRepository;

@Controller
//@RequestMapping("/authors")
public class AuthorController {

	@Resource
	AuthorRepository authorRepo;


	// maps html page of all authors
	@GetMapping("/authors/authors-all")
	public String getAuthorsAll(String author, Model model) {
		model.addAttribute("authors", authorRepo.findAll());
		return "/authors/authors-all";
	}

	// add new author
	@PostMapping("/authors/authors-all")
	public String addAuthor(String authorName) {
		authorRepo.save(new Author(authorName));
		return "redirect:/authors/authors-all";
	}

	// maps html for one author by id
	@GetMapping("/author/{authorId}")
	public String getSingleAuthor(@PathVariable Long authorId, Model model) {
		model.addAttribute("author", authorRepo.findById(authorId).get());
		return "/authors/author-single";
	}
}

