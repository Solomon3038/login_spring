package com.example.login_spring.repository;


import com.example.login_spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long>{
    User findByEmail (String email);


}
