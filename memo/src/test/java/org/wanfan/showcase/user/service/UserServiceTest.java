package org.wanfan.showcase.user.service;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wanfan.showcase.user.domain.Role;
import org.wanfan.showcase.user.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/application.xml")
@ActiveProfiles("dev")
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	private Role getRole() {
		Role role = new Role();
		role.setName("role1");
		role.setDescription("role1");
		return role;
	}
	
	private User getUser() {
		User user = new User();
		user.setName("user1");
		return user;
	}
	
	@Test
	public void testSaveUser() {
		Role role = getRole();
		role = roleService.saveRole(role);
		User user = getUser();
		List<Role> roles = new ArrayList<Role>();
		roles.add(role);
		user.setRoles(roles);
		User user2 = userService.saveUser(user);
		assertThat(user2.getRoles().get(0)).isEqualTo(user.getRoles().get(0));
	}

	@Test
	public void testDeleteUser() {
		User user = getUser();
		User user2 = userService.saveUser(user);
		User user3 = userService.findUser(user2.getId());
		assertThat(user3.getId()).isEqualTo(user2.getId());
		userService.deleteUser(user2);
		User user4 = userService.findUser(user2.getId());
		assertThat(user4).isNull();
	}

	@Test
	public void testDeleteUsers() {
		User user = getUser();
		User user2 = userService.saveUser(user);
		User user3 = userService.findUser(user2.getId());
		assertThat(user3.getId()).isEqualTo(user2.getId());
		List<User> list = new ArrayList<User>();
		list.add(user2);
		userService.deleteUsers(list);
		User user4 = userService.findUser(user2.getId());
		assertThat(user4).isNull(); 
	}

	@Test
	public void testFindAllUsersByPage() {
		User user = getUser();
		User user2 = getUser();
		userService.saveUser(user);
		userService.saveUser(user2);
		PageRequest pageable = new PageRequest(1, 1);
		Iterable<User> users = userService.findAllUsersByPage(pageable);
		int count = 0;
		Iterator<User> it = users.iterator();
		while(it.hasNext()) {
			it.next();
			count++;
		}
		assertThat(count).isEqualTo(1);
	}
}
