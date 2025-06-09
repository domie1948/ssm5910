package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanleibieView;


/**
 * 会员类别
 *
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface HuiyuanleibieService extends IService<HuiyuanleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanleibieVO> selectListVO(Wrapper<HuiyuanleibieEntity> wrapper);
   	
   	HuiyuanleibieVO selectVO(@Param("ew") Wrapper<HuiyuanleibieEntity> wrapper);
   	
   	List<HuiyuanleibieView> selectListView(Wrapper<HuiyuanleibieEntity> wrapper);
   	
   	HuiyuanleibieView selectView(@Param("ew") Wrapper<HuiyuanleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanleibieEntity> wrapper);
   	
}

