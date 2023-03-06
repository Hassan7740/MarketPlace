package ITI.JETS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ITI.JETS.entities.User;
import ITI.JETS.reposrtories.UserRepository;
import ITI.JETS.services.LoginService;
import ITI.JETS.services.dtos.requestdtos.LoginDTO;

@RestController
@RequestMapping("/login")
public class LoginController {
  @Autowired
  UserRepository re;

  @PostMapping
  public ResponseViewModel login(@RequestBody LoginDTO lDto) {
    return new LoginService(re).userValidation(lDto);
  }

  @GetMapping
  public Object getuser() {
    User u = new User();
    u.setEmail("hamza@gmail.com");
    u.setPassword("123123");
    return re.findUserByEmail("qweqwe123");
  }
}
