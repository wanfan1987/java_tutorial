package org.wanfan.showcase.user.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.wanfan.showcase.common.domain.DomainBase;

/**
 * 系统用户
 * @author andy
 *
 */
@Entity
public class User extends DomainBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3744951539240247104L;
	private String name;
	
//	CascadeType.PERSIST只有A类新增时，会级联B对象新增。若B对象在数据库存（跟新）在则抛异常（让B变为持久态） 
//	CascadeType.MERGE指A类新增或者变化，会级联B对象（新增或者变化） 
//	CascadeType.REMOVE只有A类删除时，会级联删除B类； 
//  CascadeType.REFRESH：级联刷新，当多个用户同时作操作一个实体，为了用户取到的数据是实时的，在用实体中的数据之前就可以调用一下refresh()方法！
//	CascadeType.ALL包含所有；
	@ManyToMany(cascade={CascadeType.MERGE})
	@JoinTable(name="role_user",
		inverseJoinColumns={@JoinColumn(name="role_id", referencedColumnName="id")},
		joinColumns={@JoinColumn(name="user_id", referencedColumnName="id")})
	private List<Role> roles;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}
}
