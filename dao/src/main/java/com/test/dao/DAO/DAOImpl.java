package com.test.dao.DAO;

import javax.persistence.EntityManager;
import java.util.Optional;

public class DAOImpl<E, K> implements DAO<E, K> {
    protected EntityManager entityManager;
    private Class<E> persistentClass;

    @Override
    public Optional<E> save(E entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
            return Optional.of(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public ListResult<E> findAll() {
        return (ListResult<E>) entityManager.createQuery("Select t from " + persistentClass.getSimpleName() + " t").getResultList();
    }

    @Override
    public ListResult<E> getAllEntityList() {
        return (ListResult<E>) entityManager.createQuery("Select t from " + persistentClass.getSimpleName() + " t").getResultList();
    }

    @Override
    public E getEntityById(K id) {
        return null;
    }

    @Override
    public ListResult<E> getEntityListByFilter(String filter) {
        return null;
    }

    @Override
    public void injectEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
