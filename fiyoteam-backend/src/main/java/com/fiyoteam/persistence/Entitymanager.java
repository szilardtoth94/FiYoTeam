package com.fiyoteam.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Entitymanager {
	
	private static EntityManager em = null;
	
	public static EntityManager getEntityManagerInstance(){
		if(em == null){
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("FiYoTeamPersistence");
	        em = emf.createEntityManager();
		}
		
		return em;
	}
}
