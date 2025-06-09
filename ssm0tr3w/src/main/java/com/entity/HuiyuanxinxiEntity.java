package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 会员信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
@TableName("huiyuanxinxi")
public class HuiyuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuanxinxiEntity() {
		
	}
	
	public HuiyuanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaitongriqi;
	
	/**
	 * 到期日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date daoqiriqi;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
