package com.entity.model;

import com.entity.HuiyuanleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 会员类别
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public class HuiyuanleibieModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 有效时间
	 */
	
	private String youxiaoshijian;
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：有效时间
	 */
	 
	public void setYouxiaoshijian(String youxiaoshijian) {
		this.youxiaoshijian = youxiaoshijian;
	}
	
	/**
	 * 获取：有效时间
	 */
	public String getYouxiaoshijian() {
		return youxiaoshijian;
	}
			
}
