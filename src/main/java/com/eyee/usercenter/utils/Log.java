package com.eyee.usercenter.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: Log
 * @Description: TODO(封装logger，简化操作)
 * @author Ksewen
 * @date 2017年7月27日
 * 
 */
public class Log {
	private final Class<?> clazz;
	private Logger logger;

	/**
	 * 创建一个新的实例 Log.
	 * 
	 * @param clazz
	 */
	public Log(Class<?> clazz) {
		this.clazz = clazz;
		this.logger = LoggerFactory.getLogger(clazz);
	}

	/**
	 * @Title: info @Description: TODO(操作info级别日志) @param @param message 参数 @return
	 *         void 返回类型 @throws
	 */
	public void info(String message) {
		logger.info(clazz.getCanonicalName() + ": " + message);
	}

	/**
	 * @Title: debug @Description: TODO(操作debug级别日志) @param @param message
	 *         参数 @return void 返回类型 @throws
	 */
	public void debug(String message) {
		logger.debug(clazz.getCanonicalName() + ": " + message);
	}

	/**
	 * @Title: error @Description: TODO(操作error级别日志) @param @param message
	 *         参数 @return void 返回类型 @throws
	 */
	public void error(String message) {
		logger.error(clazz.getCanonicalName() + ": " + message);
	}

	/**
	 * @Title: trace @Description: TODO(操作trace级别日志) @param @param message
	 *         参数 @return void 返回类型 @throws
	 */
	public void trace(String message) {
		logger.trace(clazz.getCanonicalName() + ": " + message);
	}

	/**
	 * @Title: warn @Description: TODO(操作warn级别日志) @param @param message 参数 @return
	 *         void 返回类型 @throws
	 */
	public void warn(String message) {
		logger.warn(clazz.getCanonicalName() + ": " + message);
	}
}
