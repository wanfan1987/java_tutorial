package org.wanfan.showcase.user.dao;

import java.io.Serializable;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.wanfan.showcase.user.domain.Role;

/**
 * 角色的数据访问层
 * @author andy
 *
 */
public interface RoleDao extends PagingAndSortingRepository<Role, Serializable>{
	Iterable<Role> findByName(String name);
}
