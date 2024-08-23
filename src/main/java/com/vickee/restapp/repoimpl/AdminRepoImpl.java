package com.vickee.restapp.repoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vickee.restapp.model.AdminLogin;
import com.vickee.restapp.repository.AdminRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AdminRepoImpl implements AdminRepo {
	
	@Autowired
	EntityManager entityManager;
	@Override
	public AdminLogin findByUserAndPassword(String username, String password) {
		String jpql = "SELECT a FROM AdminLogin a WHERE a.username = :username AND a.password = :password";
		TypedQuery<AdminLogin> query = entityManager.createQuery(jpql, AdminLogin.class);
		query.setParameter("username", username);
		query.setParameter("password", password);
		return query.getResultStream().findFirst().orElse(null);
	}

}
