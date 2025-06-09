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


import com.dao.HuiyuanfahuoDao;
import com.entity.HuiyuanfahuoEntity;
import com.service.HuiyuanfahuoService;
import com.entity.vo.HuiyuanfahuoVO;
import com.entity.view.HuiyuanfahuoView;

@Service("huiyuanfahuoService")
public class HuiyuanfahuoServiceImpl extends ServiceImpl<HuiyuanfahuoDao, HuiyuanfahuoEntity> implements HuiyuanfahuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanfahuoEntity> page = this.selectPage(
                new Query<HuiyuanfahuoEntity>(params).getPage(),
                new EntityWrapper<HuiyuanfahuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanfahuoEntity> wrapper) {
		  Page<HuiyuanfahuoView> page =new Query<HuiyuanfahuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanfahuoVO> selectListVO(Wrapper<HuiyuanfahuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanfahuoVO selectVO(Wrapper<HuiyuanfahuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanfahuoView> selectListView(Wrapper<HuiyuanfahuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanfahuoView selectView(Wrapper<HuiyuanfahuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
