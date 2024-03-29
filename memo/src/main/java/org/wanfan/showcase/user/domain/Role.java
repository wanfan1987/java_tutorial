package org.wanfan.showcase.user.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedQuery;

import org.wanfan.showcase.common.domain.DomainBase;


/**
 * 用户角色
 * @author andy
 *
 */
@Entity
// NamedQuery的like语句需要将%放在参数里，否则执行时候会解析失败
@NamedQuery(name="Role.findRoleByNameLike", query="select r from Role r where r.name like ?1")
@NamedEntityGraph(name="graph.Role.users", attributeNodes=@NamedAttributeNode("users"))
public class Role extends DomainBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6796736536525989369L;
	
	private String name;
	
	private String description;
	
	@ManyToMany(mappedBy="roles", 
			fetch = FetchType.LAZY)
	private List<User> users;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Role [name=" + name + ", description=" + description + ", id="
				+ id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
