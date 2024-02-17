package com.in28minutes.rest.restfulwebservices.jpa;

import com.in28minutes.rest.restfulwebservices.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
