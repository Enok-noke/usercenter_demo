/**  
* @Title: UserVo.java  
* @Package com.eyee.usercenter.vo  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年12月12日  
*/
package com.eyee.usercenter.pojo;

/**
 * @ClassName: UserVo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ksewen
 * @date 2017年12月12日
 * 
 */
public class UserPojo {
	private Integer userId;
	private String userName;
	private transient String password;
	private transient int status;
	private transient boolean isDel;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public boolean isDel() {
		return isDel;
	}

	public void setDel(boolean isDel) {
		this.isDel = isDel;
	}

	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", userName=" + userName + ", password=" + password + ", status=" + status
				+ ", isDel=" + isDel + "]";
	}

}
