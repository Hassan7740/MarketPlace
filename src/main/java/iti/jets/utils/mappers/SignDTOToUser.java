package iti.jets.utils.mappers;

import org.springframework.beans.factory.annotation.Autowired;

import iti.jets.reposrtories.UserRepository;

public class SignDTOToUser {
    @Autowired
   private UserRepository userRepository;

    public String getTest()
    {
        return userRepository.findById(1).get().getFirstName();
    }
    
}
