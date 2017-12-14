/**  
* @Title: UserDAO.java  
* @Package com.eyee.usercenter.dao  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年12月12日  
*/
package com.eyee.usercenter.dao;
/**  
* @ClassName: UserDAO  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author Ksewen  
* @date 2017年12月12日  
*    
*/

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.eyee.usercenter.pojo.UserPojo;

public interface UserDAO {
	@Insert("insert into user(userName,password, status, isdel) values (#{userName},#{password},1,0)")
	@Options(useGeneratedKeys = true, keyProperty="userId")
	boolean insertUser(UserPojo userPojo);
	
	@Select("select userid, username from user where userid=#{userid}")
	@ResultType(UserPojo.class)
	UserPojo showUser(int userId);
	
	@Delete("delete from user where userid=#{userid}")
	boolean deleteUser(int userId);
	
	@Update("UPDATE user SET password=#{password} WHERE userid=#{userid}")
	boolean updateUser(UserPojo userPojo);
}
