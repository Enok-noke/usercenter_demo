/**  
* @Title: UserControllerTest.java  
* @Package com.eyee.usercenter.controller  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年12月12日  
*/
package com.eyee.usercenter.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.eyee.usercenter.config.service.UserServiceCfg;
import com.eyee.usercenter.service.UserService;

/**
 * @ClassName: UserControllerTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ksewen
 * @date 2017年12月12日
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserServiceCfg.class)
public class UserControllerTest {
	@Test
	public void test() throws Exception {
		UserController userController = new UserController();
		MockMvc mockMvc = standaloneSetup(userController).build();

		mockMvc.perform(get("/user/userinfo"));
	}

}
