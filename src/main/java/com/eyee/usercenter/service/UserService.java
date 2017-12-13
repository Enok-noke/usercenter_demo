/**  
* @Title: UserService.java  
* @Package com.eyee.usercenter.service  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年12月12日  
*/
package com.eyee.usercenter.service;
/**  
* @ClassName: UserService  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author Ksewen  
* @date 2017年12月12日  
*    
*/

import com.eyee.usercenter.pojo.UserPojo;

public interface UserService {
	boolean insertUser(UserPojo userPojo);
	UserPojo showUser(int userId);
	boolean deleteUser(int userId);
	boolean updateUser(UserPojo userPojo);
}
