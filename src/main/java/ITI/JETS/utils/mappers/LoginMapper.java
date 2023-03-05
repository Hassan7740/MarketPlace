package ITI.JETS.utils.mappers;

import ITI.JETS.entities.User;
import ITI.JETS.services.DTOS.RequestDTOS.LoginDTO;
 

public class LoginMapper {
     public LoginDTO mapUser(User u)
     {
        LoginDTO temp = new LoginDTO();
        temp.setEmail(u.getEmail());
        temp.setPassword(temp.getPassword());
        return temp ;
     }
}
