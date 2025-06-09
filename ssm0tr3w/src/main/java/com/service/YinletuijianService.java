package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YinletuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YinletuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YinletuijianView;


/**
 * 音乐推荐
 *
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface YinletuijianService extends IService<YinletuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YinletuijianVO> selectListVO(Wrapper<YinletuijianEntity> wrapper);
   	
   	YinletuijianVO selectVO(@Param("ew") Wrapper<YinletuijianEntity> wrapper);
   	
   	List<YinletuijianView> selectListView(Wrapper<YinletuijianEntity> wrapper);
   	
   	YinletuijianView selectView(@Param("ew") Wrapper<YinletuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YinletuijianEntity> wrapper);
   	
}

