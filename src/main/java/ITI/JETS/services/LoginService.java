package ITI.JETS.services;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import ITI.JETS.controllers.ResponseViewModel;
import ITI.JETS.entities.User;
import ITI.JETS.reposrtories.UserRepository;
import ITI.JETS.services.dtos.requestdtos.LoginDTO;

@Component
public class LoginService {
    @Autowired
    UserRepository re;
    ResponseViewModel responseViewModel;
    public LoginService(UserRepository re) {
        this.re = re;
    }

    public ResponseViewModel userValidation(LoginDTO ldto) {
        responseViewModel = new ResponseViewModel();
       User u =(User) re.findUserByEmail(ldto.getEmail());
       
       if(u == null)
       {
        responseViewModel.setResponseBody("Email Not Found!",HttpStatus.valueOf(206),null);
       }
       else if(u.getPassword().equals(ldto.getPassword()))
       {
           responseViewModel.setResponseBody("logedin sucessfully",HttpStatus.valueOf(200),u);
       }else
       {
        responseViewModel.setResponseBody("Wrong PassWord",HttpStatus.valueOf(206),null);
       }
        return responseViewModel;
    }
}
