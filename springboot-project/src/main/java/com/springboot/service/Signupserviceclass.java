package com.springboot.service;

import org.springframework.stereotype.Service;

import com.springboot.SignupDto;
import com.springboot.repositary.Signuprepo;

@Service
public class Signupserviceclass implements SigniupService{
	
	private Signuprepo signuprepo;


	@Override
	public void saveuser(SignupDto dto) {
		// TODO Auto-generated method stub
		this.signuprepo.save(dto);
	}

}
