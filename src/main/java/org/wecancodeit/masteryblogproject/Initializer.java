package org.wecancodeit.masteryblogproject;

import java.time.LocalDateTime;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.masteryblogproject.models.Author;
import org.wecancodeit.masteryblogproject.models.Genre;
import org.wecancodeit.masteryblogproject.models.Post;
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
		
		Post post1 = postRepo.save(new Post("blog title", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut condimentum mi non velit tincidunt, eget tristique ante faucibus. Praesent rhoncus est sit amet elit fringilla suscipit. Sed condimentum euismod lorem pharetra malesuada. Praesent eget venenatis risus. Sed lobortis, nisl quis posuere mollis, lorem nisl imperdiet ex, sit amet tempor sem ligula quis nulla. Nam nulla diam, fringilla in turpis vel, faucibus blandit turpis. Aliquam congue metus a tortor viverra lobortis. Etiam sagittis in leo id dignissim. Nunc quis feugiat massa. Sed sit amet erat sagittis, ornare augue ac, mollis augue. Maecenas non odio eget nibh mattis euismod cursus hendrerit metus. Vestibulum ante mauris, mattis at ullamcorper eget, iaculis eu odio. Duis scelerisque nunc mauris, sed maximus sem dignissim a. Donec tempor, dui rhoncus pulvinar tristique, turpis risus suscipit nunc, vel finibus elit mi at nisl. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.", LocalDateTime.now(), author1, genre1, tag1));
		Post post2 = postRepo.save(new Post("blog title Two", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut condimentum mi non velit tincidunt, eget tristique ante faucibus. Praesent rhoncus est sit amet elit fringilla suscipit. Sed condimentum euismod lorem pharetra malesuada. Praesent eget venenatis risus. Sed lobortis, nisl quis posuere mollis, lorem nisl imperdiet ex, sit amet tempor sem ligula quis nulla. Nam nulla diam, fringilla in turpis vel, faucibus blandit turpis. Aliquam congue metus a tortor viverra lobortis. Etiam sagittis in leo id dignissim. Nunc quis feugiat massa. Sed sit amet erat sagittis, ornare augue ac, mollis augue. Maecenas non odio eget nibh mattis euismod cursus hendrerit metus. Vestibulum ante mauris, mattis at ullamcorper eget, iaculis eu odio. Duis scelerisque nunc mauris, sed maximus sem dignissim a. Donec tempor, dui rhoncus pulvinar tristique, turpis risus suscipit nunc, vel finibus elit mi at nisl. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.", LocalDateTime.now(), author2, genre2, tag2));
		Post post3 = postRepo.save(new Post("blog title Three", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut condimentum mi non velit tincidunt, eget tristique ante faucibus. Praesent rhoncus est sit amet elit fringilla suscipit. Sed condimentum euismod lorem pharetra malesuada. Praesent eget venenatis risus. Sed lobortis, nisl quis posuere mollis, lorem nisl imperdiet ex, sit amet tempor sem ligula quis nulla. Nam nulla diam, fringilla in turpis vel, faucibus blandit turpis. Aliquam congue metus a tortor viverra lobortis. Etiam sagittis in leo id dignissim. Nunc quis feugiat massa. Sed sit amet erat sagittis, ornare augue ac, mollis augue. Maecenas non odio eget nibh mattis euismod cursus hendrerit metus. Vestibulum ante mauris, mattis at ullamcorper eget, iaculis eu odio. Duis scelerisque nunc mauris, sed maximus sem dignissim a. Donec tempor, dui rhoncus pulvinar tristique, turpis risus suscipit nunc, vel finibus elit mi at nisl. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.", LocalDateTime.now(), author3, genre3, tag3));
		Post post4 = postRepo.save(new Post("blog title Four", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut condimentum mi non velit tincidunt, eget tristique ante faucibus. Praesent rhoncus est sit amet elit fringilla suscipit. Sed condimentum euismod lorem pharetra malesuada. Praesent eget venenatis risus. Sed lobortis, nisl quis posuere mollis, lorem nisl imperdiet ex, sit amet tempor sem ligula quis nulla. Nam nulla diam, fringilla in turpis vel, faucibus blandit turpis. Aliquam congue metus a tortor viverra lobortis. Etiam sagittis in leo id dignissim. Nunc quis feugiat massa. Sed sit amet erat sagittis, ornare augue ac, mollis augue. Maecenas non odio eget nibh mattis euismod cursus hendrerit metus. Vestibulum ante mauris, mattis at ullamcorper eget, iaculis eu odio. Duis scelerisque nunc mauris, sed maximus sem dignissim a. Donec tempor, dui rhoncus pulvinar tristique, turpis risus suscipit nunc, vel finibus elit mi at nisl. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.", LocalDateTime.now(), author4, genre4, tag4));

		
	}
}
