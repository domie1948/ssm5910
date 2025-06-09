package com.dao;

import com.entity.PutongfahuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PutongfahuoVO;
import com.entity.view.PutongfahuoView;


/**
 * 普通发货
 * 
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface PutongfahuoDao extends BaseMapper<PutongfahuoEntity> {
	
	List<PutongfahuoVO> selectListVO(@Param("ew") Wrapper<PutongfahuoEntity> wrapper);
	
	PutongfahuoVO selectVO(@Param("ew") Wrapper<PutongfahuoEntity> wrapper);
	
	List<PutongfahuoView> selectListView(@Param("ew") Wrapper<PutongfahuoEntity> wrapper);

	List<PutongfahuoView> selectListView(Pagination page,@Param("ew") Wrapper<PutongfahuoEntity> wrapper);
	
	PutongfahuoView selectView(@Param("ew") Wrapper<PutongfahuoEntity> wrapper);
	
}
