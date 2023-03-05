package ITI.JETS.reposrtories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ITI.JETS.entities.User;

public interface UserRepository extends JpaRepository <User, Integer>{

    @Query("select u from User u where u.email = :email")
    public User findUserByEmail(String email);
  
}