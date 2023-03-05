package ITI.JETS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ITI.JETS.reposrtories.UserRepository;
import jakarta.persistence.PersistenceContext;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    UserRepository userRepository;
    @GetMapping
    public String get()
    {
        return userRepository.findById(2).get().getEmail();
    }
}
