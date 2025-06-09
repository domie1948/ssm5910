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


import com.dao.YinletuijianDao;
import com.entity.YinletuijianEntity;
import com.service.YinletuijianService;
import com.entity.vo.YinletuijianVO;
import com.entity.view.YinletuijianView;

@Service("yinletuijianService")
public class YinletuijianServiceImpl extends ServiceImpl<YinletuijianDao, YinletuijianEntity> implements YinletuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinletuijianEntity> page = this.selectPage(
                new Query<YinletuijianEntity>(params).getPage(),
                new EntityWrapper<YinletuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinletuijianEntity> wrapper) {
		  Page<YinletuijianView> page =new Query<YinletuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinletuijianVO> selectListVO(Wrapper<YinletuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinletuijianVO selectVO(Wrapper<YinletuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinletuijianView> selectListView(Wrapper<YinletuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinletuijianView selectView(Wrapper<YinletuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
