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
 * 音乐推荐
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
@TableName("yinletuijian")
public class YinletuijianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YinletuijianEntity() {
		
	}
	
	public YinletuijianEntity(T t) {
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
	 * 歌名
	 */
					
	private String geming;
	
	/**
	 * 分类
	 */
					
	private String fenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 歌手
	 */
					
	private String geshou;
	
	/**
	 * 专辑
	 */
					
	private String zhuanji;
	
	/**
	 * 试听
	 */
					
	private String shiting;
	
	/**
	 * 歌词
	 */
					
	private String geci;
	
	/**
	 * 发行日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faxingriqi;
	
	/**
	 * 榜单排行
	 */
					
	private String bangdanpaixing;
	
	
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
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	 * 设置：专辑
	 */
	public void setZhuanji(String zhuanji) {
		this.zhuanji = zhuanji;
	}
	/**
	 * 获取：专辑
	 */
	public String getZhuanji() {
		return zhuanji;
	}
	/**
	 * 设置：试听
	 */
	public void setShiting(String shiting) {
		this.shiting = shiting;
	}
	/**
	 * 获取：试听
	 */
	public String getShiting() {
		return shiting;
	}
	/**
	 * 设置：歌词
	 */
	public void setGeci(String geci) {
		this.geci = geci;
	}
	/**
	 * 获取：歌词
	 */
	public String getGeci() {
		return geci;
	}
	/**
	 * 设置：发行日期
	 */
	public void setFaxingriqi(Date faxingriqi) {
		this.faxingriqi = faxingriqi;
	}
	/**
	 * 获取：发行日期
	 */
	public Date getFaxingriqi() {
		return faxingriqi;
	}
	/**
	 * 设置：榜单排行
	 */
	public void setBangdanpaixing(String bangdanpaixing) {
		this.bangdanpaixing = bangdanpaixing;
	}
	/**
	 * 获取：榜单排行
	 */
	public String getBangdanpaixing() {
		return bangdanpaixing;
	}

}
