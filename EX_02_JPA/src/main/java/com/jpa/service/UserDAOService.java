package com.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.entities.User;

@Repository
@Transactional
public class UserDAOService {

//	@Autowired
	@PersistenceContext
	private EntityManager em;
	
	public long insert(User user) {
		em.persist(user);
		return user.getId();
	}
}
