package com.jpa.spring.data;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entities.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
