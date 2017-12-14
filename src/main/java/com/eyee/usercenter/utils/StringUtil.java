package com.eyee.usercenter.utils;

/**
 * @ClassName: StringUtil
 * @Description: TODO(处理字符串)
 * @author Ksewen
 * @date 2017年7月27日
 * 
 */
public class StringUtil {
	/**
	 * @Title: isNotEmpty @Description: TODO(确认字符串非空) @param @param
	 *         str @param @return 参数 @return boolean 返回类型 @throws
	 */
	public static boolean isNotEmpty(String str) {
		return null != str && !"".equals(str);
	}

	/**
	 * @Title: isEmpty @Description: TODO(确认字符串为空) @param @param str @param @return
	 *         参数 @return boolean 返回类型 @throws
	 */
	public static boolean isEmpty(String str) {
		return null == str || "".equals(str);
	}
}
