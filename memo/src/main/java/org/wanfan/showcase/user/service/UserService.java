package org.wanfan.showcase.user.service;

import org.springframework.data.domain.Pageable;
import org.wanfan.showcase.user.domain.User;

/**
 * 用户服务类
 * @author andy
 *
 */
public interface UserService {

	User saveUser(User user);
	
	void deleteUser(String id);
	
	void deleteUsers(Iterable<User> users);
	
	User findUser(String id); 
	
	Iterable<User> findAllUsersByPage(Pageable pageable);
	
	User findUser(User user);
}
