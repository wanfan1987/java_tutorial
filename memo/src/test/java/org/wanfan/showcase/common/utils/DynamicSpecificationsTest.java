package org.wanfan.showcase.common.utils;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wanfan.showcase.common.utils.SearchFilter.Operator;
import org.wanfan.showcase.user.dao.UserDao;
import org.wanfan.showcase.user.domain.User;

import com.google.common.collect.Lists;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/application.xml")
@ActiveProfiles("dev")
public class DynamicSpecificationsTest {

	@Autowired
	private UserDao userDao;
	
	private User getUser() {
		User user = new User();
		user.setName("user1");
		return user;
	}
	
	@Test
	public void fineUserByFilter() {
		User user = getUser();
		userDao.save(user);
		SearchFilter filter = new SearchFilter("name", Operator.EQ, "user1");
		List<User> users = userDao.findAll(DynamicSpecifications.bySearchFilter(Lists.newArrayList(filter), User.class));
		assertThat(users.size()).isEqualTo(1);
	}
}
