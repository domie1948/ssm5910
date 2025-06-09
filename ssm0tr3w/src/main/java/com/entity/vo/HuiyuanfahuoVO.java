package com.entity.vo;

import com.entity.HuiyuanfahuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 会员发货
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public class HuiyuanfahuoVO  implements Serializable {
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
	 * 会员号
	 */
	
	private String huiyuanhao;
		
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
	 * 设置：会员号
	 */
	 
	public void setHuiyuanhao(String huiyuanhao) {
		this.huiyuanhao = huiyuanhao;
	}
	
	/**
	 * 获取：会员号
	 */
	public String getHuiyuanhao() {
		return huiyuanhao;
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
