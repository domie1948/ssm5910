package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanfahuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanfahuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanfahuoView;


/**
 * 会员发货
 *
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
public interface HuiyuanfahuoService extends IService<HuiyuanfahuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanfahuoVO> selectListVO(Wrapper<HuiyuanfahuoEntity> wrapper);
   	
   	HuiyuanfahuoVO selectVO(@Param("ew") Wrapper<HuiyuanfahuoEntity> wrapper);
   	
   	List<HuiyuanfahuoView> selectListView(Wrapper<HuiyuanfahuoEntity> wrapper);
   	
   	HuiyuanfahuoView selectView(@Param("ew") Wrapper<HuiyuanfahuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanfahuoEntity> wrapper);
   	
}

