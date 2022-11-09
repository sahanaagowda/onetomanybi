package com.ty.onetomany_2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomanybi_2.dto.Phone;
import com.ty.onetomanybi_2.dto.Sim;

public class PhoneDao {
public void savePhone(Phone phone) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("sim");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(phone);
	List<Sim>sim=phone.getSim();
	for(Sim sims:sim) {
		entityManager.persist(sims);
	}
	entityTransaction.commit();
	
	
}
}
