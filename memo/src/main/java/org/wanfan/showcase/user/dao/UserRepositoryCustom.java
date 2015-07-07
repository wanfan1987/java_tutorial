package org.wanfan.showcase.user.dao;

import org.wanfan.showcase.user.domain.User;

/**
 * 测试自定义的Spring Data Repository实现
 * @author andy
 *
 */
public interface UserRepositoryCustom {
	public void someCustomMethod(User user);
}
