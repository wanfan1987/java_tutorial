package org.wanfan.showcase.user.service;

import java.util.List;

import org.wanfan.showcase.user.domain.Role;

/**
 * 角色服务类
 * @author andy
 *
 */
public interface RoleService {

	Role saveRole(Role role);
	
	void deleteRole(Role role);
	
	void deleteRoles(Iterable<Role> roles);
	
	Role findRole(String id);
	
	Iterable<Role> findRolesByName(String name);
	
	List<Role> findRolesByNameLike(String name);
	
	List<Role> findRolesByDescriptionLike(String description);
	
	Iterable<Role> findAllRoles();
}
