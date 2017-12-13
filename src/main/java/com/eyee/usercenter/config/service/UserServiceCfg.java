/**  
* @Title: UserServiceCfg.java  
* @Package com.eyee.usercenter.config.service  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年12月12日  
*/
package com.eyee.usercenter.config.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.eyee.usercenter.service.impl.ServiceScan;

/**
 * @ClassName: UserServiceCfg
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ksewen
 * @date 2017年12月12日
 * 
 */

@Configuration
@ComponentScan(basePackageClasses = { ServiceScan.class })
public class UserServiceCfg {

}
