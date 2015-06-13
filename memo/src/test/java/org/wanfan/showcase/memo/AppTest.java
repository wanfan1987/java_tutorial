package org.wanfan.showcase.memo;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;
import org.wanfan.showcase.memo.dao.MemoDao;
import org.wanfan.showcase.memo.domain.Memo;

/**
 * 测试Spring Data配置是否正确
 * @author andy
 *
 */
public class AppTest {

	private CrudRepository<Memo, String> repository;
	@Test
	public void test() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/application.xml");
		try {
			repository = context.getBean(MemoDao.class);
			Assert.assertEquals(0, repository.count());
		} finally {
			context.close();
		}
	}
}
