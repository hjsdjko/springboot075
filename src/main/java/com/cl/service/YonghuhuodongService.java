package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YonghuhuodongEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YonghuhuodongView;


/**
 * 用户活动
 *
 * @author 
 * @email 
 * @date 2024-04-02 20:23:44
 */
public interface YonghuhuodongService extends IService<YonghuhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuhuodongView> selectListView(Wrapper<YonghuhuodongEntity> wrapper);
   	
   	YonghuhuodongView selectView(@Param("ew") Wrapper<YonghuhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuhuodongEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YonghuhuodongEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YonghuhuodongEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YonghuhuodongEntity> wrapper);



}

