package org.wanfan.showcase.memo.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.wanfan.showcase.memo.dao.MemoDao;
import org.wanfan.showcase.memo.domain.Memo;
import org.wanfan.showcase.memo.service.impl.MemoServiceImpl;

/**
 * 使用Mockito和assertJ来进行单元测试
 * @author andy
 *
 */
public class MemoServiceTest {

	//1 创建mock对象
	@InjectMocks
	private MemoServiceImpl memoService;
	
	@Mock
	private MemoDao memoDao;
	
	@Before
	public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public void testSaveMemo() {
		// 2 stub 对外部依赖提供测试桩
		Memo memo = new Memo();
		Mockito.when(memoDao.save(memo)).thenReturn(memo);
		
		// 3 执行测试逻辑
		Memo result = memoService.saveMemo(memo);
		
		// 4 verify memoDao的save方法被调用了1次
		Mockito.verify(memoDao, Mockito.times(1)).save(memo);
		// memo和result是同一个对象
		assertThat(result).isEqualTo(memo);
	}

	@Test
	public void testDeleteMemo() {
		// 返回值为void的方法，测试
		Mockito.doAnswer(new Answer<Object>() {
	        public Object answer(InvocationOnMock invocation) {
	            Object[] args = invocation.getArguments();
	            return "called with arguments: " + args;
	        }
	    }).when(memoDao).delete("id");
		
		memoService.deleteMemo("id");
		
		Mockito.verify(memoDao, Mockito.times(1)).delete("id");
	}

	@Test
	public void testFindMemo() {
		Memo memo = new Memo();
		Mockito.when(memoDao.findOne(Mockito.anyString())).thenReturn(memo);
		
		Memo result = memoService.findMemo(Mockito.anyString());
		
		Mockito.verify(memoDao, Mockito.times(1)).findOne(Mockito.anyString());
		assertThat(result).isEqualTo(memo);
	}

	@Test
	public void testFindAllMemo() {
		List<Memo> list = new ArrayList<Memo>();
		list.add(new Memo());
		list.add(new Memo());
		
		Mockito.when(memoDao.findAll()).thenReturn(list);
		
		Iterable<Memo> memos = memoService.findAllMemo();
		Mockito.verify(memoDao, Mockito.times(1)).findAll();
		assertThat(memos).hasSize(2);
	}

}
