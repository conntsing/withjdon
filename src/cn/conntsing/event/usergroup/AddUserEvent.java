/**
 * event of add user
 */
package cn.conntsing.event.usergroup;

import cn.conntsing.domain.UserGroup;

import com.jdon.annotation.Introduce;
import com.jdon.annotation.model.Send;
import com.jdon.domain.message.DomainMessage;

/**
 * @author conntsing
 * 
 */
@Introduce("message")
public class AddUserEvent {
	@Send("groupAddUser")
	public DomainMessage addUser(UserGroup ug) {
		return new DomainMessage(ug);
	}
}
