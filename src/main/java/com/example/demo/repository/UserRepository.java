package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Users;
@Service
public interface UserRepository extends JpaRepository<Users,Integer> {
public Users findByEmail(String email);
}
