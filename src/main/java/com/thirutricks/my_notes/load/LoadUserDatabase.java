package com.thirutricks.my_notes.load;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thirutricks.my_notes.model.User;
import com.thirutricks.my_notes.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadUserDatabase {
	
	@Bean
    CommandLineRunner loadDatabase (UserService userService) {
        return args -> {
            log.info("Preloading " + userService.saveUser(new User("Wagner Jose Franchin", "wagner@teste.com")));
        };
    }

}
