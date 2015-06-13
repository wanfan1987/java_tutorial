package org.wanfan.showcase.memo.dao;

import org.springframework.data.repository.CrudRepository;
import org.wanfan.showcase.memo.domain.Memo;


public interface MemoDao extends CrudRepository<Memo, String>{

}
