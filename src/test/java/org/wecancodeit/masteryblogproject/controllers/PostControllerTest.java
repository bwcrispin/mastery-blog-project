package org.wecancodeit.masteryblogproject.controllers;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.wecancodeit.masteryblogproject.models.Post;
import org.wecancodeit.masteryblogproject.models.Tag;
import org.wecancodeit.masteryblogproject.repositories.PostRepository;
import org.wecancodeit.masteryblogproject.repositories.TagRepository;

public class PostControllerTest {
	@InjectMocks
    private PostController postController;
 
    @Mock
    private PostRepository postRepo;
 
    @Mock
    private Post post;
    
	@Mock
	private Model model;
 
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void shouldAddPostToModel() throws Exception {
        Long postId = 1L;
        when(postRepo.findById(postId)).thenReturn(Optional.of(post));
 
        postController.getSinglePost(postId, model);
 
        verify(model).addAttribute("post", post);
    }

	
	
}
