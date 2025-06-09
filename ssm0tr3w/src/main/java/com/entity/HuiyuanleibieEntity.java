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
 * 会员类别
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
@TableName("huiyuanleibie")
public class HuiyuanleibieEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuanleibieEntity() {
		
	}
	
	public HuiyuanleibieEntity(T t) {
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
	 * 会员类别
	 */
					
	private String huiyuanleibie;
	
	/**
	 * 价格
	 */
					
	private Integer jiage;
	
	/**
	 * 有效时间
	 */
					
	private String youxiaoshijian;
	
	
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
