/**  
* @Title: WebConfig.java  
* @Package com.spittr.config  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年8月30日  
*/
package com.eyee.usercenter.config.global;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * @ClassName: WebConfig
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ksewen
 * @date 2017年8月30日
 * 
 */

@Configuration
@EnableWebMvc
@ComponentScan("com.eyee.usercenter.controller")
public class WebConfig extends WebMvcConfigurerAdapter {
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}

	/*
	 * (非 Javadoc) <p>Title: configureDefaultServletHandling</p> <p>Description:
	 * </p>
	 * 
	 * @param configurer
	 * 
	 * @see
	 * org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#
	 * configureDefaultServletHandling(org.springframework.web.servlet.config.
	 * annotation.DefaultServletHandlerConfigurer)
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		FastJsonConfig config = new FastJsonConfig();
		config.setCharset(Charset.forName("UTF-8"));
		config.setDateFormat("yyyy.MM.dd HH:mm:ss");
		converters.add(converter);
	}
	
	/* (非 Javadoc)  
	* <p>Title: configurePathMatch</p>  
	* <p>Description: </p>  
	* @param configurer  
	* @see org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter#configurePathMatch(org.springframework.web.servlet.config.annotation.PathMatchConfigurer)  
	*/  
	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		AntPathMatcher pathMatcher = new AntPathMatcher();
		pathMatcher.setCaseSensitive(false);
		configurer.setPathMatcher(pathMatcher);
	}
}
