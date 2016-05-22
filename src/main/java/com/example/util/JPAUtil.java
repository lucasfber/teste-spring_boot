package com.example.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	public static EntityManager getEntityManager(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("spring_boot");
		EntityManager manager = emf.createEntityManager();
		
		return manager;
	}
}
