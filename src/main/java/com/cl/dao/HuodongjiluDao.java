package com.cl.dao;

import com.cl.entity.HuodongjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuodongjiluView;


/**
 * 活动记录
 * 
 * @author 
 * @email 
 * @date 2024-04-02 20:23:44
 */
public interface HuodongjiluDao extends BaseMapper<HuodongjiluEntity> {
	
	List<HuodongjiluView> selectListView(@Param("ew") Wrapper<HuodongjiluEntity> wrapper);

	List<HuodongjiluView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongjiluEntity> wrapper);
	
	HuodongjiluView selectView(@Param("ew") Wrapper<HuodongjiluEntity> wrapper);
	

}
