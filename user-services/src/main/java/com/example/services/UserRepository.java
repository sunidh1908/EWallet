package com.example.services;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUserName(String userName);

    List<User> findAllByNameAndAge(String userName,int age);

    boolean existsByUserName(String userName);
}
