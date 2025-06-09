package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PutonggoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PutonggoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PutonggoumaiView;


/**
 * 普通购买
 *
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface PutonggoumaiService extends IService<PutonggoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PutonggoumaiVO> selectListVO(Wrapper<PutonggoumaiEntity> wrapper);
   	
   	PutonggoumaiVO selectVO(@Param("ew") Wrapper<PutonggoumaiEntity> wrapper);
   	
   	List<PutonggoumaiView> selectListView(Wrapper<PutonggoumaiEntity> wrapper);
   	
   	PutonggoumaiView selectView(@Param("ew") Wrapper<PutonggoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PutonggoumaiEntity> wrapper);
   	
}

