package com.firstboot.reposrtories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstboot.entities.User;

public interface UserRepository extends JpaRepository <User, Integer>{


}