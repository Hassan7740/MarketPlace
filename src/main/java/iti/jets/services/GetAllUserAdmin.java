package iti.jets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iti.jets.reposrtories.UserRepository;

@Service
public class GetAllUserAdmin {
    @Autowired
    UserRepository userRepository;
    
}
