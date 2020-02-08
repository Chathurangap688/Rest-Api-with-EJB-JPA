package com.test.user.facades;

import com.test.dao.DAO.DAO;
import com.test.dao.DAO.ListResult;
import com.test.user.interfaces.User;

import javax.persistence.EntityManager;
import java.util.Optional;

public class UserManager implements DAO<User, Integer > {
    EntityManager entityManager;

    @Override
    public Optional<User> save(User entity) {
        entityManager.persist(entity);
        return Optional.empty();
    }

    @Override
    public ListResult<User> findAll() {
        return null;
    }

    @Override
    public ListResult<User> getAllEntityList() {
        return null;
    }

    @Override
    public User getEntityById(Integer id) {
        return null;
    }

    @Override
    public ListResult<User> getEntityListByFilter(String filter) {
        return null;
    }

    @Override
    public void injectEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
