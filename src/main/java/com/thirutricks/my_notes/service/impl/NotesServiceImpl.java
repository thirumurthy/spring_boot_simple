package com.thirutricks.my_notes.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.thirutricks.my_notes.model.Notes;
import com.thirutricks.my_notes.repository.NotesRepository;
import com.thirutricks.my_notes.service.NotesService;

@Service
public class NotesServiceImpl implements NotesService {
	
	private final NotesRepository notesRepository;


	@Autowired
    public NotesServiceImpl(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
    }
	 
	@Override
	public Optional<Notes> findById(Long id) {
		return notesRepository.findById(id);
	}

	@Override
	public Page<Notes> getNotes(Pageable pageable) {
		 return notesRepository.findAll(pageable);
	}

}
