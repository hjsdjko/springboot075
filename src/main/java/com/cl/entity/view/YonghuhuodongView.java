package com.cl.entity.view;

import com.cl.entity.YonghuhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 用户活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-02 20:23:44
 */
@TableName("yonghuhuodong")
public class YonghuhuodongView  extends YonghuhuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuhuodongView(){
	}
 
 	public YonghuhuodongView(YonghuhuodongEntity yonghuhuodongEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuhuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
