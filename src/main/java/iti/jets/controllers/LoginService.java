package iti.jets.controllers;

import java.util.Map;
import java.util.Optional;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iti.jets.entities.User;
import iti.jets.reposrtories.UserRepository;
import iti.jets.services.dto.RequestDTOS.LoginDTO;

 
 
public class LoginService {

     @Autowired
    UserRepository userRepository;

    public String userValidation(LoginDTO ldto) {
        // Optional<User> userDAO = new UserDAO().findById(ldto.getUserId());
        // responseViewModel = new ResponseViewModel();
        // responseViewModel.setResponseBody("hi", HttpStatus.OK, userDAO);
        return userRepository.getClass().getName();
        // if(userDAO.getEmail() == null)
        // {
        // responseViewModel.setResponseBody("Email Not
        // Found!",HttpStatus.valueOf(206),null);
        // }
        // else if(userDAO.getPassword().equals(ldto.getPassword()))
        // {
        // responseViewModel.setResponseBody("logedin
        // sucessfully",HttpStatus.valueOf(200),userDAO);
        // }else
        // {
        // responseViewModel.setResponseBody("Wrong
        // PassWord",HttpStatus.valueOf(206),null);
        // }
        // return responseViewModel;
        // }
    }
}
