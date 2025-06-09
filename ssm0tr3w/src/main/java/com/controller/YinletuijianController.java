package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YinletuijianEntity;
import com.entity.view.YinletuijianView;

import com.service.YinletuijianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 音乐推荐
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-31 08:52:14
 */
@RestController
@RequestMapping("/yinletuijian")
public class YinletuijianController {
    @Autowired
    private YinletuijianService yinletuijianService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YinletuijianEntity yinletuijian, HttpServletRequest request){

        EntityWrapper<YinletuijianEntity> ew = new EntityWrapper<YinletuijianEntity>();
		PageUtils page = yinletuijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinletuijian), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YinletuijianEntity yinletuijian, HttpServletRequest request){
        EntityWrapper<YinletuijianEntity> ew = new EntityWrapper<YinletuijianEntity>();
		PageUtils page = yinletuijianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yinletuijian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YinletuijianEntity yinletuijian){
       	EntityWrapper<YinletuijianEntity> ew = new EntityWrapper<YinletuijianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yinletuijian, "yinletuijian")); 
        return R.ok().put("data", yinletuijianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YinletuijianEntity yinletuijian){
        EntityWrapper< YinletuijianEntity> ew = new EntityWrapper< YinletuijianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yinletuijian, "yinletuijian")); 
		YinletuijianView yinletuijianView =  yinletuijianService.selectView(ew);
		return R.ok("查询音乐推荐成功").put("data", yinletuijianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        YinletuijianEntity yinletuijian = yinletuijianService.selectById(id);
        return R.ok().put("data", yinletuijian);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        YinletuijianEntity yinletuijian = yinletuijianService.selectById(id);
        return R.ok().put("data", yinletuijian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YinletuijianEntity yinletuijian, HttpServletRequest request){
    	yinletuijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinletuijian);

        yinletuijianService.insert(yinletuijian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YinletuijianEntity yinletuijian, HttpServletRequest request){
    	yinletuijian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yinletuijian);

        yinletuijianService.insert(yinletuijian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YinletuijianEntity yinletuijian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yinletuijian);
        yinletuijianService.updateById(yinletuijian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yinletuijianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YinletuijianEntity> wrapper = new EntityWrapper<YinletuijianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yinletuijianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
