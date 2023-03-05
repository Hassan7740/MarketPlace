package iti.jets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import iti.jets.entities.User;
import iti.jets.reposrtories.UserRepository;
import iti.jets.services.LoginService;
import iti.jets.services.dtos.requestdtos.LoginDTO;

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
    u.setEmail("hamza1.alaa88@gmail.com");
    u.setPassword("321654");
    return re.findUserByEmail("hamza1.alaa88@gmail.com");
  }
}
