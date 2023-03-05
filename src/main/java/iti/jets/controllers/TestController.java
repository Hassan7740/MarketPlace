package iti.jets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iti.jets.reposrtories.UserRepository;
import iti.jets.utils.mappers.SignDTOToUser;
import jakarta.persistence.PersistenceContext;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    UserRepository userRepository;
    @GetMapping
    public String get()
    {
        return  new SignDTOToUser().getTest();
    }
}
