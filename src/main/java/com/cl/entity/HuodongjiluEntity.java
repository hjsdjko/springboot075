package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 活动记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-02 20:23:44
 */
@TableName("huodongjilu")
public class HuodongjiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuodongjiluEntity() {
		
	}
	
	public HuodongjiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 活动名称
	 */
					
	private String huodongmingcheng;
	
	/**
	 * 活动地点
	 */
					
	private String huodongdidian;
	
	/**
	 * 报名时间
	 */
					
	private String baomingshijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 参与时长
	 */
					
	private String canyushizhang;
	
	/**
	 * 完成任务
	 */
					
	private String wanchengrenwu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：活动名称
	 */
	public void setHuodongmingcheng(String huodongmingcheng) {
		this.huodongmingcheng = huodongmingcheng;
	}
	/**
	 * 获取：活动名称
	 */
	public String getHuodongmingcheng() {
		return huodongmingcheng;
	}
	/**
	 * 设置：活动地点
	 */
	public void setHuodongdidian(String huodongdidian) {
		this.huodongdidian = huodongdidian;
	}
	/**
	 * 获取：活动地点
	 */
	public String getHuodongdidian() {
		return huodongdidian;
	}
	/**
	 * 设置：报名时间
	 */
	public void setBaomingshijian(String baomingshijian) {
		this.baomingshijian = baomingshijian;
	}
	/**
	 * 获取：报名时间
	 */
	public String getBaomingshijian() {
		return baomingshijian;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：参与时长
	 */
	public void setCanyushizhang(String canyushizhang) {
		this.canyushizhang = canyushizhang;
	}
	/**
	 * 获取：参与时长
	 */
	public String getCanyushizhang() {
		return canyushizhang;
	}
	/**
	 * 设置：完成任务
	 */
	public void setWanchengrenwu(String wanchengrenwu) {
		this.wanchengrenwu = wanchengrenwu;
	}
	/**
	 * 获取：完成任务
	 */
	public String getWanchengrenwu() {
		return wanchengrenwu;
	}

}
