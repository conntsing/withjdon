/**
 * handler of save group event
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
@Consumer("saveGroup")
public class SaveGroupEventHandler implements DomainEventHandler<UserGroup> {
	private IUserGroupRepository userGroupRepository;

	public SaveGroupEventHandler(IUserGroupRepository userGroupRepository) {
		this.userGroupRepository = userGroupRepository;
	}

	public void onEvent(EventDisruptor event, boolean endOfBatch)
			throws Exception {
		userGroupRepository.save((UserGroup) event.getDomainMessage()
				.getEventSource());
	}

}
