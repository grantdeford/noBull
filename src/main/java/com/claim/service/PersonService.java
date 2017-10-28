package com.claim.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.claim.entity.Person;
import com.claim.repository.PersonRepository;



@Service
	
public class PersonService {
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	private PersonRepository personRepository;
	
	private static final String loginSql ="select   P.* from person P where P.email = :email and P.password = :password";
	
	@Transactional
	public Person login(String email, String password) {
		return (Person) entityManager.createNativeQuery(loginSql, Person.class)
				.setParameter("email", email)
				.setParameter("password", password)
				.getSingleResult();
		}
	@Transactional
	public Person login2(String email, String password) {
		return this.personRepository.login(email, password);
	}
	@Transactional
	public Person signUp(Person person) {
		return this.personRepository.save(person);
	}
}
