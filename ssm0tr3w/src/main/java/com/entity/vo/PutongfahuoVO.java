package com.entity.vo;

import com.entity.PutongfahuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 普通发货
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public class PutongfahuoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 歌名
	 */
	
	private String geming;
		
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 歌手
	 */
	
	private String geshou;
		
	/**
	 * 音乐文件
	 */
	
	private String yinlewenjian;
		
	/**
	 * 音质
	 */
	
	private String yinzhi;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 昵称
	 */
	
	private String nicheng;
				
	
	/**
	 * 设置：歌名
	 */
	 
	public void setGeming(String geming) {
		this.geming = geming;
	}
	
	/**
	 * 获取：歌名
	 */
	public String getGeming() {
		return geming;
	}
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：歌手
	 */
	 
	public void setGeshou(String geshou) {
		this.geshou = geshou;
	}
	
	/**
	 * 获取：歌手
	 */
	public String getGeshou() {
		return geshou;
	}
				
	
	/**
	 * 设置：音乐文件
	 */
	 
	public void setYinlewenjian(String yinlewenjian) {
		this.yinlewenjian = yinlewenjian;
	}
	
	/**
	 * 获取：音乐文件
	 */
	public String getYinlewenjian() {
		return yinlewenjian;
	}
				
	
	/**
	 * 设置：音质
	 */
	 
	public void setYinzhi(String yinzhi) {
		this.yinzhi = yinzhi;
	}
	
	/**
	 * 获取：音质
	 */
	public String getYinzhi() {
		return yinzhi;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：昵称
	 */
	 
	public void setNicheng(String nicheng) {
		this.nicheng = nicheng;
	}
	
	/**
	 * 获取：昵称
	 */
	public String getNicheng() {
		return nicheng;
	}
			
}
