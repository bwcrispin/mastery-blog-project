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
import org.wecancodeit.masteryblogproject.models.Tag;
import org.wecancodeit.masteryblogproject.repositories.TagRepository;


public class TagControllerTest {
	@InjectMocks
    private TagController tagController;
 
    @Mock
    private TagRepository tagRepo;
 
    @Mock
    private Tag tag;
    
	@Mock
	private Model model;
 
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void shouldAddTagToModel() throws Exception {
        Long tagId = 1L;
        when(tagRepo.findById(tagId)).thenReturn(Optional.of(tag));
 
        tagController.getSingleTag(tagId, model);
 
        verify(model).addAttribute("tag", tag);
    }

}
