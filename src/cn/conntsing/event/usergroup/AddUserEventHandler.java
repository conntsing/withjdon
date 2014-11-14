/**
 * the event of 
 */
package cn.conntsing.event.usergroup;

import cn.conntsing.domain.UserGroup;
import cn.conntsing.repository.usergroup.IUserGroupRepository;

import com.jdon.annotation.Consumer;
import com.jdon.async.disruptor.EventDisruptor;
import com.jdon.domain.message.DomainEventHandler;

/**
 * @author conntsing
 * 
 */
@Consumer("groupAddUser")
public class AddUserEventHandler implements DomainEventHandler<UserGroup> {
	private IUserGroupRepository userGroupRepository;

	public AddUserEventHandler(IUserGroupRepository userGroupRepository) {
		this.userGroupRepository = userGroupRepository;
	}

	public void onEvent(EventDisruptor event, boolean endOfBatch)
			throws Exception {
		userGroupRepository.update((UserGroup) event.getDomainMessage()
				.getEventSource());
	}

}
