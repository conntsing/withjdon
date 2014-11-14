/**
 * user repository
 */
package cn.conntsing.repository.user;

import java.util.Collection;

import cn.conntsing.domain.User;

/**
 * @author conntsing
 * 
 */
public interface IUserRepository {
	/**
	 * save user
	 * 
	 * @param user
	 */
	public void save(User user);

	/**
	 * return all user
	 * 
	 * @return
	 */
	public Collection<User> findAll();
}
