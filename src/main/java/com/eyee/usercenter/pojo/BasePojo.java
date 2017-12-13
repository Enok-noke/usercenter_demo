/**  
* @Title: BaseVo.java  
* @Package com.eyee.usercenter.vo  
* @Description: TODO(用一句话描述该文件做什么)  
* @author Ksewen  
* @date 2017年12月12日  
*/
package com.eyee.usercenter.pojo;
/**  
* @ClassName: BaseVo  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author Ksewen  
* @date 2017年12月12日  
*    
*/
public class BasePojo {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "BaseVo [title=" + title + "]";
	}
}
