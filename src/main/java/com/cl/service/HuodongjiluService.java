package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.HuodongjiluEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.HuodongjiluView;


/**
 * 活动记录
 *
 * @author 
 * @email 
 * @date 2024-04-02 20:23:44
 */
public interface HuodongjiluService extends IService<HuodongjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongjiluView> selectListView(Wrapper<HuodongjiluEntity> wrapper);
   	
   	HuodongjiluView selectView(@Param("ew") Wrapper<HuodongjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongjiluEntity> wrapper);
   	

}

