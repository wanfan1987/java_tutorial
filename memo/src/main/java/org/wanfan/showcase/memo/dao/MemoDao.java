package org.wanfan.showcase.memo.dao;

import org.springframework.data.repository.CrudRepository;
import org.wanfan.showcase.memo.domain.Memo;

/**
 * 备忘录数据访问层
 * <br/>
 * 使用默认的spring data 接口，不写单元测试
 * @author andy
 *
 */
public interface MemoDao extends CrudRepository<Memo, String>{

}
