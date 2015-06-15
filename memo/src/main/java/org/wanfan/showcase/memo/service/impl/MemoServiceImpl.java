package org.wanfan.showcase.memo.service.impl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wanfan.showcase.memo.dao.MemoDao;
import org.wanfan.showcase.memo.domain.Memo;
import org.wanfan.showcase.memo.service.MemoService;

@Service
public class MemoServiceImpl implements MemoService {
	
	@Autowired
	private MemoDao memoDao;

	@Override
	public Memo saveMemo(Memo memo) {
		if (StringUtils.isNotBlank(memo.getId())) {
			memo.setModifyDate(new Date());
		} else {
			memo.setCreateDate(new Date());
		}
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
}
