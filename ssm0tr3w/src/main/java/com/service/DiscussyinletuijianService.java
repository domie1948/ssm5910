package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyinletuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyinletuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyinletuijianView;


/**
 * 音乐推荐评论表
 *
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface DiscussyinletuijianService extends IService<DiscussyinletuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyinletuijianVO> selectListVO(Wrapper<DiscussyinletuijianEntity> wrapper);
   	
   	DiscussyinletuijianVO selectVO(@Param("ew") Wrapper<DiscussyinletuijianEntity> wrapper);
   	
   	List<DiscussyinletuijianView> selectListView(Wrapper<DiscussyinletuijianEntity> wrapper);
   	
   	DiscussyinletuijianView selectView(@Param("ew") Wrapper<DiscussyinletuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyinletuijianEntity> wrapper);
   	
}

