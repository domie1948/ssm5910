package com.entity.view;

import com.entity.YinletuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 音乐推荐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
@TableName("yinletuijian")
public class YinletuijianView  extends YinletuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinletuijianView(){
	}
 
 	public YinletuijianView(YinletuijianEntity yinletuijianEntity){
 	try {
			BeanUtils.copyProperties(this, yinletuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
