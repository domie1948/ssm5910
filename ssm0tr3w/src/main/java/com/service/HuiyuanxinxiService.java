package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanxinxiView;


/**
 * 会员信息
 *
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface HuiyuanxinxiService extends IService<HuiyuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanxinxiVO> selectListVO(Wrapper<HuiyuanxinxiEntity> wrapper);
   	
   	HuiyuanxinxiVO selectVO(@Param("ew") Wrapper<HuiyuanxinxiEntity> wrapper);
   	
   	List<HuiyuanxinxiView> selectListView(Wrapper<HuiyuanxinxiEntity> wrapper);
   	
   	HuiyuanxinxiView selectView(@Param("ew") Wrapper<HuiyuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanxinxiEntity> wrapper);
   	
}

