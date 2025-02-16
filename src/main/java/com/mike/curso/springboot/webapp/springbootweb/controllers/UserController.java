package com.mike.curso.springboot.webapp.springbootweb.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.mike.curso.springboot.webapp.springbootweb.model.User;



@Controller
public class UserController {

    // instead of Model from spring, also Map from java util could be used
    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Mike", "Garzon");

        user.setEmail("prueba@gmail.com");

        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap modelMap){

       
        //This line is replaced by the below method
        // modelMap.addAttribute("users", users);
        modelMap.addAttribute("title", "lista de usuaarios");

        return "list";

    }

    //This is a global method which could be used from multiple methods, this data is sent to the front where is expecting to have users atribute
    @ModelAttribute("users")
    public List<User> userModel(){
        List<User> users = Arrays.asList(
            new User("pepa", "pig","Correo@correo"),
            new User("lula", "pig", "Lula@correo"),
            new User("lucky", "pig"));

            return users;

    }


    



}
