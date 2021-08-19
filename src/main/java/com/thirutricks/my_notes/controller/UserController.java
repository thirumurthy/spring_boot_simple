package com.thirutricks.my_notes.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.thirutricks.my_notes.dto.CreateUser;
import com.thirutricks.my_notes.model.User;
import com.thirutricks.my_notes.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@Valid @RequestBody CreateUser createUser) {
        User user = new User();
        user.setName(createUser.getName());
        user.setEmail(createUser.getEmail());
        return userService.saveUser(user);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@RequestBody CreateUser createUser, @PathVariable Long id) {
        User user = userService.getUser(id);
        user.setName(createUser.getName());
        user.setEmail(createUser.getEmail());
        return userService.saveUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        userService.deleteUser(user);
    }

}
