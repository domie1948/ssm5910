package com.dao;

import com.entity.HuiyuanleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanleibieVO;
import com.entity.view.HuiyuanleibieView;


/**
 * 会员类别
 * 
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface HuiyuanleibieDao extends BaseMapper<HuiyuanleibieEntity> {
	
	List<HuiyuanleibieVO> selectListVO(@Param("ew") Wrapper<HuiyuanleibieEntity> wrapper);
	
	HuiyuanleibieVO selectVO(@Param("ew") Wrapper<HuiyuanleibieEntity> wrapper);
	
	List<HuiyuanleibieView> selectListView(@Param("ew") Wrapper<HuiyuanleibieEntity> wrapper);

	List<HuiyuanleibieView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanleibieEntity> wrapper);
	
	HuiyuanleibieView selectView(@Param("ew") Wrapper<HuiyuanleibieEntity> wrapper);
	
}
