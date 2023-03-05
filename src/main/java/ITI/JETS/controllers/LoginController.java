package ITI.JETS.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ITI.JETS.services.DTOS.RequestDTOS.LoginDTO;
import ITI.JETS.entities.User;
import ITI.JETS.reposrtories.UserRepository;

@RestController
@RequestMapping("/login")
public class LoginController {
  @Autowired
  UserRepository re;

  @PostMapping
  public String login(@RequestBody LoginDTO lDto) {
    return new LoginService( ).userValidation(lDto);
  }

  @GetMapping
  public String getuser() {
    // User u = new User();
    // u.setEmail("hamza@gmail.com");
    // u.setPassword("123123");
    return re.getClass().getName();
  }
}
