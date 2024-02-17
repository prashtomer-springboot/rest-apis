package com.in28minutes.rest.restfulwebservices.jpa;

import com.in28minutes.rest.restfulwebservices.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
