package com.thirutricks.my_notes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thirutricks.my_notes.model.Notes;

public interface NotesRepository extends JpaRepository<Notes, Long> {
	
	Optional<Notes> findById(Long id);

}
