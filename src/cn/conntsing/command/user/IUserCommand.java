/**
 * user component
 */
package cn.conntsing.command.user;

import cn.conntsing.domain.User;

import com.jdon.annotation.model.Receiver;
import com.jdon.annotation.model.Send;
import com.jdon.domain.message.DomainMessage;

/**
 * @author conntsing
 * 
 */
public interface IUserCommand {
	@Send("saveUser")
	public DomainMessage save(User u);
}
