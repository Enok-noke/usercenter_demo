/**  
* @Title: UserController.java  
* @Package com.eyee.usercenter.controller  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年12月12日  
*/
package com.eyee.usercenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eyee.usercenter.pojo.ResponsePojo;
import com.eyee.usercenter.pojo.UserPojo;
import com.eyee.usercenter.service.UserService;
import com.eyee.usercenter.utils.StringUtil;

/**
 * @ClassName: UserController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ksewen
 * @date 2017年12月12日
 * 
 */
@Controller
@RequestMapping({ "/user" })
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/userinfo", method = RequestMethod.POST, produces = { "application/json; charset=UTF-8" })
	@ResponseBody
	public ResponseEntity<ResponsePojo<?>> userInfo(@RequestBody UserPojo userPojo) {
		if (userPojo.getUserId() == null) {
			return new ResponseEntity<ResponsePojo<?>>(new ResponsePojo<>(502, "missing param", "userId"),
					HttpStatus.OK);
		}

		userPojo = userService.showUser(userPojo.getUserId());

		if (userPojo == null) {
			return new ResponseEntity<ResponsePojo<?>>(new ResponsePojo<>(401, "user non-existent"), HttpStatus.OK);
		}

		return new ResponseEntity<ResponsePojo<?>>(new ResponsePojo<>(200, "success", userPojo), HttpStatus.OK);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = { "application/json; charset=UTF-8" })
	@ResponseBody
	public ResponseEntity<ResponsePojo<?>> register(@RequestBody UserPojo userPojo) {
		if (StringUtil.isEmpty(userPojo.getUserName()) || StringUtil.isEmpty(userPojo.getPassword())) {
			return new ResponseEntity<ResponsePojo<?>>(new ResponsePojo<>(502, "missing param", "userName, password"),
					HttpStatus.OK);
		}
		boolean flag = userService.insertUser(userPojo);

		if (!flag) {
			return new ResponseEntity<ResponsePojo<?>>(new ResponsePojo<>(600, "operation failed"), HttpStatus.OK);
		}

		return new ResponseEntity<ResponsePojo<?>>(new ResponsePojo<>(200, "success", userPojo), HttpStatus.OK);
	}
}
