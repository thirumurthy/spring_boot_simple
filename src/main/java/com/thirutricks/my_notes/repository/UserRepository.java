package com.thirutricks.my_notes.repository;

import org.springframework.data.repository.CrudRepository;

import com.thirutricks.my_notes.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
