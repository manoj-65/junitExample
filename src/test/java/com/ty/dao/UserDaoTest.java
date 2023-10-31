package com.ty.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.persistence.PersistenceException;

import org.junit.jupiter.api.Test;

import com.ty.entity.User;

class UserDaoTest {

	@Test
	void saveNegUser() {
		User execptedUser = new User();
		execptedUser.setName("Ram");
		execptedUser.setEmail("Ram1@abc.in");
		execptedUser.setPassword("1234");

		// User accutalUser = new UserDao().saveUser(execptedUser);

		// assertEquals(execptedUser, accutalUser);

		assertThrows(PersistenceException.class, () -> {
			new UserDao().saveUser(execptedUser);
		});

	}

	@Test
	void savePosUser() {
		User execptedUser = new User();
		execptedUser.setName("Ram");
		execptedUser.setEmail("Ram2@abc.in");
		execptedUser.setPassword("1234");

		User accutalUser = new UserDao().saveUser(execptedUser);

		assertEquals(execptedUser, accutalUser);

	}

}
