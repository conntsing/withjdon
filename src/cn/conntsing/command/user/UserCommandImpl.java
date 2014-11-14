/**
 * 
 */
package cn.conntsing.command.user;

import cn.conntsing.domain.User;

import com.jdon.annotation.Component;
import com.jdon.annotation.Introduce;
import com.jdon.domain.message.DomainMessage;

/**
 * @author conntsing
 * 
 */
@Component("userProducer")
@Introduce("componentmessage")
public class UserCommandImpl implements IUserCommand {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.conntsing.command.user.IUserCommand#Save(cn.conntsing.domain.User)
	 */
	public DomainMessage save(User u) {
		return new DomainMessage(u);
	}

}
