package com.thirutricks.my_notes.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thirutricks.my_notes.model.Notes;
import com.thirutricks.my_notes.service.NotesService;

@RestController
@RequestMapping("/api")
public class NotesController {
	
	private static final int INITIAL_PAGE = 0, MAX_RESULTS = 5;
	
	private final NotesService notesService;

	NotesController(NotesService notesService) {
        this.notesService = notesService;
    }
    
    @GetMapping("/notes")
    public Page<Notes> getNotes(@RequestParam("page") Optional<Integer> page) {
    	// Evaluate page. If requested parameter is null or less than 0 (to
        // prevent exception), return initial size. Otherwise, return value of
        // param. decreased by 1.
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
        return notesService.getNotes(PageRequest.of(evalPage, MAX_RESULTS, Sort.by("id").descending()));
       
    }

}
