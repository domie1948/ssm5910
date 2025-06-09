package com.dao;

import com.entity.YinletuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinletuijianVO;
import com.entity.view.YinletuijianView;


/**
 * 音乐推荐
 * 
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface YinletuijianDao extends BaseMapper<YinletuijianEntity> {
	
	List<YinletuijianVO> selectListVO(@Param("ew") Wrapper<YinletuijianEntity> wrapper);
	
	YinletuijianVO selectVO(@Param("ew") Wrapper<YinletuijianEntity> wrapper);
	
	List<YinletuijianView> selectListView(@Param("ew") Wrapper<YinletuijianEntity> wrapper);

	List<YinletuijianView> selectListView(Pagination page,@Param("ew") Wrapper<YinletuijianEntity> wrapper);
	
	YinletuijianView selectView(@Param("ew") Wrapper<YinletuijianEntity> wrapper);
	
}
