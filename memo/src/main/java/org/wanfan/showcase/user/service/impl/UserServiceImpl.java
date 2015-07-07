package org.wanfan.showcase.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.wanfan.showcase.user.dao.UserDao;
import org.wanfan.showcase.user.domain.User;
import org.wanfan.showcase.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public User saveUser(User user) {
		userDao.someCustomMethod(user);
		return userDao.save(user);
	}

	@Override
	public void deleteUser(User user) {
		userDao.delete(user);
	}

	@Override
	public void deleteUsers(Iterable<User> users) {
		userDao.delete(users);
	}
	
	@Override
	public User findUser(String id) {
		return userDao.findOne(id);
	}

	@Override
	public Iterable<User> findAllUsersByPage(Pageable pageable) {
		return userDao.findAll(pageable);
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
