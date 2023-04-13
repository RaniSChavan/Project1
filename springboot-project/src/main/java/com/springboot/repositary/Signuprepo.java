package com.springboot.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.SignupDto;

@Repository
public interface Signuprepo extends JpaRepository<SignupDto, String> {

}
