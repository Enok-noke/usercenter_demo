/**  
* @Title: BaseController.java  
* @Package com.eyee.usercenter.controller  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年12月12日  
*/
package com.eyee.usercenter.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eyee.usercenter.pojo.BasePojo;

/**
 * @ClassName: BaseController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ksewen
 * @date 2017年12月12日
 * 
 */

@Controller
@RequestMapping({ "/", "base" })
public class BaseController {
	@RequestMapping(value = "/index", method = RequestMethod.GET, produces = { "application/json; charset=UTF-8" })
	public ResponseEntity<BasePojo> index() {
		BasePojo bv = new BasePojo();
		bv.setTitle("hello world!");
		return new ResponseEntity<BasePojo>(bv, HttpStatus.OK);
	}
}
