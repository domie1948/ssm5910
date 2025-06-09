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


import com.dao.HuiyuanxinxiDao;
import com.entity.HuiyuanxinxiEntity;
import com.service.HuiyuanxinxiService;
import com.entity.vo.HuiyuanxinxiVO;
import com.entity.view.HuiyuanxinxiView;

@Service("huiyuanxinxiService")
public class HuiyuanxinxiServiceImpl extends ServiceImpl<HuiyuanxinxiDao, HuiyuanxinxiEntity> implements HuiyuanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanxinxiEntity> page = this.selectPage(
                new Query<HuiyuanxinxiEntity>(params).getPage(),
                new EntityWrapper<HuiyuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanxinxiEntity> wrapper) {
		  Page<HuiyuanxinxiView> page =new Query<HuiyuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanxinxiVO> selectListVO(Wrapper<HuiyuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanxinxiVO selectVO(Wrapper<HuiyuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanxinxiView> selectListView(Wrapper<HuiyuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanxinxiView selectView(Wrapper<HuiyuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
