package org.wanfan.showcase.memo.service;

import org.wanfan.showcase.memo.domain.Memo;

/**
 * 备忘录服务
 * @author andy
 *
 */
public interface MemoService {

	/**
	 * 保存备忘录
	 * @param memo
	 * @return
	 */
	Memo saveMemo(Memo memo);
	
	/**
	 * 删除备忘录
	 * @param id
	 */
	void deleteMemo(String id);
	
	/**
	 * 查找备忘录
	 * @param id
	 * @return
	 */
	Memo findMemo(String id);
	
	/**
	 * 查找所有备忘录
	 * @return
	 */
	Iterable<Memo> findAllMemo();
}
