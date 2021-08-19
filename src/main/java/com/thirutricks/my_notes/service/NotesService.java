package com.thirutricks.my_notes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.thirutricks.my_notes.model.Notes;

public interface NotesService {
	
	Optional<Notes> findById(Long id);

	Page<Notes> getNotes(Pageable pageable);

}
