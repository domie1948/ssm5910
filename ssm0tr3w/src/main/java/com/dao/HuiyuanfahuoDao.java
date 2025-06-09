package com.dao;

import com.entity.HuiyuanfahuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanfahuoVO;
import com.entity.view.HuiyuanfahuoView;


/**
 * 会员发货
 * 
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface HuiyuanfahuoDao extends BaseMapper<HuiyuanfahuoEntity> {
	
	List<HuiyuanfahuoVO> selectListVO(@Param("ew") Wrapper<HuiyuanfahuoEntity> wrapper);
	
	HuiyuanfahuoVO selectVO(@Param("ew") Wrapper<HuiyuanfahuoEntity> wrapper);
	
	List<HuiyuanfahuoView> selectListView(@Param("ew") Wrapper<HuiyuanfahuoEntity> wrapper);

	List<HuiyuanfahuoView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanfahuoEntity> wrapper);
	
	HuiyuanfahuoView selectView(@Param("ew") Wrapper<HuiyuanfahuoEntity> wrapper);
	
}
