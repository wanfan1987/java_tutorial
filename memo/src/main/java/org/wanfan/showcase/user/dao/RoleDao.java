package org.wanfan.showcase.user.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.wanfan.showcase.user.domain.Role;

/**
 * 角色的数据访问层
 * @author andy
 *
 */
public interface RoleDao extends PagingAndSortingRepository<Role, Serializable>{
	// 类型为FETCH，表示只有指定的NamedEntityGraph的属性才通过EAGER的方式查询（联表查询）
	// LOAD表示实体的每个属性都是按照原来的FETCH设置
	@EntityGraph(value="graph.Role.users", type=EntityGraphType.FETCH)
	Iterable<Role> findByName(String name);
	
	List<Role> findRoleByNameLike(String name);
	
	@Query("select r from Role r where r.description like %?1%")
	List<Role> findByDescriptionLike(String description);
}
