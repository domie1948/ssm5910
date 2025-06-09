package com.dao;

import com.entity.HuiyuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanxinxiVO;
import com.entity.view.HuiyuanxinxiView;


/**
 * 会员信息
 * 
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface HuiyuanxinxiDao extends BaseMapper<HuiyuanxinxiEntity> {
	
	List<HuiyuanxinxiVO> selectListVO(@Param("ew") Wrapper<HuiyuanxinxiEntity> wrapper);
	
	HuiyuanxinxiVO selectVO(@Param("ew") Wrapper<HuiyuanxinxiEntity> wrapper);
	
	List<HuiyuanxinxiView> selectListView(@Param("ew") Wrapper<HuiyuanxinxiEntity> wrapper);

	List<HuiyuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanxinxiEntity> wrapper);
	
	HuiyuanxinxiView selectView(@Param("ew") Wrapper<HuiyuanxinxiEntity> wrapper);
	
}
