/**
 * 
 */
package cn.conntsing.service.usergroup;

import cn.conntsing.domain.User;
import cn.conntsing.domain.UserGroup;
import cn.conntsing.repository.usergroup.IUserGroupRepository;

import com.jdon.annotation.Service;

/**
 * @author conntsing
 * 
 */
@Service("userGroupService")
public class UserGroupService implements IUserGroupService {

	private IUserGroupRepository userGroupRepository;

	public UserGroupService(IUserGroupRepository userGroupRepository) {
		this.userGroupRepository = userGroupRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.conntsing.service.usergroup.IUserGroupService#addUser(cn.conntsing
	 * .domain.User)
	 */
	public UserGroup addUser(User u,Long groupId) {
		UserGroup ug = userGroupRepository.get(groupId);
		ug.addUser(u);
		return ug;
	}

}
