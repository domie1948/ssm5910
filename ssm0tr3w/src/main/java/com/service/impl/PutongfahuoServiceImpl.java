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


import com.dao.PutongfahuoDao;
import com.entity.PutongfahuoEntity;
import com.service.PutongfahuoService;
import com.entity.vo.PutongfahuoVO;
import com.entity.view.PutongfahuoView;

@Service("putongfahuoService")
public class PutongfahuoServiceImpl extends ServiceImpl<PutongfahuoDao, PutongfahuoEntity> implements PutongfahuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PutongfahuoEntity> page = this.selectPage(
                new Query<PutongfahuoEntity>(params).getPage(),
                new EntityWrapper<PutongfahuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PutongfahuoEntity> wrapper) {
		  Page<PutongfahuoView> page =new Query<PutongfahuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PutongfahuoVO> selectListVO(Wrapper<PutongfahuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PutongfahuoVO selectVO(Wrapper<PutongfahuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PutongfahuoView> selectListView(Wrapper<PutongfahuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PutongfahuoView selectView(Wrapper<PutongfahuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
