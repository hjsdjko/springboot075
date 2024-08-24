package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.HuodongjiluEntity;
import com.cl.entity.view.HuodongjiluView;

import com.cl.service.HuodongjiluService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 活动记录
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-02 20:23:44
 */
@RestController
@RequestMapping("/huodongjilu")
public class HuodongjiluController {
    @Autowired
    private HuodongjiluService huodongjiluService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuodongjiluEntity huodongjilu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanzhe")) {
			huodongjilu.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HuodongjiluEntity> ew = new EntityWrapper<HuodongjiluEntity>();

		PageUtils page = huodongjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongjilu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuodongjiluEntity huodongjilu, 
		HttpServletRequest request){
        EntityWrapper<HuodongjiluEntity> ew = new EntityWrapper<HuodongjiluEntity>();

		PageUtils page = huodongjiluService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongjilu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuodongjiluEntity huodongjilu){
       	EntityWrapper<HuodongjiluEntity> ew = new EntityWrapper<HuodongjiluEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huodongjilu, "huodongjilu")); 
        return R.ok().put("data", huodongjiluService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuodongjiluEntity huodongjilu){
        EntityWrapper< HuodongjiluEntity> ew = new EntityWrapper< HuodongjiluEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huodongjilu, "huodongjilu")); 
		HuodongjiluView huodongjiluView =  huodongjiluService.selectView(ew);
		return R.ok("查询活动记录成功").put("data", huodongjiluView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuodongjiluEntity huodongjilu = huodongjiluService.selectById(id);
		huodongjilu = huodongjiluService.selectView(new EntityWrapper<HuodongjiluEntity>().eq("id", id));
        return R.ok().put("data", huodongjilu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuodongjiluEntity huodongjilu = huodongjiluService.selectById(id);
		huodongjilu = huodongjiluService.selectView(new EntityWrapper<HuodongjiluEntity>().eq("id", id));
        return R.ok().put("data", huodongjilu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuodongjiluEntity huodongjilu, HttpServletRequest request){
    	huodongjilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huodongjilu);
        huodongjiluService.insert(huodongjilu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuodongjiluEntity huodongjilu, HttpServletRequest request){
    	huodongjilu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(huodongjilu);
        huodongjiluService.insert(huodongjilu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuodongjiluEntity huodongjilu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huodongjilu);
        huodongjiluService.updateById(huodongjilu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huodongjiluService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
