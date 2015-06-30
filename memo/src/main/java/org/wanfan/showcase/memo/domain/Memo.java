package org.wanfan.showcase.memo.domain;

import javax.persistence.Entity;

import org.wanfan.showcase.common.domain.DomainBase;

/**
 * 记事本
 * @author andy
 *
 */
@Entity
public class Memo extends DomainBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4710023248479791790L;

	private String title;
	
	private String content;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Memo [id=" + id + ", title=" + title + ", content=" + content
				+ ", createDate=" + createDate + ", modifyDate=" + modifyDate
				+ ", createPerson=" + createPerson + ", modifyPerson="
				+ modifyPerson + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Memo other = (Memo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
