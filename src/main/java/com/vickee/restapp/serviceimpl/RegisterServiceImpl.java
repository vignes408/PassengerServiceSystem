package com.vickee.restapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.Register;
import com.vickee.restapp.repository.RegisterRepo;
import com.vickee.restapp.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	RegisterRepo repo;
	
	@Override
	public String addRegister(Register register) {
		if(register!=null) {
			repo.save(register);
			return "success";
		}
		else {
			return "failure";
		}
	}

}
