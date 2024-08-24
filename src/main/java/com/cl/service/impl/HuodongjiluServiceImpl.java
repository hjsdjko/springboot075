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


import com.cl.dao.HuodongjiluDao;
import com.cl.entity.HuodongjiluEntity;
import com.cl.service.HuodongjiluService;
import com.cl.entity.view.HuodongjiluView;

@Service("huodongjiluService")
public class HuodongjiluServiceImpl extends ServiceImpl<HuodongjiluDao, HuodongjiluEntity> implements HuodongjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongjiluEntity> page = this.selectPage(
                new Query<HuodongjiluEntity>(params).getPage(),
                new EntityWrapper<HuodongjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongjiluEntity> wrapper) {
		  Page<HuodongjiluView> page =new Query<HuodongjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<HuodongjiluView> selectListView(Wrapper<HuodongjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongjiluView selectView(Wrapper<HuodongjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
