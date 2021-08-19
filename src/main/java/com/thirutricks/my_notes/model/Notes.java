package com.thirutricks.my_notes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "notes")
public class Notes {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "notes_id")
    private Long id;

    @Column(name = "title", nullable = false, unique = true)
    @Length(min = 3, message = "*Title must have at least 5 characters")
    private String title;

    @Column(name = "description")
    private String description;
    
}
