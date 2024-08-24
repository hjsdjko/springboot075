package com.cl.entity.view;

import com.cl.entity.DiscusshuodongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 活动信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-02 20:23:45
 */
@TableName("discusshuodongxinxi")
public class DiscusshuodongxinxiView  extends DiscusshuodongxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusshuodongxinxiView(){
	}
 
 	public DiscusshuodongxinxiView(DiscusshuodongxinxiEntity discusshuodongxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusshuodongxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}