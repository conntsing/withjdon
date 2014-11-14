/**
 * 
 */
package cn.conntsing.repository.user;

import java.util.Collection;
import java.util.HashMap;

import com.jdon.annotation.Component;
import com.jdon.annotation.Introduce;

import cn.conntsing.domain.User;

/**
 * @author conntsing
 * 
 */
@Component
@Introduce("modelCache")
public class UserRepositoryImpl implements IUserRepository {

	private HashMap<String, User> userMap = new HashMap<String, User>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.conntsing.repository.user.IUserRepository#save(cn.conntsing.domain
	 * .User)
	 */
	public void save(User user) {
		userMap.put(user.getLoginId(), user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.conntsing.repository.user.IUserRepository#findAll()
	 */
	public Collection<User> findAll() {
		return userMap.values();
	}
}
