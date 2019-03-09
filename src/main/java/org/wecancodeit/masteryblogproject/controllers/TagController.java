package org.wecancodeit.masteryblogproject.controllers;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.masteryblogproject.models.Tag;
import org.wecancodeit.masteryblogproject.repositories.PostRepository;
import org.wecancodeit.masteryblogproject.repositories.TagRepository;

@Controller
//@RequestMapping("/tags")
public class TagController {
	
	@Resource
	TagRepository tagRepo;
	
	@Resource
	PostRepository postRepo;
	
	@GetMapping("/tags/tags-all")
	public String getTagsAll(String tag, Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "/tags/tags-all";
	}

	// add new tag
	@PostMapping("/tags/tags-all")
	public String addTag(String name) {
		tagRepo.save(new Tag(name));
		return "redirect:/tags/tags-all";	
	}

	// maps html for one tag by id
	@GetMapping("/tag/{id}")
	public String getSingleTag(@PathVariable Long tagId, Model model) {
		model.addAttribute("tag", tagRepo.findById(tagId).get());
		return "/tags/tag-single";
	}
}
