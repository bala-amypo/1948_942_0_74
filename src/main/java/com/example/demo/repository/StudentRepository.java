package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Stuentity;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Stuentity, Long> {
    
    
}
//StudentRepository.java