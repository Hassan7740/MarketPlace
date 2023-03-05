package iti.jets.utils.mappers;

import iti.jets.entities.User;
import iti.jets.services.dtos.requestdtos.LoginDTO;
 

public class LoginMapper {
     public LoginDTO mapUser(User u)
     {
        LoginDTO temp = new LoginDTO();
        temp.setEmail(u.getEmail());
        temp.setPassword(temp.getPassword());
        return temp ;
     }
}
