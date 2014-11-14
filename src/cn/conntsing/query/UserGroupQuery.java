/**
 * group query compoent
 */
package cn.conntsing.query;

import java.util.Collection;

import cn.conntsing.domain.UserGroup;
import cn.conntsing.repository.usergroup.IUserGroupRepository;

import com.jdon.annotation.Component;

/**
 * @author conntsing
 * 
 */
@Component("userGroupQuery")
public class UserGroupQuery {
	private IUserGroupRepository userGroupRepository;

	public UserGroupQuery(IUserGroupRepository userGroupRepository) {
		this.userGroupRepository = userGroupRepository;
	}

	public UserGroup getById(long groupId) {
		return this.userGroupRepository.get(groupId);
	}

	public Collection<UserGroup> findAllUserGroup() {
		return this.userGroupRepository.findAll();
	}
}
