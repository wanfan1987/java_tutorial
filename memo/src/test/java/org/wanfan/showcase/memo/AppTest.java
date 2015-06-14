package org.wanfan.showcase.memo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wanfan.showcase.memo.domain.Memo;

/**
 * 测试Spring Data配置是否正确
 * @author andy
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/application.xml")
@ActiveProfiles("dev")
public class AppTest {

	@Autowired
	private CrudRepository<Memo, String> repository;
	@Test
	public void testSpringDataJpaConfig() {
			Assert.assertEquals(0, repository.count());
	}
}
