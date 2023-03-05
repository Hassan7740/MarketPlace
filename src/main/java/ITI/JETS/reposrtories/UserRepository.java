package ITI.JETS.reposrtories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ITI.JETS.entities.User;
@Repository
public interface UserRepository extends JpaRepository <User, Integer>{

    // @Query("select u from User u where u.email = :email")
    // public User findUserByEmail(String email);
  
}