package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.HuodongleixingDao;
import com.cl.entity.HuodongleixingEntity;
import com.cl.service.HuodongleixingService;
import com.cl.entity.view.HuodongleixingView;

@Service("huodongleixingService")
public class HuodongleixingServiceImpl extends ServiceImpl<HuodongleixingDao, HuodongleixingEntity> implements HuodongleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongleixingEntity> page = this.selectPage(
                new Query<HuodongleixingEntity>(params).getPage(),
                new EntityWrapper<HuodongleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongleixingEntity> wrapper) {
		  Page<HuodongleixingView> page =new Query<HuodongleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<HuodongleixingView> selectListView(Wrapper<HuodongleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongleixingView selectView(Wrapper<HuodongleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
