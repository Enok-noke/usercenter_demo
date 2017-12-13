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

/**
 * @ClassName: UserController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ksewen
 * @date 2017年12月12日
 * 
 */
@Controller
@RequestMapping({ "user" })
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/userinfo", method = RequestMethod.POST, produces = { "application/json; charset=UTF-8" })
	@ResponseBody
	public ResponseEntity<ResponsePojo<UserPojo>> userInfo(UserPojo userPojo) {
		ResponsePojo<UserPojo> response = new ResponsePojo<>();
		UserPojo user = userService.showUser(userPojo.getUserId());
		
		response.setData(user);
		
		if (user == null) {
			response.setCode(401);
			response.setMsg("无对应用户");
			return new ResponseEntity<ResponsePojo<UserPojo>>(response, HttpStatus.OK);
		}
		
		response.setCode(200);
		response.setMsg("请求成功");
		return new ResponseEntity<ResponsePojo<UserPojo>>(response, HttpStatus.OK);
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST, produces = { "application/json; charset=UTF-8" })
	@ResponseBody
	public ResponseEntity<ResponsePojo<UserPojo>> register(UserPojo userPojo) {
		boolean flag = userService.insertUser(userPojo);
		
		ResponsePojo<UserPojo> response = new ResponsePojo<>();
		
		if (!flag) {
			response.setCode(501);
			response.setMsg("注册失败");
			return new ResponseEntity<ResponsePojo<UserPojo>>(response, HttpStatus.OK);
		}
		
		response.setCode(200);
		response.setMsg("请求成功");
		response.setData(userPojo);
		return new ResponseEntity<ResponsePojo<UserPojo>>(response, HttpStatus.OK);
	}

//	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces = { "application/json; charset=UTF-8" })
//	public ResponseEntity<Boolean> deteleUser() {
//		return userService.deleteUser();
//	}
//
//	@RequestMapping(value = "/update", method = RequestMethod.POST, produces = { "application/json; charset=UTF-8" })
//	public ResponseEntity<UserPojo> updateUser() {
//		return userService.updateUser();
//	}
}
