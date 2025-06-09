package com.entity.view;

import com.entity.HuiyuanleibieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员类别
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
@TableName("huiyuanleibie")
public class HuiyuanleibieView  extends HuiyuanleibieEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanleibieView(){
	}
 
 	public HuiyuanleibieView(HuiyuanleibieEntity huiyuanleibieEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanleibieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
