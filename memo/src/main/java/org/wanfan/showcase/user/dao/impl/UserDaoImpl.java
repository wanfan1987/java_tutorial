package org.wanfan.showcase.user.dao.impl;

import org.springframework.stereotype.Repository;
import org.wanfan.showcase.user.dao.UserRepositoryCustom;
import org.wanfan.showcase.user.domain.User;

/**
 * 名字为repository接口名称UserDao + Impl
 * @author andy
 *
 */
@Repository
public class UserDaoImpl implements UserRepositoryCustom{

	@Override
	public void someCustomMethod(User user) {
		System.out.println("someCustomMethod");
	}

}
