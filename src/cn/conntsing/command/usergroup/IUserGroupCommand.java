/**
 * interface of group command component
 */
package cn.conntsing.command.usergroup;

import cn.conntsing.domain.UserGroup;

import com.jdon.annotation.model.Send;
import com.jdon.domain.message.DomainMessage;

/**
 * @author conntsing
 * 
 */
public interface IUserGroupCommand {
	/**
	 * save group
	 */
	@Send("saveGroup")
	public DomainMessage save(UserGroup ug);
}
