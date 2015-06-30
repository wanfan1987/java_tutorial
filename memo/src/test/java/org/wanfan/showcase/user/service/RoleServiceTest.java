package org.wanfan.showcase.user.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wanfan.showcase.user.domain.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/application.xml")
@ActiveProfiles("dev")
public class RoleServiceTest {

	@Autowired
	private RoleService roleService;
	
	private Role getRole() {
		Role role = new Role();
		role.setName("role1");
		role.setDescription("role1");
		return role;
	}
	
	@Test
	public void testSaveRole() {
		Role role = getRole();
		role = roleService.saveRole(role);
		Role role2 = roleService.findRole(role.getId());
		assertThat(role.getName()).isEqualTo(role2.getName());
	}

	@Test
	public void testDeleteRole() {
		Role role = getRole();
		role = roleService.saveRole(role);
		roleService.deleteRole(role);
		Role role2 = roleService.findRole(role.getId());
		assertThat(role2).isNull();
	}

	@Test
	public void testDeleteRoles() {
		Role role = getRole();
		role = roleService.saveRole(role);
		
		List<Role> roles = new ArrayList<Role>();
		roles.add(role);
		roleService.deleteRoles(roles);
		Role role2 = roleService.findRole(role.getId());
		assertThat(role2).isNull();
	}

	@Test
	public void testFindRolesByName() {
		Role role = getRole();
		role = roleService.saveRole(role);
		Iterable<Role> roles = roleService.findRolesByName(role.getName());
		assertThat(roles.iterator().next().getName()).isEqualTo(role.getName());
	}

	@Test
	public void testFindAllRoles() {
		Role role = getRole();
		role = roleService.saveRole(role);
		List<Role> roles = (ArrayList<Role>)roleService.findAllRoles();
		assertThat(roles.size()).isPositive();
	}

}
