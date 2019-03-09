package org.wecancodeit.masteryblogproject.controllers;

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
@RequestMapping("/authors")
public class AuthorController {

	@Resource
	AuthorRepository authorRepo;

	// maps html page of all authors
	@GetMapping("/all")
	public String getAuthorsAll(String author, Model model) {
		model.addAttribute("authors", authorRepo.findAll());
		return "authors-all";
	}

	// add new author
	@PostMapping("/all")

	public String addAuthor(String name) {
		authorRepo.save(new Author(name));
		return "redirect:/authors";
	}

	// maps html for one author by id
	@GetMapping("/author/{id}")
	public String getSingleAuthor(@PathVariable Long id, Model model) {
		model.addAttribute("author", authorRepo.findById(id).get());
		return "author-single";
	}
}

