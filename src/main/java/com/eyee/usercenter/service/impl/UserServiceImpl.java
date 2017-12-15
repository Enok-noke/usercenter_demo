/**  
* @Title: UserServiceImpl.java  
* @Package com.eyee.usercenter.service.impl  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年12月12日  
*/
package com.eyee.usercenter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.eyee.usercenter.dao.UserDAO;
import com.eyee.usercenter.pojo.UserPojo;
import com.eyee.usercenter.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ksewen
 * @date 2017年12月12日
 * 
 */
@Component
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao;

	/**
	 * @param userDao
	 *            the userDao to set
	 */
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	/*
	 * (非 Javadoc) <p>Title: insertUser</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see com.eyee.usercenter.service.UserService#insertUser()
	 */
	@Override
	public boolean insertUser(UserPojo userPojo) {
		return userDao.insertUser(userPojo);
	}

	/*
	 * (非 Javadoc) <p>Title: showUser</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see com.eyee.usercenter.service.UserService#showUser()
	 */
	@Override
	public UserPojo showUser(int userId) {
		return userDao.showUser(userId);
	}

	/*
	 * (非 Javadoc) <p>Title: deleteUser</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see com.eyee.usercenter.service.UserService#deleteUser()
	 */
	@Override
	public int deleteUser(int userId) {
		return userDao.deleteUser(userId);
	}

	/*
	 * (非 Javadoc) <p>Title: updateUser</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see com.eyee.usercenter.service.UserService#updateUser()
	 */
	@Override
	public int updateUser(int userId, String password) {
		return userDao.updateUser(userId, password);
	}

}
