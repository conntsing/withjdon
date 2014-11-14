/**
 * user event handler
 */
package cn.conntsing.event.user;

import cn.conntsing.domain.User;
import cn.conntsing.repository.user.IUserRepository;

import com.jdon.annotation.Consumer;
import com.jdon.async.disruptor.EventDisruptor;
import com.jdon.domain.message.DomainEventHandler;

/**
 * @author conntsing
 * 
 */
@Consumer("saveUser")
public class SaveUserEventHandler implements DomainEventHandler<User> {
	private IUserRepository userRepositoryImpl;

	public SaveUserEventHandler(IUserRepository userRepositoryImpl) {
		this.userRepositoryImpl = userRepositoryImpl;
	}

	public void onEvent(EventDisruptor event, boolean endOfBatch)
			throws Exception {
		User u = (User) event.getDomainMessage().getEventSource();
		userRepositoryImpl.save(u);
		event.getDomainMessage().setEventResult("save user:"+u.getLoginId());
	}

}
