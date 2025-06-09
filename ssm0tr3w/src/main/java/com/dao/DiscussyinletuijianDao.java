package com.dao;

import com.entity.DiscussyinletuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyinletuijianVO;
import com.entity.view.DiscussyinletuijianView;


/**
 * 音乐推荐评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface DiscussyinletuijianDao extends BaseMapper<DiscussyinletuijianEntity> {
	
	List<DiscussyinletuijianVO> selectListVO(@Param("ew") Wrapper<DiscussyinletuijianEntity> wrapper);
	
	DiscussyinletuijianVO selectVO(@Param("ew") Wrapper<DiscussyinletuijianEntity> wrapper);
	
	List<DiscussyinletuijianView> selectListView(@Param("ew") Wrapper<DiscussyinletuijianEntity> wrapper);

	List<DiscussyinletuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyinletuijianEntity> wrapper);
	
	DiscussyinletuijianView selectView(@Param("ew") Wrapper<DiscussyinletuijianEntity> wrapper);
	
}
