package com.firstboot.controllers;

import com.firstboot.entities.User;
import com.firstboot.reposrtories.UserRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("{id}")
    public Map getUser(@PathVariable int id) {
        ResponseViewModel res = new ResponseViewModel();
        res.setResponseBody("Done", HttpStatus.OK, userRepository.findById(id));
        return res.getResponseBody();
    }

    // @GetMapping("{id}")
    // public HashMap getUser(@PathVariable int id) {
    // HashMap<String, Object> map = new HashMap<>();
    // map.put("response", userRepository.findById(id));
    // return map;
    // }

    // @DeleteMapping("{id}")
    // public ResponseEntity deleteUser(@PathVariable int id) {
    // userRepository.deleteById(id);
    // return new ResponseEntity<>(HttpStatus.ACCEPTED);
    // }
}