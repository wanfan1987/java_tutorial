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
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="role_user", 
		inverseJoinColumns=@JoinColumn(name="role_id"),
		joinColumns=@JoinColumn(name="user_id"))
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
