package com.mike.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mike.curso.springboot.webapp.springbootweb.model.User;
import com.mike.curso.springboot.webapp.springbootweb.model.dto.UserDto;



@RestController
@RequestMapping("api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){

        User user = new User("Mike", "Garzon");

        UserDto userDto = new UserDto();

        userDto.setTitle("Hola Mundo Spring Boot");
        userDto.setUser(user);

        //Map<String, Object> body = new HashMap<>();
        //body.put("title", "Hola Mundo Spring Boot");
        //body.put("user", user);
      
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){

        User user = new User("Mike", "Garzon");
        User user2 = new User("Pedro", "Garzon");
        User user3 = new User("Manuel", "Garzon");

        List<User> users = Arrays.asList(user,user2,user3);

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);

        return users;
        
    }

}
