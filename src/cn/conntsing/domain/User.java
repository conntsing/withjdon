/**
 * 用户模型
 */
package cn.conntsing.domain;

import com.jdon.annotation.Model;

/**
 * @author conntsing
 */
@Model
public class User {
	// 用户标识
	private String loginId;
	// 密码
	private String password;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
