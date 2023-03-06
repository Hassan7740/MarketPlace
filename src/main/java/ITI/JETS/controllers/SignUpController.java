package ITI.JETS.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ITI.JETS.services.DTOS.RequestDTOS.SignUpDTO;




@RestController
@RequestMapping("/signup")
public class SignUpController {


    @PostMapping
    public String addNewUser(@RequestBody SignUpDTO signUpDTO ){
        return signUpDTO.getFirstName();
    }
    
}
