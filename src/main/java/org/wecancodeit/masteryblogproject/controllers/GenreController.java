package org.wecancodeit.masteryblogproject.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.masteryblogproject.models.Genre;
import org.wecancodeit.masteryblogproject.repositories.GenreRepository;

@Controller
//@RequestMapping("/genres")
public class GenreController {
	
	@Resource
	GenreRepository genreRepo;
	
	// maps html page of all genres
	@GetMapping("/genres/genres-all")
	public String getGenresAll(String genre, Model model) {
		model.addAttribute("genres", genreRepo.findAll());
		return "/genres/genres-all";
	}

	// add new genre
	@PostMapping("/genres/genres-all")
	public String addGenre(String name) {
		genreRepo.save(new Genre(name));
		return "redirect:/genres/genres-all";
	}

	// maps html for one genre by id
	@GetMapping("/genres/{id}")
	public String getSingleGenre(@PathVariable Long genreId, Model model) {
		model.addAttribute("genre", genreRepo.findById(genreId).get());
		return "/genres/genre-single";
	}

}
