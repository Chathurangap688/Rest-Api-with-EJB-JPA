package com.test.dao.DAO;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.Optional;

public interface DAO<E, K> {
     Optional<E> save(E entity);

     ListResult<E> findAll();

     ListResult<E> getAllEntityList();

     E getEntityById(K id);

     ListResult<E> getEntityListByFilter(String filter);

     void injectEntityManager(EntityManager entityManager);


}
