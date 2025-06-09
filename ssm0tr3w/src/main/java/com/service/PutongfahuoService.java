package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PutongfahuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PutongfahuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PutongfahuoView;


/**
 * 普通发货
 *
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface PutongfahuoService extends IService<PutongfahuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PutongfahuoVO> selectListVO(Wrapper<PutongfahuoEntity> wrapper);
   	
   	PutongfahuoVO selectVO(@Param("ew") Wrapper<PutongfahuoEntity> wrapper);
   	
   	List<PutongfahuoView> selectListView(Wrapper<PutongfahuoEntity> wrapper);
   	
   	PutongfahuoView selectView(@Param("ew") Wrapper<PutongfahuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PutongfahuoEntity> wrapper);
   	
}

