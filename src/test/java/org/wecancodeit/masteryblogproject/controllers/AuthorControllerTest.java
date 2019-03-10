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
import org.wecancodeit.masteryblogproject.models.Author;
import org.wecancodeit.masteryblogproject.models.Tag;
import org.wecancodeit.masteryblogproject.repositories.AuthorRepository;
import org.wecancodeit.masteryblogproject.repositories.TagRepository;

public class AuthorControllerTest {
	@InjectMocks
    private AuthorController authorController;
 
    @Mock
    private AuthorRepository authorRepo;
 
    @Mock
    private Author author;
    
	@Mock
	private Model model;
 
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void shouldAddAuthorToModel() throws Exception {
        Long authorId = 1L;
        when(authorRepo.findById(authorId)).thenReturn(Optional.of(author));
 
        authorController.getSingleAuthor(authorId, model);
 
        verify(model).addAttribute("author", author);
    }


}
