/**
 * group repository
 */
package cn.conntsing.repository.usergroup;

import java.util.Collection;

import cn.conntsing.domain.UserGroup;

/**
 * @author conntsing
 * 
 */
public interface IUserGroupRepository {
	/**
	 * generator object
	 * @return
	 */
	public UserGroup get(long groupId);
	/**
	 * find all group
	 * 
	 * @return
	 */
	public Collection<UserGroup> findAll();

	/**
	 * save object
	 * 
	 * @param ug
	 */
	public void save(UserGroup ug);

	/**
	 * update object
	 * 
	 * @param ug
	 */
	public void update(UserGroup ug);
}
