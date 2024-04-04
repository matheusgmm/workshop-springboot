package com.muccio.springcourse.repositories;

import com.muccio.springcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
