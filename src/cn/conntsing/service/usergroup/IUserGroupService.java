/**
 * 
 */
package cn.conntsing.service.usergroup;

import cn.conntsing.domain.User;
import cn.conntsing.domain.UserGroup;

/**
 * @author conntsing
 * 
 */
public interface IUserGroupService {
	/**
	 * inject model
	 * 
	 * @return
	 */
	public UserGroup addUser(User u,Long groupId);
}
