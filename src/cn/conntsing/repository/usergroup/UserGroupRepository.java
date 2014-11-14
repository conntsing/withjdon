/**
 * 
 */
package cn.conntsing.repository.usergroup;

import java.util.Collection;
import java.util.HashMap;

import cn.conntsing.domain.UserGroup;

import com.jdon.annotation.Component;
import com.jdon.annotation.Introduce;
import com.jdon.annotation.pointcut.Around;

/**
 * @author conntsing
 * 
 */
@Component("userGroupRepository")
@Introduce("modelCache")
public class UserGroupRepository implements IUserGroupRepository {
	private HashMap<Long, UserGroup> userGroupMap = new HashMap<Long, UserGroup>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.conntsing.repository.usergroup.IUserGroupRepository#get()
	 */
	@Around
	public UserGroup get(long groupId) {
		return userGroupMap.get(groupId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.conntsing.repository.usergroup.IUserGroupRepository#findAll()
	 */
	public Collection<UserGroup> findAll() {
		return userGroupMap.values();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.conntsing.repository.usergroup.IUserGroupRepository#save(cn.conntsing
	 * .domain.UserGroup)
	 */
	public void save(UserGroup ug) {
		userGroupMap.put(ug.getGroupId(), ug);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.conntsing.repository.usergroup.IUserGroupRepository#update(cn.conntsing
	 * .domain.UserGroup)
	 */
	public void update(UserGroup ug) {
		userGroupMap.put(ug.getGroupId(), ug);
	}

}
