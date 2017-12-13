/**  
* @Title: ResponsePojo.java  
* @Package com.eyee.usercenter.pojo  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年12月12日  
*/
package com.eyee.usercenter.pojo;

/**
 * @ClassName: ResponsePojo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Ksewen
 * @date 2017年12月12日
 * 
 */
public class ResponsePojo<T> {
	private int code;
	private String msg;
	private T data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponsePojo [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

}
