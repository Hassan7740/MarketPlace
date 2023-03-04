package ITI.JETS.reposrtories;

import org.springframework.data.jpa.repository.JpaRepository;

import ITI.JETS.entities.User;

public interface UserRepository extends JpaRepository <User, Integer>{


}