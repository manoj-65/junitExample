package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.entity.User;

public class UserDao {

	public EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alpha");
		return factory.createEntityManager();
	}

	public User saveUser(User user) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(user);
		transaction.commit();
		return user;
	}

	public User findUserByEmailAndPassword(String email, String password) {
		EntityManager manager = getEntityManager();
		Query query = manager.createQuery("SELECT u FROM User u WHERE u.email=?1 AND u.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);

		return (User) query.getSingleResult();
	}
}
