/**
 * 
 */
package cn.conntsing;

import java.util.Collection;

import cn.conntsing.command.user.IUserCommand;
import cn.conntsing.command.usergroup.IUserGroupCommand;
import cn.conntsing.domain.User;
import cn.conntsing.domain.UserGroup;
import cn.conntsing.query.UserGroupQuery;
import cn.conntsing.query.UserQuery;
import cn.conntsing.service.usergroup.IUserGroupService;

import com.jdon.controller.AppUtil;
import com.jdon.domain.message.DomainMessage;

/**
 * @author conntsing
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AppUtil appUtil = new AppUtil();
		IUserCommand a = (IUserCommand) appUtil
				.getComponentInstance("userProducer");
		UserQuery query = (UserQuery) appUtil.getComponentInstance("userQuery");
		User u = new User();
		u.setLoginId("test");
		u.setPassword("123");
		DomainMessage testCommand = a.save(u);
		System.out.println(testCommand.getEventResult());
		System.out.println(query.findAllUser().size());

		UserGroup ug = new UserGroup();
		ug.setGroupId(System.currentTimeMillis());
		ug.setGroupName("testGroup");
		ug.setParentGroupId(0L);

		IUserGroupCommand groupCommand = (IUserGroupCommand) appUtil
				.getComponentInstance("userGroupProducer");
		groupCommand.save(ug);
		UserGroupQuery ugq = (UserGroupQuery) appUtil
				.getComponentInstance("userGroupQuery");
		UserGroup tmp = ugq.getById(ug.getGroupId());
		tmp.addUser(u);
		Collection<UserGroup> ugs = ugq.findAllUserGroup();

		System.out.println("user size of group:"
				+ ugs.stream().findFirst().get().getUserLoginIds().size());
		
		IUserGroupService userGroupService = (IUserGroupService) appUtil
				.getService("userGroupService");
		User u2 = new User();
		u2.setLoginId("test2");
		u2.setPassword("123");
		userGroupService.addUser(u2, ug.getGroupId());
		
		System.out.println("user size of group:"
				+ ugs.stream().findFirst().get().getUserLoginIds().size());
	}
}
