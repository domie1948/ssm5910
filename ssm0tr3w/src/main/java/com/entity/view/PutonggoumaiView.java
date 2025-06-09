package com.entity.view;

import com.entity.PutonggoumaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 普通购买
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
@TableName("putonggoumai")
public class PutonggoumaiView  extends PutonggoumaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PutonggoumaiView(){
	}
 
 	public PutonggoumaiView(PutonggoumaiEntity putonggoumaiEntity){
 	try {
			BeanUtils.copyProperties(this, putonggoumaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
