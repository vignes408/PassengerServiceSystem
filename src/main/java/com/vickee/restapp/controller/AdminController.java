package com.vickee.restapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vickee.restapp.model.AdminLogin;
import com.vickee.restapp.service.AdminService;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {
@Autowired
AdminService adminService;
	@PostMapping("/login")
    public String login(@RequestBody AdminLogin admin ) {
        return adminService.login(admin.getUsername(),admin.getPassword());
    }
}
