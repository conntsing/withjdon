/**
 * user group
 */
package cn.conntsing.domain;

import java.util.HashSet;
import java.util.Set;

import cn.conntsing.event.usergroup.AddUserEvent;

import com.jdon.annotation.Model;
import com.jdon.annotation.model.Inject;

/**
 * @author conntsing
 * 
 */
@Model
public class UserGroup {
	@Inject
	private AddUserEvent addUserEvent;
	// 唯一标识
	private Long groupId;
	// 上级标识
	private Long parentGroupId;
	// 组名
	private String groupName;
	// 用户标识集合
	private Set<String> userLoginIds;

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getParentGroupId() {
		return parentGroupId;
	}

	public void setParentGroupId(Long parentGroupId) {
		this.parentGroupId = parentGroupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Set<String> getUserLoginIds() {
		return userLoginIds;
	}

	public void setUserLoginIds(Set<String> userLoginIds) {
		this.userLoginIds = userLoginIds;
	}

	public void addUser(User u) {
		if (null == this.userLoginIds)
			this.userLoginIds = new HashSet<String>();
		this.userLoginIds.add(u.getLoginId());
		addUserEvent.addUser(this);
	}

}
