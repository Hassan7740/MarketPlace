package iti.jets.reposrtories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import iti.jets.entities.User;
@Repository
public interface UserRepository extends JpaRepository <User, Integer>{

    // @Query("select u from User u where u.email = :email")
    // public User findUserByEmail(String email);
  
}