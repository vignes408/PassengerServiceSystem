package com.vickee.restapp.repository;

import com.vickee.restapp.model.AdminLogin;

public interface AdminRepo {
	
	AdminLogin findByUserAndPassword(String username, String password);
}
