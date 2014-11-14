/**
 * query user
 */
package cn.conntsing.query;

import java.util.Collection;

import cn.conntsing.domain.User;
import cn.conntsing.repository.user.IUserRepository;

import com.jdon.annotation.Component;

/**
 * @author conntsing
 * 
 */
@Component("userQuery")
public class UserQuery {
	private IUserRepository userRepositoryImpl;

	public UserQuery(IUserRepository userRepositoryImpl) {
		this.userRepositoryImpl = userRepositoryImpl;
	}

	/**
	 * find all user
	 * 
	 * @return
	 */
	public Collection<User> findAllUser() {
		return userRepositoryImpl.findAll();
	}
}
