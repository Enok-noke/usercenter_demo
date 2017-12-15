/**  
* @Title: RootConfig.java  
* @Package com.spittr.config  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年8月30日  
*/
package com.eyee.usercenter.config.global;

import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName: RootConfig
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ksewen
 * @date 2017年8月30日
 * 
 */

@Configuration
@ComponentScan(basePackages = { "com.eyee.usercenter" }, excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
@EnableTransactionManagement
public class RootConfig {

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/usercenter?useUnicode=true&characterEncoding=utf-8&serverTimezone=UTC&useSSL=false");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");

		return driverManagerDataSource;
	}
	
	@Bean
	public SqlSessionFactoryBean sqlSessionFactory() {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
		
		return sqlSessionFactoryBean;
	}
	
	@Bean
	public MapperScannerConfigurer mapperScannerConfigurer() {
		MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
		mapperScannerConfigurer.setBasePackage("com.eyee.usercenter.dao");
		
		return mapperScannerConfigurer;
	}
	
	@Bean
	public DataSourceTransactionManager dataSourceTransactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}
}
