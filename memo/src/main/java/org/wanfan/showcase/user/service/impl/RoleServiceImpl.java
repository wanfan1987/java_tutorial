package org.wanfan.showcase.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wanfan.showcase.user.dao.RoleDao;
import org.wanfan.showcase.user.domain.Role;
import org.wanfan.showcase.user.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	@Override
	public Role saveRole(Role role) {
		return roleDao.save(role);
	}

	@Override
	public void deleteRole(Role role) {
		roleDao.delete(role);
	}

	@Override
	public void deleteRoles(Iterable<Role> roles) {
		roleDao.delete(roles);
	}

	@Override
	public Role findRole(String id) {
		return roleDao.findOne(id);
	}

	@Override
	public Iterable<Role> findRolesByName(String name) {
		return roleDao.findByName(name);
	}

	@Override
	public Iterable<Role> findAllRoles() {
		return roleDao.findAll();
	}

	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}

}
