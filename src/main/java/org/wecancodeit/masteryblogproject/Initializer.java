package org.wecancodeit.masteryblogproject;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.masteryblogproject.models.Author;
import org.wecancodeit.masteryblogproject.models.Genre;
import org.wecancodeit.masteryblogproject.models.Tag;
import org.wecancodeit.masteryblogproject.repositories.AuthorRepository;
import org.wecancodeit.masteryblogproject.repositories.GenreRepository;
import org.wecancodeit.masteryblogproject.repositories.PostRepository;
import org.wecancodeit.masteryblogproject.repositories.TagRepository;

@Service
public class Initializer implements CommandLineRunner{

	@Resource
	AuthorRepository authorRepo;
	
	@Resource
	GenreRepository genreRepo;
	
	@Resource
	PostRepository postRepo;
	
	@Resource
	TagRepository tagRepo;
	
	@Override
	public void run(String ...args) throws Exception {
		
		Tag tag1 = tagRepo.save(new Tag("Funny"));
		Tag tag2 = tagRepo.save(new Tag("Sad"));
		Tag tag3 = tagRepo.save(new Tag("OMG"));
		Tag tag4 = tagRepo.save(new Tag("Fabulous"));
		
		Genre genre1 = genreRepo.save(new Genre("Tech"));
		Genre genre2 = genreRepo.save(new Genre("Fashion"));
		Genre genre3 = genreRepo.save(new Genre("News"));
		Genre genre4 = genreRepo.save(new Genre("Bizzare"));
		
		Author author1 = authorRepo.save(new Author("Bill Gates"));
		Author author2 = authorRepo.save(new Author("Amelia Bedilia"));
		Author author3 = authorRepo.save(new Author("Baba O'Reilly"));
		Author author4 = authorRepo.save(new Author("Dan Homilton III"));
		
		
	}
}
