package com.dao;

import com.entity.PutonggoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PutonggoumaiVO;
import com.entity.view.PutonggoumaiView;


/**
 * 普通购买
 * 
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface PutonggoumaiDao extends BaseMapper<PutonggoumaiEntity> {
	
	List<PutonggoumaiVO> selectListVO(@Param("ew") Wrapper<PutonggoumaiEntity> wrapper);
	
	PutonggoumaiVO selectVO(@Param("ew") Wrapper<PutonggoumaiEntity> wrapper);
	
	List<PutonggoumaiView> selectListView(@Param("ew") Wrapper<PutonggoumaiEntity> wrapper);

	List<PutonggoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<PutonggoumaiEntity> wrapper);
	
	PutonggoumaiView selectView(@Param("ew") Wrapper<PutonggoumaiEntity> wrapper);
	
}
