package com.thirutricks.my_notes.service;

import java.util.List;

import com.thirutricks.my_notes.model.User;

public interface UserService {
	
	List<User> getUsers();

    User getUser(Long id);

    User saveUser(User user);

    void deleteUser(User user);

}
