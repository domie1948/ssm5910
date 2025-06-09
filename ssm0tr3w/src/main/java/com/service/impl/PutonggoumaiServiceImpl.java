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


import com.dao.PutonggoumaiDao;
import com.entity.PutonggoumaiEntity;
import com.service.PutonggoumaiService;
import com.entity.vo.PutonggoumaiVO;
import com.entity.view.PutonggoumaiView;

@Service("putonggoumaiService")
public class PutonggoumaiServiceImpl extends ServiceImpl<PutonggoumaiDao, PutonggoumaiEntity> implements PutonggoumaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PutonggoumaiEntity> page = this.selectPage(
                new Query<PutonggoumaiEntity>(params).getPage(),
                new EntityWrapper<PutonggoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PutonggoumaiEntity> wrapper) {
		  Page<PutonggoumaiView> page =new Query<PutonggoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PutonggoumaiVO> selectListVO(Wrapper<PutonggoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PutonggoumaiVO selectVO(Wrapper<PutonggoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PutonggoumaiView> selectListView(Wrapper<PutonggoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PutonggoumaiView selectView(Wrapper<PutonggoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
