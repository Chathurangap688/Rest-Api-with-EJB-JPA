package com.test.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public abstract class ApiController {
    @PersistenceContext(unitName = "LEARN")
    protected EntityManager entityManager;

//    EntityManagerFactory emf= Persistence.createEntityManagerFactory("LEARN");
//    EntityManager entityManager = emf.createEntityManager();
    public abstract void initializeFacades();
}
