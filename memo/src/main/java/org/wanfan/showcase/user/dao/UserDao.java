package org.wanfan.showcase.user.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.wanfan.showcase.user.domain.User;

/**
 * 用户的数据访问层
 * @author andy
 *
 */
public interface UserDao extends PagingAndSortingRepository<User, Serializable>, UserRepositoryCustom{
	List<User> findAll(Specification<User> specifications);
}
