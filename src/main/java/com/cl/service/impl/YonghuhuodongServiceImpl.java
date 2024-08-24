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


import com.cl.dao.YonghuhuodongDao;
import com.cl.entity.YonghuhuodongEntity;
import com.cl.service.YonghuhuodongService;
import com.cl.entity.view.YonghuhuodongView;

@Service("yonghuhuodongService")
public class YonghuhuodongServiceImpl extends ServiceImpl<YonghuhuodongDao, YonghuhuodongEntity> implements YonghuhuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuhuodongEntity> page = this.selectPage(
                new Query<YonghuhuodongEntity>(params).getPage(),
                new EntityWrapper<YonghuhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuhuodongEntity> wrapper) {
		  Page<YonghuhuodongView> page =new Query<YonghuhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YonghuhuodongView> selectListView(Wrapper<YonghuhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuhuodongView selectView(Wrapper<YonghuhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YonghuhuodongEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YonghuhuodongEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YonghuhuodongEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
