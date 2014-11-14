/**
 * 
 */
package cn.conntsing.command.usergroup;

import cn.conntsing.domain.UserGroup;

import com.jdon.annotation.Component;
import com.jdon.annotation.Introduce;
import com.jdon.domain.message.DomainMessage;

/**
 * @author conntsing
 * 
 */
@Component("userGroupProducer")
@Introduce("componentmessage")
public class UserGroupCommand implements IUserGroupCommand {

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.conntsing.command.usergroup.IUserGroupCommand#save()
	 */
	public DomainMessage save(UserGroup ug) {
		return new DomainMessage(ug);
	}
}
