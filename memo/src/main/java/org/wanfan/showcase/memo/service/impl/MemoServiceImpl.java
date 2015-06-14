package org.wanfan.showcase.memo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.wanfan.showcase.memo.dao.MemoDao;
import org.wanfan.showcase.memo.domain.Memo;
import org.wanfan.showcase.memo.service.MemoService;

@Component
public class MemoServiceImpl implements MemoService {
	
	@Autowired
	private MemoDao memoDao;

	@Override
	public Memo saveMemo(Memo memo) {
		return memoDao.save(memo);
	}
	
	@Override
	public void deleteMemo(String id) {
		memoDao.delete(id);
	}
	
	@Override
	public Memo findMemo(String id) {
		return memoDao.findOne(id);
	}
	
	@Override
	public Iterable<Memo> findAllMemo() {
		return memoDao.findAll();
	}
	
	public void setMemoDao(MemoDao memoDao) {
		this.memoDao = memoDao;
	}
}
