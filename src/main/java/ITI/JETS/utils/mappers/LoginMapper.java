package ITI.JETS.utils.mappers;

import ITI.JETS.services.DTOS.RequestDTOS.LoginDTO;
import ITI.JETS.entities.User;
 

public class LoginMapper {
     public LoginDTO mapUser(User u)
     {
        LoginDTO temp = new LoginDTO();
        temp.setEmail(u.getEmail());
        temp.setPassword(temp.getPassword());
        return temp ;
     }
}
