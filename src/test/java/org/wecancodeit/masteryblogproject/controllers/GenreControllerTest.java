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
import org.wecancodeit.masteryblogproject.models.Genre;
import org.wecancodeit.masteryblogproject.models.Tag;
import org.wecancodeit.masteryblogproject.repositories.GenreRepository;
import org.wecancodeit.masteryblogproject.repositories.TagRepository;


public class GenreControllerTest {
	@InjectMocks
    private GenreController genreController;
 
    @Mock
    private GenreRepository genreRepo;
 
    @Mock
    private Genre genre;
    
	@Mock
	private Model model;
 
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void shouldAddGenreToModel() throws Exception {
        Long genreId = 1L;
        when(genreRepo.findById(genreId)).thenReturn(Optional.of(genre));
 
        genreController.getSingleGenre(genreId, model);
 
        verify(model).addAttribute("genre", genre);
    }

	
}
