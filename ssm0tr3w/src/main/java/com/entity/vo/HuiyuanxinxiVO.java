package com.entity.vo;

import com.entity.HuiyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 会员信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public class HuiyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 昵称
	 */
	
	private String nicheng;
		
	/**
	 * 会员号
	 */
	
	private String huiyuanhao;
		
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 会员类别
	 */
	
	private String huiyuanleibie;
		
	/**
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 有效时间
	 */
	
	private String youxiaoshijian;
		
	/**
	 * 开通日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaitongriqi;
		
	/**
	 * 到期日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date daoqiriqi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：会员类别
	 */
	 
	public void setHuiyuanleibie(String huiyuanleibie) {
		this.huiyuanleibie = huiyuanleibie;
	}
	
	/**
	 * 获取：会员类别
	 */
	public String getHuiyuanleibie() {
		return huiyuanleibie;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
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
				
	
	/**
	 * 设置：开通日期
	 */
	 
	public void setKaitongriqi(Date kaitongriqi) {
		this.kaitongriqi = kaitongriqi;
	}
	
	/**
	 * 获取：开通日期
	 */
	public Date getKaitongriqi() {
		return kaitongriqi;
	}
				
	
	/**
	 * 设置：到期日期
	 */
	 
	public void setDaoqiriqi(Date daoqiriqi) {
		this.daoqiriqi = daoqiriqi;
	}
	
	/**
	 * 获取：到期日期
	 */
	public Date getDaoqiriqi() {
		return daoqiriqi;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
