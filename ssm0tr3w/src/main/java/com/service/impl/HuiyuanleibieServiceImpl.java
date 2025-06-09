package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HuiyuanleibieDao;
import com.entity.HuiyuanleibieEntity;
import com.service.HuiyuanleibieService;
import com.entity.vo.HuiyuanleibieVO;
import com.entity.view.HuiyuanleibieView;

@Service("huiyuanleibieService")
public class HuiyuanleibieServiceImpl extends ServiceImpl<HuiyuanleibieDao, HuiyuanleibieEntity> implements HuiyuanleibieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanleibieEntity> page = this.selectPage(
                new Query<HuiyuanleibieEntity>(params).getPage(),
                new EntityWrapper<HuiyuanleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanleibieEntity> wrapper) {
		  Page<HuiyuanleibieView> page =new Query<HuiyuanleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanleibieVO> selectListVO(Wrapper<HuiyuanleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanleibieVO selectVO(Wrapper<HuiyuanleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanleibieView> selectListView(Wrapper<HuiyuanleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanleibieView selectView(Wrapper<HuiyuanleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
