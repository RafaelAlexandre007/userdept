package com.ralexandre.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ralexandre.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
