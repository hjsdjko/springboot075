package com.cl.dao;

import com.cl.entity.YonghuhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YonghuhuodongView;


/**
 * 用户活动
 * 
 * @author 
 * @email 
 * @date 2024-04-02 20:23:44
 */
public interface YonghuhuodongDao extends BaseMapper<YonghuhuodongEntity> {
	
	List<YonghuhuodongView> selectListView(@Param("ew") Wrapper<YonghuhuodongEntity> wrapper);

	List<YonghuhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuhuodongEntity> wrapper);
	
	YonghuhuodongView selectView(@Param("ew") Wrapper<YonghuhuodongEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YonghuhuodongEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YonghuhuodongEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YonghuhuodongEntity> wrapper);



}
