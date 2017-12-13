/**  
* @Title: SpittrWebAppInitializer.java  
* @Package com.spittr.config  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年8月30日  
*/
package com.eyee.usercenter.config.global;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @ClassName: SpittrWebAppInitializer
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ksewen
 * @date 2017年8月30日
 * 
 */
public class UserCenterWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/*
	 * (非 Javadoc) <p>Title: getRootConfigClasses</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see org.springframework.web.servlet.support.
	 * AbstractAnnotationConfigDispatcherServletInitializer#getRootConfigClasses()
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { RootConfig.class };
	}

	/*
	 * (非 Javadoc) <p>Title: getServletConfigClasses</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see org.springframework.web.servlet.support.
	 * AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses(
	 * )
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	/*
	 * (非 Javadoc) <p>Title: getServletMappings</p> <p>Description: </p>
	 * 
	 * @return
	 * 
	 * @see
	 * org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#
	 * getServletMappings()
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
