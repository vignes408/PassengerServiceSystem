package com.vickee.restapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.AdminLogin;
import com.vickee.restapp.repository.AdminRepo;
import com.vickee.restapp.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepo repo;
	@Override
	public String login(String username, String password) {

		AdminLogin admin = repo.findByUserAndPassword(username, password);
		return admin!= null?"Login Success":"Invalid Admin";
	}

}
